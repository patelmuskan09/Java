public class Inherit {
    class Animal {
        void eat() {
            System.out.println("Pizza");

        }
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("hcnaJZBSNCJKwabVLJGIu");
        }
    }
    class puppy extends Dog {
        void sleeps() {
            System.out.println("Aalsii");
        }
    }

        public static void main(String[] args) {
            Inherit obj = new Inherit();
           puppy p1 =obj.new puppy();

           p1.eat();
           p1.bark();
           p1.sleeps();
        }
    }

