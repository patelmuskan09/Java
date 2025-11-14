public class device {
    void poweron(){
        System.out.println("turned on!");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("BOOTED!");
    }
}
class gaminglaptop extends laptop{
    void startgame(){
        System.out.println("GAMING HAS BEGAN");
    }
}
class l{
    public static void main(String[] args){
        gaminglaptop l1=new gaminglaptop();
        l1.boot();
        l1.poweron();
        l1.startgame();
    }
}