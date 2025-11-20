interface animal1{
    void makesound();
}
class dog implements animal1{
    public void makesound(){
        System.out.println("BARK!");
    }
    public static void main(String[] args) {
        dog d=new dog();
        d.makesound();
    }
}
