package hellogradle;
import java.time.LocalTime;

public class PrintTime {
    public static void main() {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Print the current time in the format of "hh:mm:ss"
        System.out.println("Current time: " + currentTime.toString());
    }
}