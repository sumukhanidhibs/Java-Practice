package ComparisonDemo;

import java.util.ArrayList;
import java.util.Comparator;



public class CompareNumbers {
    public static void main(String[] args) {

        Comparator<Integer> com = (n1, n2) -> {
            if(n1%10>n2%10)
                return 1;
            else
                return -1;
        };

       ArrayList<Integer> list1 = new ArrayList<Integer>();
       list1.add(24);
       list1.add(33);
       list1.add(27);
       list1.add(18);

       list1.sort(com);
       System.out.println(list1);
    }
}
