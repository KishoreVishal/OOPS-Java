import java.util.Random;

class NumberGenerator extends Thread {
    static int number;

    public void run() {
        Random r = new Random();

        // Generate a random number from 1 to 10
        number = r.nextInt(10) + 1;

        System.out.println("Thread 1: Generated Number = " + number);

        synchronized (NumberGenerator.class) {
            NumberGenerator.class.notifyAll();
        }
    }
}

class Square extends Thread {
    public void run() {
        synchronized (NumberGenerator.class) {
            try {
                NumberGenerator.class.wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        if (NumberGenerator.number % 2 == 0) {
            int n = NumberGenerator.number;
            System.out.println("Thread 2: Square of " + n + " = " + (n * n));
        }
    }
}

class Cube extends Thread {
    public void run() {
        synchronized (NumberGenerator.class) {
            try {
                NumberGenerator.class.wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        if (NumberGenerator.number % 2 != 0) {
            int n = NumberGenerator.number;
            System.out.println("Thread 3: Cube of " + n + " = " + (n * n * n));
        }
    }
}

public class Main {
    public static void main(String[] args) {

        NumberGenerator generator = new NumberGenerator();
        Square square = new Square();
        Cube cube = new Cube();

        square.start();
        cube.start();
        generator.start();
    }
}
