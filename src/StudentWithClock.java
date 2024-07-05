import java.util.stream.IntStream;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class StudentWithClock implements Learner {
    @Override
    public void learn() {
        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Текущее время: " + currentTime.format(formatter));
    }
}