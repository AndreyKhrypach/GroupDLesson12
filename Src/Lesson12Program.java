import Helper.*;

import static Helper.Gender.MALE;

public class Lesson12Program {
    public static void main(String[] args) {

        User user = new User("Dasha", 18, Gender.FEMALE);
        System.out.println(user);

//        Person kate = new Client("Kate", "Oracle");
//        Person bob = new Employee("Bob", "Bank of America");
//
//        kate.workPlace();
//        bob.workPlace();
//
//        kate.dinnerTime();
//        bob.dinnerTime();

//        Book b1 = new Book("War and Peace", "L. Tolstoy", Topic.BELLETRE);
//        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
//
//        switch(b1.bookType){
//            case BELLETRE:
//                System.out.println(" Belletre");
//                break;
//            case SCIENCE:
//                System.out.println(" Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println(" Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println(" Phantasy");
//                break;
//        }

//        Operation op = Operation.SUM;
//        System.out.println(op.action(10, 4));   // 14
//        op = Operation.MULTIPLY;
//        System.out.println(op.action(6, 4));    // 24

//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.RED);
//        System.out.println(Color.GREEN.getCode());      // #00FF00
//        System.out.println(Color.GREEN);

//        Topic[] topics = Topic.values();
//        for (Topic topic :
//                topics) {
//            System.out.println(topic);
//        }
//
//        //Метод ordinal() повертає порядковый номер константи (нумерація починається з 0):
//        System.out.println(Topic.BELLETRE.ordinal());

//        Day current = Day.TUESDAY;
//        System.out.println(current);    // Tuesday

//        Figure square = new Figure(0, 0) {
//            @Override
//            public float getPerimeter() {
//                return 5 * 4;
//            }
//
//            @Override
//            public float getArea() {
//                return 5 * 5;
//            }
//        };

//        Figure rectangle = new Rectangle(0, 1, 10, 15);
//        Figure circle = new Circle(-10, -2, 6);
//
//        System.out.println("Rectangle");
//        System.out.println("Area = " + rectangle.getArea());
//        System.out.println("Perimeter = " + rectangle.getPerimeter());
//
//        System.out.println("circle");
//        System.out.println("circle length = " + circle.getPerimeter());
//        System.out.println("circle area = " + circle.getArea());

//        Employee sam = new Employee("Sam", "Leman Brothers");
//        sam.display();
//        Client bob = new Client("Bob", "Leman Brothers");
//        bob.display();
//
//        Person sam2 = new Employee("Sam2", "Leman Brothers");
//        sam2.display();
//        Person bob2 = new Client("Bob2", "Leman Brothers");
//        bob2.display();

//        Fly plane = new AirPlane();
//        plane.flying();
//
//        Fly mosquito = new Mosquito();
//        mosquito.flying();

        //error for instance abstract class
        //Vehicle vehicle = new Vehicle("Vehicle");
//        vehicle.showVehicleClassName();

//        Vehicle truck = new Truck("Big truck");
//        truck.showVehicleClassName();
//
//        Vehicle car = new Car("kadilack");
//        car.showVehicleClassName();
    }
}
