interface shape1{
    void area1();
}
class circle1 implements shape1{
    public void area1(){
        int area;
        int radius=5;
        area = 22*radius * radius/7;
        System.out.println("AREA OF CIRCLE IS "+area);
    }
    public static void main(String[] args) {
        circle1 c=new circle1();
        c.area1();
    }
}
