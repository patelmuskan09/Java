public class rectangle {
    int length;
    int width;
    int Area;
    int Perimeter;
    void show(){
        System.out.println("length="+length);
        System.out.println("width="+width);
        Area = length*width;
        Perimeter = (length+width)*2;
        System.out.println("Area="+Area);
        System.out.println("Perimeter="+Perimeter);
    }
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.length=30;
        r1.width=20;


        r1.show();
    }
}
