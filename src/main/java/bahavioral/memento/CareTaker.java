package bahavioral.memento;

import java.util.Stack;

public class CareTaker {
    private Stack<StudentMemento> studentHistory = new Stack<>();

    public void save(Student student) {
        studentHistory.push(student.save());
    }

    public void revert(Student student) {
        student.revert(studentHistory.pop());
    }
}
