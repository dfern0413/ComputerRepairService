package person;

import person.Person;

public class Employee extends Person {
    int taskId;
    public Employee(String fullname, String emailAdress, int taskId) {
        super(fullname,emailAdress);
        setTaskId(taskId);
    }
    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
