
import components.*;
import exception.InvalidComponentException;
import exception.InvalidEmailException;
import exception.InvalidNameException;
import order.ComputerRepairService;

import order.Order;
import person.Customer;
import person.Employee;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.*;

public class Main  {
    private static final Logger LOGGER = Logger.getLogger("Computer Repair Service Log");


    public static void main(String[] args) throws InvalidNameException, InvalidEmailException, InvalidComponentException {
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            option = scanner.next();
            makeAChoice(option);
        } while (!option.equals("0"));
    }

        private static void printOptions(){
            LOGGER.info("Please choose one of the following options");
            LOGGER.info("1 - For customer");
            LOGGER.info("2 - For employee");
            LOGGER.info("0 - To exit");
        }

        private static void makeAChoice(String choice) throws InvalidNameException, InvalidEmailException, InvalidComponentException {
            Scanner scanner = new Scanner(System.in);
            switch (choice) {
                case "0":
                    LOGGER.info("Have a nice day");
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
            LOGGER.info("1 - Make an order");
            LOGGER.info("2 - Check order balance");
            LOGGER.info("9 - To main page");
        }

        private static void makeCustomerChoice(String option) throws InvalidNameException, InvalidEmailException, InvalidComponentException {
            Scanner scanner = new Scanner(System.in);
            switch (option) {
                case "1":
                    LOGGER.info("Please insert your name");
                    String customerName = scanner.nextLine();

                    LOGGER.info("Please insert your email");
                    String customerEmail = scanner.nextLine();

                    //Make customer class
                    Customer customerCreated = new Customer(customerName,customerEmail);

                    LOGGER.info("Please select an employee and their Id from the list");
                    ComputerRepairService.showEmployeeList();
                    String employeeName = scanner.nextLine();
                    int employeeId = Integer.parseInt(scanner.nextLine());

                    Employee employeeAssigned = new Employee(employeeName, employeeId);

                    // Add an option to pick how many components and then for loop
                    LOGGER.info("How many components are you looking to repair?");
                    int componentAmount = Integer.parseInt(scanner.nextLine());
                    // Make List for components
                    ArrayList<Component> componentList = new ArrayList<>();

                    for(int i = 0; i < componentAmount; i++) {

                        LOGGER.info("Name of component that needs repair");
                        String componentName = scanner.nextLine();
                        LOGGER.info("Model of component that needs repair");
                        String componentModel = scanner.nextLine();
                        LOGGER.info("Issue of component that needs repair");
                        int componentIssue = Integer.parseInt(scanner.nextLine());


                        switch (componentName) {
                            case "Cpu":
                                LOGGER.info("Amount of cores");
                                int coresNumber = Integer.parseInt(scanner.nextLine());
                                Cpu cpuMade = new Cpu(componentName, componentModel, componentIssue, coresNumber);
                                componentList.add(i, cpuMade);


                                break;
                            case "Keyboard":
                                LOGGER.info("Select LED color");
                                String ledColor = scanner.nextLine();
                                Keyboard keyboardMade = new Keyboard(componentName, componentModel, componentIssue, ledColor);
                                componentList.add(i, keyboardMade);

                                break;
                            case "Motherboard":
                                LOGGER.info("Ram slots");
                                int ramSlots = Integer.parseInt(scanner.nextLine());
                                Motherboard motherboardMade = new Motherboard(componentName, componentModel, componentIssue, ramSlots);
                                componentList.add(i, motherboardMade);

                                break;
                            case "Ram":
                                LOGGER.info("Amount of ram");
                                int ramAmount = Integer.parseInt(scanner.nextLine());
                                Ram ramMade = new Ram(componentName, componentModel, componentIssue, ramAmount);
                                componentList.add(i, ramMade);

                                break;
                            case "Storage":
                                LOGGER.info("Amount of storage");
                                int storageSize = Integer.parseInt(scanner.nextLine());
                                Storage storageMade = new Storage(componentName, componentModel, componentIssue, storageSize);
                                componentList.add(i, storageMade);

                                break;
                            default:
                                throw new InvalidComponentException("Invalid component name given");
                        }

                    }

                    // Add a list for order number to be able to save ordernumber and access your order later
                    Order orderCreated = new Order(ComputerRepairService.getOrderAmount(), customerCreated, employeeAssigned, componentList);
                    ComputerRepairService.addOrder(orderCreated);
                    LOGGER.info("Order was created, your order number is: " + ComputerRepairService.getOrderAmount());
                    ComputerRepairService.increaseOrderAmount();

                    break;
                case "2":
                    LOGGER.info("Insert your Order Number");
                    int orderNumber = Integer.parseInt(scanner.nextLine());
                    Order order = ComputerRepairService.getOrder(orderNumber);

                    ArrayList<Component> componentListInOrder = order.getComponentList();
                    int totalCost = ComputerRepairService.repairPartCost(componentListInOrder);
                    LOGGER.info(totalCost);

                    break;

                case "9":
                    printOptions();
                    do {
                        option = scanner.next();
                        makeAChoice(option);
                    } while (!option.equals("0"));
                    break;
            }
        }

    private static void printEmployeeOptions() {
        LOGGER.info("1 - Add to employee list");
        LOGGER.info("2 - Remove order");
        LOGGER.info("3 - Show list of orders");
        LOGGER.info("9 - To main page");
    }

    private static void makeEmployeeChoice(String option) throws InvalidNameException, InvalidEmailException, InvalidComponentException {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case "1":
                LOGGER.info("Name of employee");

                String employeeName = scanner.nextLine();
                LOGGER.info("Id of employee");
                int employeeId = Integer.parseInt(scanner.nextLine());

                Employee employeeCreated = new Employee(employeeName, employeeId);
                ComputerRepairService.addEmployee(employeeCreated);

                break;
            case "2":
                LOGGER.info("Insert Order Number");
                int orderNumber = Integer.parseInt(scanner.nextLine());

                ComputerRepairService.removeFromOrderList(orderNumber);
                break;
            case "3":
                ComputerRepairService.showOrderList();
            case "9":
                printOptions();
                do {
                    option = scanner.next();
                    makeAChoice(option);
                } while (!option.equals("0"));
                break;
        }
    }

    public static void continueOperation() {
        LOGGER.info("Click 1 to go main page");
        LOGGER.info("Click 0 to exit     ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                printOptions();
                break;
            case "0":
                LOGGER.info("Have a nice day");
                break;
            default:
                LOGGER.info("Please chose an option");
                continueOperation();
                break;
        }
    }

    }


