import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
public class FileCopySync {
    public static void main(String[] args) {
        Path source = Path.of("src/sync");
        Path destination = Path.of("src/sync_copy");
        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл успешно скопирован с использованием синхронного метода.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}