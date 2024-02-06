public class Truck extends Vehicle{
    public Truck(String name) {
        super(name);
    }

    @Override
    public void showVehicleClassName() {
        System.out.println("I am " + super.getClass().getName());
    }
}
