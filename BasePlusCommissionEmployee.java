package Lab4;

public class BasePlusCommissionEmployee extends CommisionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName,String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return super.earnings() + baseSalary;
    }

    public double increaseBaseSalary() {
        return baseSalary+=baseSalary*0.1;
    }

    public String toString() {
        return "Base Plus "   + super.toString() + "\nBase Salary: " + baseSalary;
    }

}
