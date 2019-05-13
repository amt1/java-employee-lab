package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;

    }

    public void setName(String name) {
        if ((name != null) && (name.length() > 0)) this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary( double increase){
        if (increase > 0) salary += increase;
    }

    public double payBonus(){
        return (salary / 100);
    }
}
