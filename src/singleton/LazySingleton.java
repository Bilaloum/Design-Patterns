package singleton;

public class LazySingleton {

    private int counter ;
    private static LazySingleton instance = null;

    private LazySingleton(){ }

    public static LazySingleton getInstance(){

        if(instance == null ){
            instance = new LazySingleton();
        }
        return instance ;
    }

    public void addOne(){
         counter++;
    }

    public int getCounter() {
        return counter;
    }
}
