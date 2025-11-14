public class shape {
    void draw(){
        System.out.println("Drawn!!");
    }
}
class circle extends shape{
    void calculatearea(){
        System.out.println("CALCULATED THE AREA!!");
    }
}
class c{
    public static void main(String[] args){
        circle c1=new circle();

        c1.draw();
        c1.calculatearea();
    }
}