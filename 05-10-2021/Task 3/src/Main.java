import javax.management.remote.rmi.RMIConnectionImpl_Stub;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static int checkId;

    public static void main(String[] args) {
        Customer customer1 = new Customer("Rehman", "Ahmed", "rehman", 1);
        Customer customer2 = new Customer("Ibrahim", "Mahmoud", "ibra23", 2);
        Customer customer3 = new Customer("Jens", "Nielsen", "jenno29", 3);
        Customer customer4 = new Customer("Mads", "Frederiksen", "manden34", 4);
        Customer customer5 = new Customer("Frederik", "Bo", "frederik2", 5);
        Customer customer6 = new Customer("Bent", "Skram", "bentskram91", 6);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers();
        Customer c = findCustomer(4);
        System.out.println("\n" + c);
    }

    private static void printCustomers() {
        for(Customer s : customers){
            System.out.println(s);
        }
    }

    private static Customer findCustomer(int getCustomerId) {
        Customer getCustomer = customers.get(getCustomerId - 1);
        for (Customer s : customers){
            if(s.equals(getCustomer)){
                return s;
            }
        }
        return null;
    }
}
