import java.util.Scanner;
public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello";

        System.out.println(str.length());
        System.out.println(str.charAt( 1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.substring( 2));
        System.out.println(str.substring( 2, 3));
        System.out.println(str.indexOf(str));
    }
}
