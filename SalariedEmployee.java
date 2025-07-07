package Lab4;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,double weeklySalary){
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double earnings(){
        return weeklySalary;
    }

    public String toString(){
        return "Salaried Employee Information: \n"+super.toString() + "Weekly salary:" + weeklySalary + "\nEarnings:" + earnings() ;
    }
}
