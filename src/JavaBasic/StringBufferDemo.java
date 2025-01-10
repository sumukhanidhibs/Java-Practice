package JavaBasic;

import java.util.stream.IntStream;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Matt");
        sb.append(" Murdock");
//        sb.deleteCharAt(3);

        System.out.println(sb);

       sb.insert(5, "Henry ");

        System.out.println(sb);
    }


}
