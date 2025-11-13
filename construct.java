public class construct {
    int a;
    String name;
    construct(int a, String name) {
        this.a = a;
        this.name=name;
        System.out.println("name" + " "+name);
        System.out.println("a" + " "+a);
    }

}
class n {
    public static void main(String[] args) {
        construct s1=new construct(1,"JAIN");
        construct s2=new construct(2,"SINGH");
        construct s3=new construct(3,"PATEL");
    }
}
