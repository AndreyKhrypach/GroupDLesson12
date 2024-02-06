public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void display();

    public final void dinnerTime() {
        System.out.println("I am eating");
    }

    public void workPlace() {
        System.out.println("i am in office");
    }

}
