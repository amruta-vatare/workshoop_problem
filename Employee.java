import java.math.BigInteger;

public class Employee {
    private int e_Id;
    private String name;
    private int age;
    private BigInteger phone_no;
    private String city;
    private String state;


    public Employee(int e_Id, String name, int age, BigInteger phone_no, String city, String state, String department) {
        this.e_Id = e_Id;
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.city = city;
        this.state = state;
        this.department = department;
    }

    public int getE_Id() {
        return e_Id;
    }

    public void setE_Id(int e_Id) {
        this.e_Id = e_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigInteger getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(BigInteger phone_no) {
        this.phone_no = phone_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;
}
