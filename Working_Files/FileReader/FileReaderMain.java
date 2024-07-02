package Working_Files.FileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) {

        String lines[] = new String[] { "Good Morning", "Good Afternoon", "Good Night" };

        String path = "C:\\Users\\n" + //
                "obre\\OneDrive\\Área de Trabalho\\ws-udemy\\Working_Files\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
