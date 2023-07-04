package structural.flyweight;

public class FlyweightEverydayDemo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(5);
        Integer j = Integer.valueOf(05);
        Integer k = Integer.valueOf(10);

        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(j));
        System.out.println(System.identityHashCode(k));
    }
}
