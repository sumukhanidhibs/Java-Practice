package CollectionAPIDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
//        boolean a=true;
        Scanner sc = new Scanner(System.in);

        while(true) {
            String n = sc.nextLine();
            if(n.isEmpty()){
                break;
            }else{
                ar.add(Integer.parseInt(n));
            }
        }

        for(Integer i : ar){
            System.out.println(i);
        }

    }
}
