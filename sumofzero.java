import java.util.Scanner;
public class sumofzero {
    static int countzero(long a)
    {
        if(a==0)
            return 0;
        int count=(a%10==0) ? 1:0;
        return count + countzero(a/10);
    }
    public static void main(String[] args){
        long a=1230976507876502340L;
        System.out.println(countzero(a));
    }
}
