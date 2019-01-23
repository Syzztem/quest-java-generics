import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.*;

public class Generics {
  interface Predicate<T> { boolean filter(T obj); }
  interface Mapper<T, U> { U map(T obj); }

  /**
   * Java entry point
   */
  public static void main(String... args) {
    new Generics();
  }

  /**
   * Class Constructor
   */
  private Generics() {
    List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<String>  strs = Arrays.asList("tout", "titi", "ototo", "jean", "tous", "taratata");

    ints.stream().filter(n -> n % 2 == 0).map(x -> x * 2).collect(Collectors.toList()).forEach(System.out::println);
    //for (Integer i: ints) System.out.println(i);

    strs.stream().map(s -> s.toUpperCase()).filter(s -> s.indexOf("T") != s.lastIndexOf("T")).collect(Collectors.toList()).forEach(System.out::println);
    //for (String s: strs) System.out.println(s);
  }
}