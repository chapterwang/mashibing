package day2;

/**
 * 构建线程的方法
 * 1.继承thread 重写run方法
 * 2.实现Runnable接口
 * 3.从线程池创建线程
 */
public class bingfa02 {
    public static class Mythread extends Thread{
        @Override
        public void run() {
            System.out.println("Mythread");
        }
    }
    public static class Myrun implements Runnable{
        @Override
        public void run() {
            System.out.println("Myrun");
        }
    }

    public static void main(String[] args) {
        new Mythread().run();
        new Myrun().run();
        new Thread(()->{System.out.println("lamda");}).run();
    }
}
