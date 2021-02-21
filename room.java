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
    public room(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
    }

    // Methods
    public void printRoom(String code, int capacity) {
        if (this.capacity < 1) {
            System.out.print("Capacity must be above zero.");
        }
        // Make sure that code is unique

        System.out.println("|" + this.code + "| Capacity: " + this.capacity + "|");
    }
}
