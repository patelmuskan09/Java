interface walkable {
    void walk();
}
interface runnable {
    void run();
}
class human implements walkable, runnable {
    public void walk(){
        System.out.println("WALKING IS GOOD FOR HEALTH");
    }

    public void run(){
        System.out.println("RUNNING IS MOREEEE GOOD FOR HEALTH");
    }
    public static void main(String[] args) {
        human h= new human();
        h.run();
        h.walk();

    }
}
