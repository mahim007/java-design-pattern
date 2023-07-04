package structural.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapFacade {
    protected static List<Address> addresses;

    public void createDb() {
        addresses = new ArrayList<>();
    }

    public void insertRecord() {
        addresses.add(new Address("1", "mahim", "Dhaka"));
    }

    public List<Address> getRecords() {
        return new ArrayList<>(addresses);
    }

    public class Address {
        private String id;
        private String name;
        private String city;

        public Address(String id, String name, String city) {
            this.id = id;
            this.name = name;
            this.city = city;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
