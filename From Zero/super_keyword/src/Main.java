public class Main {
    public static void main(String[] args) {
        // super = keyword refers to the superclass(parent) of an object same with python
        //         very similar to the "this" keyword. Using it to reach up up class :)

        Hero hero1 =  new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 43, "Everything");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println(hero2.toString()); // See?
    }
}