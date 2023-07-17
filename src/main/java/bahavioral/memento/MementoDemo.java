package bahavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Student student = new Student("mahim", "1234", "Bangladesh");
        System.out.println("Before save: " + student);

        careTaker.save(student);
        student.setName("mahim1");
        student.setPhone("12345");
        careTaker.save(student);
        System.out.println("Student after changing phone no# " + student);

        student.setPhone("123456");
        student.setName("mahim2");
        careTaker.revert(student);
        System.out.println("Revert to the last saved point: " + student);

        careTaker.revert(student);
        System.out.println("Revert to the original saved point: " + student);
    }
}
