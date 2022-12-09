
import components.*;
import exception.InvalidNameException;
import order.ComputerRepairService;
import order.IAddService;
import order.Order;
import person.Customer;
import person.Employee;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.*;

public class Main  {


    public static void main(String[] args) throws InvalidNameException {
        ComputerRepairService computerRepairService = new ComputerRepairService();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            option = scanner.next();
            makeAChoice(option);
        } while (!option.equals("0"));
    }

        private static void printOptions(){
            System.out.println("Please choose one of the following options");
            System.out.println("1 - For customer");
            System.out.println("2 - For employee");
            System.out.println("0 - To exit");
        }

        private static void makeAChoice(String choice){
            Scanner scanner = new Scanner(System.in);
            switch (choice) {
                case "0":
                    System.out.println("Have a nice day");
                    break;
                case "1":
                    printCustomerOptions();
                    makeCustomerChoice(scanner.next());
                    continueOperation();
                    break;

                case "2":
                    printEmployeeOptions();
                    makeEmployeeChoice(scanner.next());
                    continueOperation();
                    break;

                default:
                    printOptions();

            }
        }

        private static void printCustomerOptions() {
            System.out.println("1 - Make an order");
            System.out.println("4 - To main page");
        }

        private static void makeCustomerChoice(String option) {
            Scanner scanner = new Scanner(System.in);
            switch (option) {
                case "1":
                    System.out.println("Please insert your name");
                    String customerName = scanner.nextLine();

                    System.out.println("Please insert your email");
                    String customerEmail = scanner.nextLine();

                    //Make customer class
                    Customer customerCreated = new Customer(customerName,customerEmail);

                    System.out.println("Please select an employee and their Id from the list");
                    ComputerRepairService.showEmployeeList();
                    String employeeName = scanner.nextLine();
                    int employeeId = Integer.parseInt(scanner.nextLine());

                    Employee employeeAssigned = new Employee(employeeName, employeeId);

                    // Add an option to pick how many components and then for loop
                    System.out.println("How many components are you looking to repair?");
                    int componentAmount = Integer.parseInt(scanner.nextLine());
                    // Make List for components
                    ArrayList<Component> componentList = new ArrayList<>();

                    for(int i = 0; i < componentAmount; i++) {

                        System.out.println("Name of component that needs repair");
                        String componentName = scanner.nextLine();
                        System.out.println("Model of component that needs repair");
                        String componentModel = scanner.nextLine();
                        System.out.println("Issue of component that needs repair");
                        int componentIssue = Integer.parseInt(scanner.nextLine());


                        if (componentName.equals("Cpu")) {
                            System.out.println("Amount of cores");
                            int coresNumber = Integer.parseInt(scanner.nextLine());
                            Cpu cpuMade = new Cpu(componentName, componentModel, componentIssue, coresNumber);
                            componentList.add(i, cpuMade);


                        } else if (componentName.equals("Keyboard")) {
                            System.out.println("Select LED color");
                            String ledColor = scanner.nextLine();
                            Keyboard keyboardMade = new Keyboard(componentName, componentModel, componentIssue, ledColor);
                            componentList.add(i, keyboardMade);

                        } else if (componentName.equals("Motherboard")) {
                            System.out.println("Ram slots");
                            int ramSlots = Integer.parseInt(scanner.nextLine());
                            Motherboard motherboardMade = new Motherboard(componentName, componentModel, componentIssue, ramSlots);
                            componentList.add(i, motherboardMade);

                        } else if (componentName.equals("Ram")) {
                            System.out.println("Amount of ram");
                            int ramAmount = Integer.parseInt(scanner.nextLine());
                            Ram ramMade = new Ram(componentName, componentModel, componentIssue, ramAmount);
                            componentList.add(i, ramMade);

                        } else if (componentName.equals("Storage")) {
                            System.out.println("Amount of storage");
                            int storageSize = Integer.parseInt(scanner.nextLine());
                            Storage storageMade = new Storage(componentName, componentModel, componentIssue, storageSize);
                            componentList.add(i, storageMade);

                        } else {
                            System.out.println("Incorrect component name");
                            break;
                        }
                    }

                    // Add a list for order number to be able to save ordernumber and access your order later
                    Order orderCreated = new Order(ComputerRepairService.getOrderAmount(), customerCreated, employeeAssigned, componentList);
                    ComputerRepairService.addOrder(orderCreated);
                    System.out.println("Order was created, your order number is: " + ComputerRepairService.getOrderAmount());
                    ComputerRepairService.increaseOrderAmount();

                    break;

                case "4":
                    printOptions();
                    do {
                        option = scanner.next();
                        makeAChoice(option);
                    } while (!option.equals("0"));
                    break;
            }
        }

    private static void printEmployeeOptions() {
        System.out.println("1 - Add to employee list");
        System.out.println("2 - Remove order");
        System.out.println("3 - Show list of orders");
        System.out.println("0 - To main page");
    }

    private static void makeEmployeeChoice(String option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case "1":
                System.out.println("Name of employee");
                String employeeName = scanner.nextLine();
                System.out.println("Id of employee");
                int employeeId = Integer.parseInt(scanner.nextLine());

                Employee employeeCreated = new Employee(employeeName, employeeId);
                ComputerRepairService.addEmployee(employeeCreated);

                break;
            case "2":
                System.out.println("Insert Order Number");
                int orderNumber = Integer.parseInt(scanner.nextLine());

                ComputerRepairService.removeFromOrderList(orderNumber);
                break;
            case "3":
                ComputerRepairService.showOrderList();
            case "0":
                printOptions();
                do {
                    option = scanner.next();
                    makeAChoice(option);
                } while (!option.equals("0"));
                break;
        }
    }

    public static void continueOperation() {
        System.out.println("Click 1 to go main page");
        System.out.println("Click 0 to exit     ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                printOptions();
                break;
            case "0":
                System.out.println("Have a nice day");
                break;
            default:
                System.out.println("Please chose an option");
                continueOperation();
                break;
        }
    }

    }


