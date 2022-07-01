package se.lexicon;

public class customer {
    private String firstName;
    private String lastname;
    private String email;
    private int identifier = 0;
    private static int uid = 0;

    /*   public customer(String firstName, String lastname, String email) {
           this.identifier = ++uid;
           this.firstName = firstName;
           this.lastname = lastname;
           this.email = email;
       }
   */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.identifier = uid++;
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
}
