package singleton;

public class Main {
    public static void main(String[] args) {

        LazySingleton firstLazySingleton = LazySingleton.getInstance();
        LazySingleton secondLazySingleton = LazySingleton.getInstance();

        firstLazySingleton.addOne();
        secondLazySingleton.addOne();

        System.out.println("first LazySingleton counter : "+ firstLazySingleton.getCounter());
        System.out.println("second LazySingleton counter : "+ secondLazySingleton.getCounter());


        firstLazySingleton.addOne();

        System.out.println("----------------------------------------");
        System.out.println("after adding 1 to the first object ");
        System.out.println("----------------------------------------");

        System.out.println("first LazySingleton counter : "+ firstLazySingleton.getCounter());
        System.out.println("second LazySingleton counter : "+ secondLazySingleton.getCounter());






    }
}