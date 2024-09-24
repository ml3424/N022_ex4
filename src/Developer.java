public class Developer extends Employee{
    @Override
    void calculateSalary()
    {
        System.out.println("the salary: " + (15500+500-800));
    }

    @Override
    void getDetails()
    {
        super.getDetails();
        System.out.println("work as a developer");
    }

    @Override
    void performTask()
    {
        System.out.println("develop something");
    }
}
