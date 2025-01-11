package StreamAPIdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMapReduce {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        Predicate<Integer> p1 = new Predicate<Integer>() {
//
//            @Override
//            public boolean test(Integer x) {
//                return x % 2 == 0;
//            }
//        };

//        Stream<Integer> st1 = list1.stream();

//

//        Stream<Integer> st2 = st1.filter(x -> x % 2 == 0);
//        Stream<Integer> st3 = st2.map(x -> x +2);
//        int result = st3.reduce(2,(c,e)->c*e);

          int result = list1.stream()
                          .filter(x -> x % 2 == 0)
                            .map(x -> x*2)
                        .reduce(0, (x, y) -> x + y);

        Stream<Integer> st = list1.stream().filter(x -> x % 2 == 0);

        st.forEach(n -> System.out.println(n));

//        System.out.println(st2.toList());
//        System.out.println(st3.toList());
//        System.out.println(st2.toList());
          System.out.println(result);

    }

}
