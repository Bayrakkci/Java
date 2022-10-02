public class Main {
    public static void main(String[] args) {
        String name = "Bro";
        // boolean result = name.equals("Bro"); // True
        // boolean result = name.equalsIgnoreCase("bro"); // True
        // int result = name.length(); // 3
        // char result = name.charAt(0); // "B"
        // int result = name.indexOf("o"); // 3
        // boolean result = name.isEmpty(); // false
        // String result = name.toUpperCase(); //BRO
        // String result = name.toLowerCase(); //bro
        // String result = name.trim(); // ignores spaces
        String result = name.replace('o','i'); //bri
        System.out.println(result);
    }
}