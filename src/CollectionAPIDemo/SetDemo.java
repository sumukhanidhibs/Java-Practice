package CollectionAPIDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            String n = sc.nextLine();
            if(n.isEmpty()){
                break;
            }else{
                set.add(Integer.parseInt(n));
            }
        }

        for(Integer i : set){
            System.out.println(i);
        }
    }
}
