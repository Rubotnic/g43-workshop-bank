package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class customerDAO {
    List<customer> customers = new ArrayList<>();

    public boolean addCustomers(customer a, String firstName, String lastName, String email) {
        for (int i=0;i<customers.size();i++){
            String aEmail = customers.get(i).getEmail();
            if (email.equalsIgnoreCase(aEmail)){
                return false;
            }
        }
        a.setFirstName(firstName);
        a.setLastname(lastName);
        a.setEmail(email);
        return true;
    }
    public boolean addCustomerToArray(customer a, bankAccountDAO bA){
        String c = bA.findAccount(a.getFirstName(), a.getLastname());
        if (!c.equals("")) {
            customers.add(a);
            return true;
        }
        return false;
    }

    public String findCustomer(String firstName, String lastName){
        for (se.lexicon.customer customer : customers) {
            String aFirstName = customer.getFirstName();
            String aLastName = customer.getLastname();
            if (firstName.equalsIgnoreCase(aFirstName) || (lastName.equalsIgnoreCase(aLastName))) {
                return customer.getFirstName() + " " + customer.getLastname();
            }
        }
        return "";
    }
    public void removeCustomer(customer a){
        customers.remove(a);
    }
}
