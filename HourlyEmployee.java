package Lab4;

public class HourlyEmployee extends Employee{
    private double hourlySalary;
    private int hoursWorked;

    public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber ,double hourlySalary,int hoursWorked){
        super(firstName,lastName,socialSecurityNumber);
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    public double earnings(){
        if(hoursWorked <=40) {
            return hourlySalary * hoursWorked;
        }
        else{
            return hourlySalary *40  + (hoursWorked - 40) * 1.5 * hourlySalary;
        }
    }

    public String toString(){
        return "Hourly Employee Information:\n "+ super.toString() + "HourlySalary: " + hourlySalary + "\nHours Worked: " + hoursWorked + "\nEarnings: " + earnings();
    }

}
