package bahavioral.memento;

public class StudentMemento {
    private String name;
    private String phone;

    public StudentMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
