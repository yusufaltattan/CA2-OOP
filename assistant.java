import java.util.*; 
public class assistant {
    // Properties
    private String email;
    private String name;

    // Get Functions
    public String getEmail() {
        return this.email;
    }
    public String getName() {
        return this.name;
    }

    // Set Functions
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Constructors
    public assistant(String email, String name) {
        this.email = email;
        this.name = name;
    }

    // Method
    public void printAssistant() {
        // Prints assistant
        System.out.println(" | " + this.name + " | " + this.email + " | ");
    }

}
