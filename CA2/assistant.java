/** 
* This class is for the assistant
*/
public class assistant {
    // Properties
    private String email;
    private String name;

    // Get Functions
/** 
* This returns the email
* @return email
*/
    public String getEmail() {
        return this.email;
    }
/** 
* This returns the name
* @return name
*/
    public String getName() {
        return this.name;
    }

    // Set Functions
/** 
* This sets the email
*/
    public void setEmail(String email) {
        this.email = email;
    }
/** 
* This sets the name
*/
    public void setName(String name) {
        this.name = name;
    }

    // Constructors
    public assistant(){
    }

    public assistant(String email, String name) {
        // Call default constructor
        this();
        // Set Values
        setEmail(email);
        setName(name);
    }

    // Method
/** 
* This prints the Assistant
*/
    public void printAssistant() {
        // Prints assistant
        System.out.println(" | " + getName() + " | " + getEmail() + " | ");
    }
}
