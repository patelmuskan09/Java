public class employee {
    void work(){
        System.out.println("WORKING!!!");
    }
}
class manager extends employee{
    void attend(){
        System.out.println("WORK IS DONE!");
    }
}
class a {
    public static void main(String[] args) {
        manager m1 = new manager();
        m1.work();
        m1.attend();
    }
}