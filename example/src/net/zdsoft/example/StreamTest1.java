package net.zdsoft.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/9/27 15:18
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("hello", "world", "fine");
        Stream<String> stream2 = Arrays.asList("hello","world").stream();
        String[] myArray = new String[]{"hello", "world", "hello world"};
        Stream<String> stream3 = Stream.of(myArray);
        Stream<String> stream4 = Arrays.stream(myArray);
        IntStream intStream = IntStream.of(new int[]{234, 234});
    }
}
