package step1;

import java.util.Random;

public class Solution01 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 3; i++) {
            System.out.println("%d회차".formatted(i + 1));
            randomWork();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void randomWork() {
        Random random = new Random();
        // 로직
        // 프로세스 - 스레드
        try {
            Thread.sleep(random.nextInt(1000, 5000));
            // 현재 실행하고 있는 스레드 대기시킴
            // 1000ms ~ 4999ms
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
