package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class bankAccountDAO {
    List<bankAccount> accounts = new ArrayList<>();
    public boolean addAccount(bankAccount a, String id, int balance, customer b){
        for (bankAccount account : accounts) {
            String aId = account.getId();
            if (aId.equalsIgnoreCase(id)) {
                return false;
            }
        }
        accounts.add(a);
        a.setId(id);
        a.setBalance(balance);
        a.setA(b);
        return true;
    }
    public String findAccount(String firstName, String lastName){
        for (int i=0;i<accounts.size();i++){
            String aFirstName = accounts.get(i).getA().getFirstName();
            String aLastName = accounts.get(i).getA().getLastname();
            if (firstName.equalsIgnoreCase(aFirstName) && (lastName.equalsIgnoreCase(aLastName))){
                return accounts.get(i).getA().getFirstName() + " " + accounts.get(i).getA().getLastname() + " Id: " + accounts.get(i).getId();
            }
        }
        return "";
    }
    public void removeAccount(bankAccount a){
        accounts.remove(a);
    }
    public List<bankAccount> findAccountByCustomer(int id){
        List<bankAccount> allAccounts = new ArrayList<>();
        for (int i=0;i<accounts.size();i++){
            String aFirstName = accounts.get(i).getA().getFirstName();
            String aLastName = accounts.get(i).getA().getLastname();
            if (id == accounts.get(i).getA().getIdentifier()){
                allAccounts.add(accounts.get(i));

            }
        }
        for (int i=0;i<allAccounts.size();i++){
            String n = "Id: " + allAccounts.get(i).getId();
            System.out.println(n);

        }
        return allAccounts;
    }
}
