import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static double max_regular_hours = 40;
    static double OVERTIMEFACTOR = 1.5;


    public static double calculatePay(double hours, double rate){
        double regularHours = 0;
        double overtimeHours = 0;
        double overtimeRate = OVERTIMEFACTOR * rate;
        if (hours > max_regular_hours){
            regularHours = max_regular_hours;
            overtimeHours = hours - max_regular_hours;
        }else{
            regularHours = hours;
        }
        double regularTimeTotal = regularHours * rate;
        double overtimeTotal = overtimeHours * overtimeRate;
        double total = regularTimeTotal + overtimeTotal;
        System.out.printf("Overtime rate: %s \n", overtimeRate);
        System.out.printf("Regular time total: %s \n", regularTimeTotal);
        System.out.printf("Overtime time total: %s \n", overtimeTotal);

        return total;
    }
    public static void main(String[] args) {

        System.out.println("Enter Hours: ");
        double hours = scanner.nextDouble();

        System.out.println("Enter Rate: ");
        double rate = scanner.nextDouble();

        System.out.printf("Total: %.2f \n", calculatePay(hours,rate));
    }
}