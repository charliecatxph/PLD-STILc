
import java.util.Scanner;

public class PT {

    public static void clr() {
        System.out.print("\033\143");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String employee_name = "";

        double monthly_salary = 0.0;
        int working_days = 0;
        int vac_days = 0;
        int creds = 0;
        clr();

        System.out.print("Enter employee name: ");
        employee_name = inp.nextLine();
        clr();

        System.out.print("Hello " + employee_name + ", how much do you earn per month?\nI earn: ");
        monthly_salary = inp.nextDouble();
        clr();

        System.out.print("Okay, how many days do you work per month?\nI work: ");
        working_days = inp.nextInt();
        clr();

        System.out.print("Did you take any vacation days this month?\nI took: ");
        vac_days = inp.nextInt();

        clr();
        System.out.print("How many leave credits do you still have?\nI only have: ");
        creds = inp.nextInt();
        clr();

        System.out.println("PAYSLIP: ");

        double salaryPerDay = monthly_salary / working_days;
        double daysWorked = working_days - vac_days;
        double netBeforeDeductions = salaryPerDay * daysWorked;
        double vacationDayDeductions = salaryPerDay * vac_days;

        double sss = netBeforeDeductions * 0.045;
        double pag_ibig = 200.0;
        double wtax = netBeforeDeductions * 0.1;
        double net = netBeforeDeductions - sss - pag_ibig - wtax;

        String leftAlignFormat = "| %-17s |    %-2d   | %-18.2f | %-7.2f | %-12.2f | %-18.2f |  %-17.2f | %-16.2f |%n";

        System.out.format("+-------------------+---------+--------------------+------------------------------------------------------------------+------------------+%n");
        System.out.format("|                   |         |                    |                            Deductions                            |                  |%n");
        System.out.format("| Employee Name     | Credits | Base Salary        +---------+--------------+--------------------+--------------------+ Net Salary       |%n");
        System.out.format("|                   |         |                    |   SSS   |   Pag-Ibig   |   Witholding Tax   |    Vacation Days   |                  |%n");
        System.out.format("+-------------------+---------+--------------------+---------+--------------+--------------------+--------------------+------------------+%n");

        System.out.format(leftAlignFormat, employee_name, creds, monthly_salary, sss, pag_ibig, wtax, vacationDayDeductions, net);

        System.out.format("+-------------------+---------+--------------------+---------+--------------+--------------------+--------------------+------------------+%n");

    }
}
