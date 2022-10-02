public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(),
//                new DatabaseLogger(), new ConsoleLogger()}; /* You can plug and play with polymorphism*/
//        for(BaseLogger logger : loggers){
//            logger.log("Log message");
//        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger() /* or any logger */);
        customerManager.add();
    }
}