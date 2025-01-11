package CollectionAPIDemo;

import java.util.HashMap;
import java.util.Scanner;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter student name: ");
            String std = sc.nextLine();

            if (std.isEmpty()) {
                break;
            }

            System.out.print("Enter student roll no: ");
            int n = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            hm.put(std, n);
        }

        for(String key : hm.keySet()) {
            System.out.println();
            System.out.println(key + " : " + hm.get(key));
        }
    }
}
