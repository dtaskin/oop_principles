package inheritance;

public class Person {

    //default constructor
    public Person(){

    }

    //4-args constructor
    public Person(String fName, String lName, int age, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    //Instance variables
    public  String fName;
    public String lName;
    protected int age;
    protected String gender;
    double weight; // default
    double height; // default
    private String DOB;
    private String SSN;

    public void sleep(){
        System.out.println("Person sleeps");
    }
    public void learn(){
        System.out.println("Person learns");
    }
    public void walk() {
        System.out.println("Person walks");
    }
    public void eat() {
        System.out.println("Person eats");
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + // to get every persons name you have to use this method
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
        /*
        @Override
       public String toString() {
        return this.getClass().getName().substring(this.getClass().getName().indexOf(".")) + "{" +
            "fName='" + fName + '\'' +
            ", lName='" + lName + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            ", DOB='" + DOB + '\'' +
            ", SSN='" + SSN + '\'' +
            '}';
         */
}
