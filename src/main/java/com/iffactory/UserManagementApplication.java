package com.iffactory;

import java.util.Scanner;

// Main class to run the application
public class UserManagementApplication {
    public static void main(String[] args) {
        UserManagementSystem userManagementSystem = new UserManagementSystem();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nUser Management System");
            System.out.println("1. Display user by ID");
            System.out.println("2. Display all users");
            System.out.println("3. Add user");
            System.out.println("4. Remove user");
            System.out.println("5. Update first name");
            System.out.println("6. Update email");
            System.out.println("7. Add many users for testing");
            System.out.println("8. Remove all users");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // new line

            switch (choice) {
                case 1:
                    System.out.print("Enter user ID: ");
                    int id5 = scanner.nextInt();
                    scanner.nextLine(); // new line
                    userManagementSystem.displayUserById(id5);
                    break;
                case 2:
                    userManagementSystem.displayAllUsers();
                    break;
                case 3:
                    System.out.print("Enter user ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // new line

                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // new line
                    userManagementSystem.addUser(id, firstName, lastName, email, age);
                    break;
                case 4:
                    System.out.print("Enter user ID: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine(); // new line
                    userManagementSystem.removeUser(id2);
                    break;
                case 5:
                    System.out.print("Enter user ID: ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine(); // new line

                    System.out.print("Enter new first name: ");
                    String newFirstName = scanner.nextLine();
                    userManagementSystem.updateFirstName(id3, newFirstName);
                    break;
                case 6:
                    System.out.print("Enter user ID: ");
                    int id4 = scanner.nextInt();
                    scanner.nextLine(); // New line

                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    userManagementSystem.updateEmail(id4, newEmail);
                    break;
                case 7:
                    userManagementSystem.addUsers(1,"alin1","bodea1","alin1@bodea",1);
                    userManagementSystem.addUsers(2,"alin2","bodea2","alin2@bodea",2);
                    userManagementSystem.addUsers(3,"alin3","bodea3","alin3@bodea",3);
                    userManagementSystem.addUsers(4,"alin4","bodea4","alin4@bodea",4);
                    userManagementSystem.addUsers(5,"alin5","bodea5","alin5@bodea",5);
                    break;
                case 8:
                    userManagementSystem.deleteAllUsers();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        // I close the connection to clear unused resources
        userManagementSystem.closeConnection();
    }
}
