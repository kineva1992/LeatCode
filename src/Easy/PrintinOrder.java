package Easy;

import java.util.concurrent.Semaphore;

/**
 * Suppose we have a class:
 *
 * public class Foo {
 *   public void first() { print("first"); }
 *   public void second() { print("second"); }
 *   public void third() { print("third"); }
 * }
 * The same instance of Foo will be passed to three different threads.
 * Thread A will call first(), thread B will call second(), and thread C will call third().
 * Design a mechanism and modify the program to ensure that second() is executed after first(),
 * and third() is executed after second().
 *
 * Note:
 *
 * We do not know how the threads will be scheduled in the operating system,
 * even though the numbers in the input seem to imply the ordering.
 * The input format you see is mainly to ensure our tests' comprehensiveness.
 */

public class PrintinOrder {
    Semaphore semaphore1;
    public PrintinOrder() {
        semaphore1 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        semaphore1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(!semaphore1.tryAcquire(1));

        printSecond.run();
        semaphore1.release(2);
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!semaphore1.tryAcquire(2));

        printThird.run();
    }
}
