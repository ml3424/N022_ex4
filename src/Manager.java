public class Manager extends Employee{
    @Override
    void calculateSalary()
    {
        System.out.println("the salary: " + (17500+500-830));
    }

    @Override
    void getDetails()
    {
        super.getDetails();
        System.out.println("work as a manager");
    }

    @Override
    void performTask()
    {
        System.out.println("manage something");
    }
}
