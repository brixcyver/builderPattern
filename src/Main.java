import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("           === Welcome to E-Commerce Haven ===");
        System.out.println();

        while (true) {
            System.out.print("Want to Create an Account? Type Yes to Start (or type 'exit' to end): ");
            String loop = scanner.nextLine();

            if (loop.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            System.out.println();
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter address (optional): ");
            String address = scanner.nextLine();

            System.out.print("Enter phone (optional): ");
            String phone = scanner.nextLine();

            System.out.print("Enter age (optional): ");
            int age = 0;
            try {
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid format or the age is not provided.");
            }

            User user = new User.Builder(firstName, lastName, email)
                    .address(address)
                    .phone(phone)
                    .age(age)
                    .build();

            System.out.println("\nUser Information:");
            System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Address: " + user.getAddress());
            System.out.println("Phone: " + user.getPhone());
            System.out.println("Age: " + (user.getAge() == 0 ? "N/A" : user.getAge()));
            System.out.println();
        }
    }
}
