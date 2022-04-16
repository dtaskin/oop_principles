package encapsulation;

public class Employee {

    // default constructor
    public Employee(){

    }


    // instance variables
    private final static int totalEmployees = 10;

    /*
    Define info below and encapsulate them
    fullName
    age
    address
    phone
     */

    private String fullName;
    private int age;
    private String address;
    private String phone;

    public static int getTotalEmployees(){
        return totalEmployees;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
