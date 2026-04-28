public class alarm {
    public static void main(String args[]){
        String day="MONDAY";
        switch(day){
            case "SATURDAY","SUNDAY":
                System.out.println("7 a.m.");
                break;
            case "MONDAY":
                System.out.println("6 a.m.");
                break;
            default:
                System.out.println("8 a.m."); 
        }
    }
}
