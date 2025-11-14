public class book {
    void read(){
        System.out.println("READING!");
    }
}
class novel extends book{
    void storyline(){
        System.out.println("GREAT STORYLINE!!");
    }
}
class j{
    public static void main(String[] args) {
        novel n1=new novel();
        n1.storyline();
        n1.read();
    }
}