interface A{
   void display();
   }
interface D{
   void display();
}
class demo implements A,D{

    public void display() {
        System.out.println("BYEEEEEEEEEE");
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.display();
    }
}