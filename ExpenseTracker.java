import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = 0 ;
        double food = 0 , travel = 0 , shopping = 0 , others = 0;

        int choice;

        do {
            System.out.println("\n===== Expense Tracker Menu =====");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Total Expenses");
            System.out.println("4. View Category-wise Expenses");
            System.out.println("5. View Savings");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter income: ");
                    income += sc.nextDouble();
                    break;

                case 2:
                    System.out.println("Select Category:");
                    System.out.println("1. Food");
                    System.out.println("2. Travel");
                    System.out.println("3. Shopping");
                    System.out.println("4. Others");
                    int cat = sc.nextInt();

                    System.out.print("Enter expense: ");
                    double amount = sc.nextDouble();

                    switch (cat) {
                        case 1: food += amount; break;
                        case 2: travel += amount; break;
                        case 3: shopping += amount; break;
                        case 4: others += amount; break;
                        default: System.out.println("Invalid category!");
                    }
                    break;

                case 3:
                    double totalExpense = food + travel + shopping + others;
                    System.out.println("Total Expenses: " + totalExpense);
                    break;

                case 4:
                    System.out.println("\n--- Category-wise Expenses ---");
                    System.out.println("Food: " + food);
                    System.out.println("Travel: " + travel);
                    System.out.println("Shopping: " + shopping);
                    System.out.println("Others: " + others);
                    break;

                case 5:
                    double savings = income - (food + travel + shopping + others);
                    System.out.println("Savings: " + savings);
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}