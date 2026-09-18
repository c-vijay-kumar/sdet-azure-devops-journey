package Day07;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class filehandling {
    public static void main(String[] args) throws java.io.IOException {
        Path path=Path.of("vijay.txt");
        if (!Files.exists(path)) {

        Files.createFile(path);
        }

        Files.writeString(path,"this is text file created through java" );
        System.out.println(Files.readString(path));
    }
}
