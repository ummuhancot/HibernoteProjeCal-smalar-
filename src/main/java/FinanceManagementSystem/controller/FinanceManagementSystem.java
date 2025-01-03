package FinanceManagementSystem.controller;

import FinanceManagementSystem.domain.InCame;
import FinanceManagementSystem.repository.InComeRepository;
import FinanceManagementSystem.repository.OutComeRepository;
import FinanceManagementSystem.repository.UserRepository;
import FinanceManagementSystem.service.InComeService;
import FinanceManagementSystem.service.OutComeService;
import FinanceManagementSystem.service.UserService;

import java.util.Scanner;

public class FinanceManagementSystem {

    private static Scanner scanner=new Scanner(System.in);

    public static UserRepository userRepository = new UserRepository();
    public static UserService userService = new UserService(userRepository);


    public static InComeRepository inComeRepository = new InComeRepository();
    public static InComeService inComeService = new InComeService(inComeRepository);


    public static OutComeRepository outComeRepository = new OutComeRepository();
    public static OutComeService outComeService = new OutComeService(outComeRepository);





    public static void start() {


        int choice;

        do {
            System.out.println("======Finance Management System========0");
            System.out.println("1.User Operations");
            System.out.println("2.Income Operations");
            System.out.println("3.Outcome Operations");
            System.out.println("0.Exit");
            System.out.println(" Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayUserOperationsMenu(userService);
                    break;
                case 2:
                    displayInComeUserOperationsMenu(inComeService);
                    break;
                case 3:
                    displayOutComeUserOperationsMenu(outComeService);
                    break;
                case 0:
                    System.out.println("Bye by.....");
                    break;
                default:
                    System.out.println("Invalid choice,please try again");            }
                    break;

        } while (choice != 0);


    }

    private static void displayOutComeUserOperationsMenu(OutComeService outComeService) {


        boolean exit=false;
        while (!exit) {
            System.out.println("====OutcomeOperations====");
            System.out.println("1.Add a new Outcome");
            System.out.println("2.Find Outcome by ID ");
            System.out.println("3.Find All Outcome  ");
            System.out.println("4.Delete Outcome by ID ");
            System.out.println("5.Update Outcome by ID");
            System.out.println("0.Return to Main Menu");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    outComeService.addNewOutCome();
                    break;
                case 2:
                    outComeService.findOutComeById();
                    break;
                case 3:
                    outComeService.findAllOutCome();
                    break;
                case 4:
                    outComeService.deleteOutComeById();
                    break;
                case 5:
                    outComeService.updateOutComeById();
                    break;

                case 0:
                    exit=true;
                    System.out.println("Returning to main memu");

                    break;
                default:
                    System.out.println("Invalid choice,please try again");
                    break;
            }
        }


    }

    private static void displayInComeUserOperationsMenu(InComeService inComeService) {

            boolean exit = false;
            while (!exit) {
                System.out.println("====IncomeOperations====");
                System.out.println("1.Add a new Income");
                System.out.println("2.Find Income by ID ");
                System.out.println("3.Find All come  ");
                System.out.println("4.Delete Income by ID ");
                System.out.println("5.Update Income by ID");
                System.out.println("0.Return to Main Menu");
                System.out.println("Enter your choice");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        inComeService.addNewInCome();
                        break;
                    case 2:
                        inComeService.findInComeById();
                        break;
                    case 3:
                        inComeService.findAllInCome();
                        break;
                    case 4:
                        inComeService.deleteInComeById();
                        break;
                    case 5:
                        inComeService.updateInComeById();
                        break;

                    case 0:
                        exit=true;
                        System.out.println("Returning to main memu");

                        break;

                    default:
                        System.out.println("Invalid choice,please try again");
                        break;
                }
            }

    }

    private static void displayUserOperationsMenu(UserService userService) {


            boolean exit = false;
            while (!exit) {
                System.out.println("====UserOperations====");
                System.out.println("1.Add a new User");
                System.out.println("2.Find User by ID ");
                System.out.println("3.Find All User  ");
                System.out.println("4.Delete Userby ID ");
                System.out.println("5.Update User by ID");
                System.out.println("0.Return to Main Menu");
                System.out.println("Enter your choice");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        userService.addNewUser();
                        break;
                    case 2:
                        userService.findUserById();
                        break;
                    case 3:
                        userService.findAllUser();
                        break;
                    case 4:
                        userService.deleteUserById();

                        break;
                    case 5:
                        userService.updateUserById();
                        break;
                    case 0:
                        exit=true;
                        System.out.println("Returning to main memu");
                        break;

                    default:
                        System.out.println("Invalid choice,please try again");
                        break;
                }
            }
    }


}
