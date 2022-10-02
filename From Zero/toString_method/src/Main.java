public class Main {
    public static void main(String[] args) {
        Car car = new Car();
    /*  System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);*/

        System.out.println(car); // Memory Address
        System.out.println(car.toString()); /* Normally this method also gives the memory address but
                                               if you override it, you can get the actual object. */
    }
}