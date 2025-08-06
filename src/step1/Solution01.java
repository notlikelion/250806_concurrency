package step1;

import java.util.Random;

public class Solution01 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 3; i++) {
//            System.out.println("%d회차".formatted(i + 1));
//            randomWork();
//        }
        Runnable task = () -> {
            randomWork();
        };
//        Runnable task = Solution01::randomWork;
        for (int i = 0; i < 3; i++) {
            new Thread(task, "Worker-%d".formatted(i + 1)).start();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void randomWork() {
        System.out.println("작업 시작");
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
        System.out.println("작업 종료");
    }
}
