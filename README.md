Description: I am configuring a Java application to upload files to Google Drive using the Google Drive API. I have followed the steps to set up the project in the Google Cloud Console and implemented the provided code. If anyone is facing similar issues or needs guidance with configuring and integrating the code, feel free to check out the code and provide any insights or recommendations.

Followage the next instruction´s:

Google Cloud Console:

Login in Google Cloud Console.
Create new project.
Enabled API Google Drive.
Download the user credentials in format json.
Configure Test User (add email user).
Code in JAVA:

Create class : GoogleDriveBackup



        private static final String APPLICATION_NAME = "Google Drive API Java Quickstart";
        private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance()
        private static final java.io.File CREDENTIALS_FOLDER = new java.io.File(System.getProperty("user.home"), "credentials");
        private static final String CLIENT_SECRET_FILE_PATH = "/Resources/credentials.json";
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
    
    public static void clearCredentials() {
    java.io.File tokenDirectory = new java.io.File(CREDENTIALS_FOLDER, "StoredCredential");
    if (tokenDirectory.exists()) {
        tokenDirectory.delete();
    }
        }        
        }
Apply configurations and create instance the class GoogleDriveBackup for exampe in button action

