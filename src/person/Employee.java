package person;

import person.Person;

public class Employee extends Person {
    int taskId;
    public Employee(String fullname, int taskId) {
        super(fullname);
        setTaskId(taskId);
    }
    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
