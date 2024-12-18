package lambdes_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainStreams {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("");

        String llistaN[] = new String[]{""};
        Stream<String> stream2 = Arrays.stream(llistaN);

        List<String> llistaN2 = Arrays.asList(llistaN);
        Stream<String> stream3 = llistaN2.stream();




    }
}
