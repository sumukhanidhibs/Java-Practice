package JavaBasic;

public class WeekCounter {
    public static void main(String[] args) {

        String[] week= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        int i=0;


        try {
            while(i<7){
                Thread.sleep(1000);
                System.out.println(week[i]);
                int j=1;
                while(j<=24){
                    System.out.println(j);
                    Thread.sleep(100);
                    j++;
                }
                i++;
            }
             // Sleep for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

    }
}
