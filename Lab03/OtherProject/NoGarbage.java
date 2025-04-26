package OtherProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String pathToFile = "OtherProject/test.txt";
        byte[] dataBytes;
        long begin, finish;

        dataBytes = Files.readAllBytes(Paths.get(pathToFile));
        StringBuilder textBuilder = new StringBuilder();
        begin = System.currentTimeMillis();

        for (byte value : dataBytes) {
            textBuilder.append((char) value);
        }

        finish = System.currentTimeMillis();
        System.out.println(finish - begin);
    }
}
