package JavaBasic;

import java.util.Scanner;

public class WhilewithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            System.out.println(line);

        }
    }
}
