package D_Override;

public class Bike extends Vehicle {
    public Bike() {
        System.out.println("vehicle constuctor");
    }
    public Bike(int a) {
        System.out.println("vehicle two");
    }



    void getColor() {
        System.out.println("pink");
    }
}

