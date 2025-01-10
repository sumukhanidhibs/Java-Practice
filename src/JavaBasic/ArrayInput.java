package JavaBasic;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[4];
        for(int i=0;i<num.length;i++){
            num[i]= sc.nextInt();
        }

        for(int i:num){
            System.out.print(i+" ");
        }


    }

}
