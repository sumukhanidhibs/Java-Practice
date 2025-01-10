package JavaBasic;

public class MuLDimArray {
    public static void main(String[] args) {
        int[][] arr= new int[3][4];
        int random = 0;

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                random = (int) (Math.random()*100);
                arr[i][j]=random;
            }
        }


        for(int[] k:arr){
            for(int l:k){
                System.out.print(l+" ");
            }
            System.out.println();
        }



    }
}
