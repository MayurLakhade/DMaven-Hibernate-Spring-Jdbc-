package hibernate_employee_crud;

import java.util.Scanner;

import hibernate_employee_crud_daoImpl.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        char a;
        EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();

        do 
        {
            
            System.out.println("Employee Registration");
            System.out.println("1. Add employee");
            System.out.println("2. Show employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Update employee");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");

            int ch = sc.nextInt();

            switch (ch) 
            {
                case 1: daoImpl.addEmp();
                break;

                case 2: daoImpl.getEmployee();
                break;

                case 3: daoImpl.deleteEmp();
                break;

                case 4: daoImpl.updateEmp();
                break;

                case 5: System.exit(0);
                break;
            
                default:
                break;
            }  
            System.out.println("Do you want to continue Y/N");
            a = sc.next().charAt(0); 
        }
        
        while (a == 'Y' || a == 'y');
        System.out.println("Thanks");
    }
}
