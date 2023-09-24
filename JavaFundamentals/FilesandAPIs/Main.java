package JavaFundamentals.FilesandAPIs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("E:\\Alberth Properties\\Programming\\learn-java-2023\\JavaFundamentals\\FilesandAPIs\\readme.txt");
        System.out.println(path);

        // How to check if a file exists
        boolean exists = Files.exists(path);
        System.out.println(exists);

        // How to get the last modified date of a file
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        System.out.println("lastModifiedTime = " + lastModifiedTime);

        // How to get the owner of a file
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner = " + owner);

        // How to create temp files
        Path createTempFile = Files.createTempFile("createdTempFile", ".txt");
        System.out.println("createTempFile = " + createTempFile);

        // parent location
        Path createTempFileInParent = Files.createTempFile(path.getParent(), "createTempFileInParent", ".txt");
        System.out.println("createTempFileInParent = " + createTempFileInParent);
    }
}
