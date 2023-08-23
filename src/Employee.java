public class Employee {
    public String fullName;
    private final String position;
    public String email;

    public int phoneNumber;
    private final int age;

    public Employee(String fullName, String position, String email, int phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void getAll() {
        System.out.println("Full name: " + fullName + " " + "Position: " + position + " " + "Email: " + email + " " + "Phone number: " + phoneNumber + " " + "Age: " + age);
    }
}