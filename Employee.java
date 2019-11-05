public class Employee {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getAnnualSalary(){
        return 12*salary;
    }

    public int raiseSalary(int percent){
        return salary+(salary/100*percent);
    }

    String toString(int id, String firstName, String lastName, int salary){
        return "Employee [ID=" + id + ", name=" + firstName +" "+lastName+", salary=" + salary + "]";
    }
}
