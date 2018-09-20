import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Employee e1=getEmployeeDetails();
        
        e1.calculateNetSalary(getPFPercentage());
        System.out.println("Id:"+e1.getEmployeeId());
        System.out.println("Name:"+e1.getEmployeeName());
        System.out.println("Salary:"+e1.getSalary());
        System.out.println("Net Salary:"+e1.getNetSalary());
    }
    public static Employee getEmployeeDetails()
    {
        int Id;
        double salary;
        String name;
        
        Scanner s=new Scanner(System.in);
        Employee e=new Employee();
        
        System.out.println("Enter Id:");
        Id=s.nextInt();
        e.setEmployeeId(Id);
        
        System.out.println("Enter Name:");
        name=s.nextLine();
        name=s.nextLine();
        e.setEmployeeName(name);
        
        System.out.println("Enter salary:");
        salary=s.nextInt();
        e.setSalary(salary);
        
        return e;
    }
    public static int getPFPercentage()
    {
        int per;
        Employee e1=new Employee();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter PF percentage");
        per=s.nextInt();
        return per;
    }
}