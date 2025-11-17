public class areaofshape {
    void area ( int length, int width){
        int rectangleare = length * width;
        System.out.println("Area of rectangle is " + rectangleare);
    }
    void area ( int length,int width, int height){
        int trianglearea = width* height/ 2;
        System.out.println("Area of triangle is " + trianglearea);
    }
    void area ( int length,int width, int height, int side){
        int squarearea = side*side;
        System.out.println("Area of triangle is " + squarearea);
    }
    public static void main(String[] args) {
        areaofshape a = new areaofshape();
        a.area(100,150);
        a.area(100,200,120);
        a.area(100,150,120,50);
    }
}
