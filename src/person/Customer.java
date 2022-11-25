package person;

import person.Person;

public class Customer extends Person {
    String workOrder;
    String problemType;
    public Customer(String fullname, String emailAdress, String workOrder, String problemType) {
        super(fullname,emailAdress);
        setWorkOrder(workOrder);
        setEmailAddress(emailAdress);
    }
    public String getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(String workOrder) {
        this.workOrder = workOrder;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }
}
