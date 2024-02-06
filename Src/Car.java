public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    public void showVehicleClassName() {
        System.out.println("I am " + super.getName());
    }
}
