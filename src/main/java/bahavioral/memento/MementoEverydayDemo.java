package bahavioral.memento;

import java.io.*;

public class MementoEverydayDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("mahim");
        employee.setAddress("Dhaka, Bangladesh");
        employee.setPhone("1234567890");

        serialize(employee);
        Employee employee1 = deserialize();
        System.out.println(employee1);
    }

    private static Employee deserialize() {
        Employee employee = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return employee;
    }

    private static void serialize(Employee employee) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
