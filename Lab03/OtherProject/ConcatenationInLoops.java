package OtherProject;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Phần sử dụng StringBuilder trước
        Random randomGenerator = new Random(123);
        long timeStart = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();

        for (int index = 0; index < 65536; index++) {
            builder.append(randomGenerator.nextInt(2));
        }

        String result = builder.toString();
        System.out.println(System.currentTimeMillis() - timeStart); // In ra khoảng 5

        // Phần sử dụng String sau
        randomGenerator = new Random(123);
        timeStart = System.currentTimeMillis();
        String concatResult = "";

        for (int counter = 0; counter < 65536; counter++) {
            concatResult = concatResult + randomGenerator.nextInt(2);
        }

        System.out.println(System.currentTimeMillis() - timeStart); // In ra khoảng 4500
    }
}
