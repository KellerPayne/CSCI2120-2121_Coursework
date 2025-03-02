import java.util.concurrent.TimeUnit;
class TimeExample
{
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        // ... the code being timed goes here ...
        // as an example: sleep for 5 seconds

        TimeUnit.SECONDS.sleep(5);

        // ... the code being timed ends ...

        long end = System.nanoTime();
        long msElapsed = (end - start) / 1000000;
        System.out.println("Execution time in milliseconds: " + msElapsed);
    }
}
