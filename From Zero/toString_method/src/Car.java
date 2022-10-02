public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2022;

    public String toString(){   // Overriding a special method

        return make +"\n"+model+"\n"+color+"\n"+year;
    }
}
