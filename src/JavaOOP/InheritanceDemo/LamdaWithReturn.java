package JavaOOP.InheritanceDemo;

public class LamdaWithReturn {
    public static void main(String[] args) {
//        B b = (int x,int y) ->{
//            return x*y;
//        };
//
//    simplified to
//        |
//        |
//        |
//       \ /
//        '

//        B b = (int x,int y) -> x*y;


//    simplified to
//        |
//        |
//        |
//       \ /
//        '
        B b = (x,y) -> x*y;
        int z = b.show(3,4);
        System.out.println(z);
    }
}
