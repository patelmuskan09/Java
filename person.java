public class person{
    void displayname(){
        System.out.println("NAME DISPLAYED!");
    }
}
class student extends person{
    void displayclass(){
        System.out.println("CLASS DISPLAYED!");
    }
}
class monitor extends student {
    void checkdiscipline(){
        System.out.println("DISCIPLINE IS DONE!");
    }
}
class b{
    public static void main(String[] args) {
        monitor m = new monitor();
        m.displayname();
        m.displayclass();
        m.checkdiscipline();
    }

}