package bahavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository repository = new BikeRepository();

        repository.addBike("Yamaha");
        repository.addBike("Honda");
        repository.addBike("Suzuki");

        for (String s : repository) {
            System.out.println(s);
        }
    }
}
