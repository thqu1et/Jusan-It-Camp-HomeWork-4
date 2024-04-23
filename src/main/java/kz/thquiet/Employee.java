package kz.thquiet;

public class Employee {
    private String lastName;
    private String firstName;
    private String secondName;
    private String jobPosition;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee(String lastName, String firstName, String secondName, String jobPosition, String email, String phone, float salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String printInfo(){
        return "Last Name: " + lastName
                + "\nFirst Name: " + firstName
                + "\nSecond Name: " + secondName
                + "\nJob Position: " + jobPosition
                + "\nEmail: " + email
                + "\nPhone Number: " + phone
                + "\nSalary: " + salary
                + "\nAge: " + age
        ;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
