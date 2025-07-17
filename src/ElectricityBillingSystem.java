import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.*;

public class ElectricityBillingSystem {
    private ArrayList<Customer> customers;
    private ArrayList<Bill> bills;

    public ElectricityBillingSystem() {
        customers = new ArrayList<>();
        bills = new ArrayList<>();
    }

    public void addCustomer(String name, String address, int meterNumber) {
        Customer customer = new Customer(name, address, meterNumber);
        customers.add(customer);
    }

    public void generateBill(int meterNumber, double unitsConsumed) {
        Customer customer = findCustomer(meterNumber);
        if (customer != null) {
            Bill bill = new Bill(customer, unitsConsumed);
            bills.add(bill);
        } else {
            System.out.println("Customer not found!");
        }
    }

    public void displayBills() {
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }

    public Customer findCustomer(int meterNumber) {
        for (Customer customer : customers) {
            if (customer.getMeterNumber() == meterNumber) {
                return customer;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ElectricityBillingSystem system = new ElectricityBillingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Generate Bill");
            System.out.println("3. Display Bills");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter customer name: ");
                        String name = scanner.next();
                        System.out.print("Enter customer address: ");
                        String address = scanner.next();
                        System.out.print("Enter meter number: ");
                        int meterNumber = scanner.nextInt();
                        system.addCustomer(name, address, meterNumber);
                        break;
                    case 2:
                        System.out.print("Enter meter number: ");
                        int meterNumber2 = scanner.nextInt();
                        System.out.print("Enter units consumed: ");
                        double unitsConsumed = scanner.nextDouble();
                        system.generateBill(meterNumber2, unitsConsumed);
                        break;
                    case 3:
                        system.displayBills();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}

class Customer {
    private String name;
    private String address;
    private int meterNumber;

    public Customer(String name, String address, int meterNumber) {
        this.name = name;
        this.address = address;
        this.meterNumber = meterNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMeterNumber() {
        return meterNumber;
    }
}

class Bill {
    private Customer customer;
    private double unitsConsumed;
    private double amount;

    public Bill(Customer customer, double unitsConsumed) {
        this.customer = customer;
        this.unitsConsumed = unitsConsumed;
        this.amount = calculateAmount();
    }

    private double calculateAmount() {
        // Calculate the amount based on the units consumed
        // For simplicity, assume a fixed rate of Rs. 5 per unit
        return unitsConsumed * 5;
    }

    public String toString() {
        return "Bill for " + customer.getName() + " (" + customer.getMeterNumber() + ")\n" +
                "Address: " + customer.getAddress() + "\n" +
                "Units Consumed: " + unitsConsumed + "\n" +
                "Amount: Rs. " + amount;
    }
}