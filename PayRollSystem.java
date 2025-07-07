package Lab4;

public class PayRollSystem {
    public static void main(String[] args) {
        Employee[] employee = new Employee[4];

        employee[0]=new SalariedEmployee("Arif","Hossain","1687686514",1000);
        employee[1]=new HourlyEmployee("Jahidul","Islam","6897616",200,46);
        employee[2]=new CommisionEmployee("Habibur","Rahman","6876927",100,10);
        employee[3]=new BasePlusCommissionEmployee("Jannatul Nayeem","Shovon","68768617",50,7,1000);

        for(Employee e:employee){
            System.out.println(e + "\n");

            if(e instanceof BasePlusCommissionEmployee){
                System.out.println("Base Salary Increased by 10%");
                System.out.println("Increased Base Salary:" + ((BasePlusCommissionEmployee) e).increaseBaseSalary() + "\n");
            }
        }

    }
}
