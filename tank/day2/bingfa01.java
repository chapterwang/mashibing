package day2;

import java.util.concurrent.TimeUnit;

public class bingfa01 {
    public static class T1 extends Thread{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }

        }
    }

    public static void main(String[] args) {
        new T1().run();
        for (int i=0;i<10;i++){
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}
