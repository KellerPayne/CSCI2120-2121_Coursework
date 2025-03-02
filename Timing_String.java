import java.util.concurrent.TimeUnit;
class Timing_String
{
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        // ... the code being timed goes here ...
        // as an example: sleep for 5 seconds

        String s = new String("CSCI_2121");
        for (int i=0; i<100000; i++) {
            s += "A";
        }

        // ... the code being timed ends ...

        long end = System.nanoTime();
        long msElapsed = (end - start) / 1000000;
        System.out.println("Execution time in milliseconds: " + msElapsed);
    }
}
