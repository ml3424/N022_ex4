public class Salesperson extends Employee{
    @Override
    void calculateSalary()
    {
        System.out.println("the salary: " + (14000+500-700));
    }

    @Override
    void getDetails()
    {
        super.getDetails();
        System.out.println("work as a saleperson");
    }
}
