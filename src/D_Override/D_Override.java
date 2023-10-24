package D_Override;

public class D_Override {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.getColor();
        obj.wheel();
        int a = obj.wheels();
        System.out.println(a);

        //upcasting
        Vehicle vehicleOne=new car();
        vehicleOne.getColor();

        //downcasting
        Vehicle v = new car();
        car carOne = (car) v;
        carOne.getColor();

        car objOne = new car();
        objOne.getColor();
        objOne.wheel();

        Bike objTwo = new Bike(7);
        objTwo.getColor();
    }
}
