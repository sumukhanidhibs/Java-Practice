package JavaOOP;

enum Status
{
    Running(100),Failed(102),Deadlock(102),Completed;
    private int statuscode;

    Status(){
        statuscode=111;
    }

    Status(int statuscode){
        this.statuscode = statuscode;
    }

    public int getStatusCode(){
        return statuscode;
    }
//
//    public void setStatusCode(int statuscode){
//        this.statuscode = statuscode;
//    }

}


public class EnumDemo {
    public static void main(String[] args) {
        Status e = Status.Failed;

        Status[] ss = Status.values();
        for(Status s : ss){
            System.out.println(s + " " + s.getStatusCode());

        }

        System.out.println();

        switch (e){
            case Running:
                System.out.println("This is running");
                break;
            case Failed:
                System.out.println("This is failed");
                break;
            case Deadlock:
                System.out.println("This is deadlock");
                break;
             case Completed:
                 System.out.println("This is completed");
                 break;
                 default:
                     System.out.println("This is unknown");
                     break;
        }

    }
}
