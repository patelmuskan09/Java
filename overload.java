public class overload {
    void add(int a){
        System.out.println(a);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        overload ob=new overload();
        ob.add(10);
        ob.add(100,200);
        ob.add(200,300,500);
    }
}
