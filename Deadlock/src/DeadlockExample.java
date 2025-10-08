class Resource {
    void method(Resource r) {
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " acquired " + this);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized(r) {
                System.out.println(Thread.currentThread().getName() + " acquired " + r);
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.method(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.method(r1), "Thread-2");

        t1.start();
        t2.start();

        // Another Way


        final Object o1 = new Object();
        final Object o2 = new Object();

        Thread thread1 = new Thread(() ->{
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() +" acquire resource o1");
                try{
                    Thread.sleep(20000);
                }catch (InterruptedException e){
                    System.out.println("InterruptedException error occurred");
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() +" acquire resource o2");
                }
            }

        });

        Thread thread2 = new Thread(() -> {
           synchronized (o2){
               System.out.println(Thread.currentThread().getName() + " acquire resource o2");
               try{
                   Thread.sleep(20000);
               }catch (InterruptedException e){
                   System.out.println("InterruptedException exception occurred");
               }
               synchronized (o1){
                   System.out.println(Thread.currentThread().getName() + " acquire resource o1");
               }
           }
        });

        thread1.start();
        thread2.start();


        // solution

        // 1. Always lock in the same order. Ensure all threads acquire locks in a consistent order.

        Thread thread3 = new Thread(() ->{
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() +" acquire resource o1");
                try{
                    Thread.sleep(20000);
                }catch (InterruptedException e){
                    System.out.println("InterruptedException error occurred");
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() +" acquire resource o2");
                }
            }

        });

        Thread thread4 = new Thread(() -> {
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + " acquire resource o2");
                try{
                    Thread.sleep(20000);
                }catch (InterruptedException e){
                    System.out.println("InterruptedException exception occurred");
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + " acquire resource o1");
                }
            }
        });

        thread3.start();
        thread4.start();


        if(!t1.isAlive() && !t2.isAlive()){
            System.out.println("Program execution done!");
        }
    }
}
