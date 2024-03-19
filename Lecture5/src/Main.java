import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        int pageIdx = 21;
        int pageSize = 25;
        IntStream.rangeClosed(1, 895)
                .skip((pageIdx - 1) * pageSize)
                .limit(pageSize)
                .forEach(System.out::println);
    }
}