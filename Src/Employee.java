public class Employee extends Person {

    private String bank;

    public Employee(String name, String company) {

        super(name);
        this.bank = company;
    }

    @Override
    public void display() {

        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }

    @Override
    public void workPlace() {
        System.out.println("i am working in Bank");
    }
}
