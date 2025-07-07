package Lab4;

public class CommisionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommisionEmployee(String firstName,String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    public double earnings(){
        return grossSales * commissionRate;
    }

    public String toString(){
        return "Commission Employee Information: \n" + super.toString() + "Gross Sales:" + grossSales + "\nCommission Rate:" + commissionRate + "\nEarnings:" + earnings();
    }
}
