interface vehicle{
    default void start(){
        System.out.println("VEHICLE IS STARTING!");
    }
}
class car implements vehicle {


    public static void main(String[] args) {
        car c=new car();
        c.start();
    }
}
