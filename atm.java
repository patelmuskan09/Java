class atm {
    private int totalbalance=1000;
    public void getB(){
        System.out.println("Total balance: "+totalbalance);
    }
    public void setbalance(int amount){
        if(amount>0){
            totalbalance+=amount;
        }
    }
}
class h{
    public static void main(String[] args) {
        atm a=new atm();
        a.getB();
        a.setbalance(500);
    }
}
