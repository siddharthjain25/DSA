import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID){
            case 1:
                System.out.println("Siddharth Jain");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CS":
                        System.out.println("CS department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
}
