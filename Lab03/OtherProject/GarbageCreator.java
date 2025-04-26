package OtherProject;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Đoạn sử dụng StringBuilder đưa lên trước
        Random generator = new Random(123);
        long beginTime = System.currentTimeMillis();
        StringBuilder resultBuilder = new StringBuilder();

        for (int count = 0; count < 65536; count++) {
            resultBuilder.append(generator.nextInt(2));
        }

        String finalResult = resultBuilder.toString();
        System.out.println(System.currentTimeMillis() - beginTime); // In ra khoảng 5

        // Đoạn sử dụng String đưa xuống dưới
        generator = new Random(123);
        beginTime = System.currentTimeMillis();
        String concatString = "";

        for (int index = 0; index < 65536; index++) {
            concatString += generator.nextInt(2);
        }

        System.out.println(System.currentTimeMillis() - beginTime); // In ra khoảng 4500
    }
}
