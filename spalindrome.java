public class spalindrome {
    public static void main(String[] args){
        String a="madam";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+= a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("It  is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
