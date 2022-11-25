package person;

public class Person {
    private String fullname;
    private String emailAddress;

    public Person(String fullname, String emailAddress) {
        this.fullname = fullname;
        this.emailAddress = emailAddress;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
