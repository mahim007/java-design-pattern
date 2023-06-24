package creational.singleton;

public class DBSingletonDemo {
    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

        DBSingleton instance1 = DBSingleton.getInstance();
        System.out.println(instance1);
    }
}
