import java.util.*; 
public class room {
    // Properties
    private String code;
    private int capacity;

    // Get Functions
    public String getCode() {
        return this.code;
    }
    public int getCapacity() {
        return this.capacity;
    }

    // Set Functions
    public void setCode(String code) {
        this.code = code;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Constructors
    public room() {
    }
    public room(String code, int capacity) {
        // Call default constructor
        this();
        // Set values
        setCode(code);
        setCapacity(capacity);
    }

    // Methods
    public void printRoom() {
        // Prints Room
        System.out.println("|" + getCode() + "| Capacity: " + getCapacity() + "|");
    }
}
