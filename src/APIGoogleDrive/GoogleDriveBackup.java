package APIGoogleDrive;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import java.util.Collections;
import java.util.List;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GoogleDriveBackup {
    private static final String APPLICATION_NAME = "Google Drive API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance(); // Utiliza GsonFactory
    private static final java.io.File CREDENTIALS_FOLDER = new java.io.File(System.getProperty("user.home"), "credentials");
    private static final String CLIENT_SECRET_FILE_PATH = "/Resources/credentials.json"; // Ruta al archivo de credenciales
    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE_FILE);
    
    public static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        InputStream in = GoogleDriveBackup.class.getResourceAsStream(CLIENT_SECRET_FILE_PATH);
        if (in == null) {
            throw new IOException("File not found: " + CLIENT_SECRET_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(CREDENTIALS_FOLDER))
                .setAccessType("offline")
                .build();

        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }
    
    public static void uploadFile(Drive service, java.io.File filePath, String mimeType) throws IOException, URISyntaxException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss");
        String formattedDate = now.format(formatter);
        File fileMetadata = new File();
       
        fileMetadata.setTitle("Backup Base de datos_"+formattedDate);

        FileContent mediaContent = new FileContent(mimeType, filePath);
        File file = service.files().insert(fileMetadata, mediaContent).execute();
        String fileUrl = "https://drive.google.com/file/d/" + file.getId() + "/view";
    
    // Abrir la URL en el navegador predeterminado
      if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
         Desktop.getDesktop().browse(new URI(fileUrl));
     } else {
          System.out.println("No se puede abrir el navegador.");
    }
    }
    
    public void backupDatabase() throws IOException, GeneralSecurityException, URISyntaxException {
        clearCredentials();

        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Drive service = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();

        java.io.File filePath = createTestFile();
        uploadFile(service, filePath, "text/plain");
    }

    private java.io.File createTestFile() throws IOException {
        java.io.File tempFile = java.io.File.createTempFile("testFile", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Este es un archivo de prueba para subir a Google Drive.");
        }
        return tempFile;
    }
    
    public static void clearCredentials() {
    java.io.File tokenDirectory = new java.io.File(CREDENTIALS_FOLDER, "StoredCredential");
    if (tokenDirectory.exists()) {
        tokenDirectory.delete();
    }
}
}
