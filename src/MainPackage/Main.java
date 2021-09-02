package MainPackage;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        final String filePath = "E:\\projects\\Java\\First project\\userInfo.csv";
        while (true) {
            System.out.println("Menu: ");
            System.out.println(" 1. Register \n 2. Display \n 3. Continue \n 4. Exit");
            System.out.print("Choose operation: ");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter your first name: ");
                String firstName = input.next();
                System.out.print("Enter your last name: ");
                String lastName = input.next();
                System.out.print("Enter your username: ");
                String userName = input.next();
                System.out.print("Enter your password: ");
                String password = input.next();
                User user = new User(firstName, lastName, userName, password);
                User.writeData(user,filePath);
            } else if (choice == 2) {
                User.readData(filePath);
            } else if (choice == 3) {
                continue;
            } else if (choice == 4) {
                break;
            }
        }
    }
}