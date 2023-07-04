package structural.flyweight;

public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();

        inventory.takeOrder("A", 1);
        inventory.takeOrder("B", 2);
        inventory.takeOrder("C", 3);
        inventory.takeOrder("A", 4);
        inventory.takeOrder("B", 5);
        inventory.takeOrder("C", 6);
        inventory.takeOrder("A", 7);
        inventory.takeOrder("B", 8);
        inventory.takeOrder("C", 9);
        inventory.takeOrder("A", 10);

        inventory.process();
        System.out.println(inventory.report());
    }
}
