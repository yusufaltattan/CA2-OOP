/** 
* This class is for a Room
*/
public class room {
    // Properties
    private String code;
    private int capacity;

    // Get Functions
    
/** 
* This returns the code
* @return code
*/
    public String getCode() {
        return this.code;
    }
/** 
* This returns the capacity
* @return capacity
*/
    public int getCapacity() {
        return this.capacity;
    }

    // Set Functions
/** 
* This sets the code
*/
    public void setCode(String code) {
        this.code = code;
    }
/** 
* This sets the capacity
*/
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Constructors
    public room() {
    }

    public room(String code, int capacity) {
        // Call default constructor
        this();
        // Set Values
        setCode(code);
        setCapacity(capacity);
    }

    // Methods
/** 
* This prints the Room
*/
    public void printRoom() {
        System.out.println("| " + getCode() + " | Capacity: " + getCapacity() + " |");
    }
}
