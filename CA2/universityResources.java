import java.util.*;
/** 
* This class creates rooms and assistants
*/
public class universityResources {
    // Properties
    private ArrayList<room> rooms;
    private ArrayList<assistant> assistants;

    // Get Functions
/** 
* This returns the rooms
* @return rooms
*/
    public ArrayList<room> getRooms() {
        return this.rooms;
    }
/** 
* This returns the assistants
* @return assistants
*/
    public ArrayList<assistant> getAssistants() {
        return this.assistants;
    }

    // Set Functions
/** 
* Sets the rooms
*/
    public void setRooms(ArrayList<room> rooms) {
        this.rooms = rooms;
    }
/** 
* Sets the assistants
*/
    public void setAssistants(ArrayList<assistant> assistants) {
        this.assistants = assistants;
    }

    // Constructors
    public universityResources() {
        setRooms(new ArrayList<room>());
        setAssistants(new ArrayList<assistant>());
    }

    public universityResources(ArrayList<room> rooms, ArrayList<assistant> assistants) {
        // Call default constructor
        this();
        // Set Values
        setRooms(rooms);
        setAssistants(assistants);
    }

    // Methods
/** 
* This method creates a room
*/
    public void addRoom(room newRoom) {
        // Check if Capacity is greater than 0
        if (newRoom.getCapacity() <= 0) {
            System.out.println("Could not add room, capacity must be above zero.");
        } else {
            // Check if Room Code is Unique
            boolean isUnique = true;
            // Loop all current rooms
            for (room singleRoom : getRooms()) {
                if (singleRoom.getCode() == newRoom.getCode()) {
                    // Same Code Found
                    isUnique = false;
                }
            }
            if (!isUnique) {
                // Code is not Unique
                System.out.println("Could not add room, code must be unique.");
            } else {
                // Code is Unique
                getRooms().add(newRoom);
            }
        }
    }
/** 
* This method creates an assistant
*/
    public void addAssistant(assistant newAssistant) {
        // Make sure email ends with '@uok.ac.uk'
        boolean endsWithValidDomain = newAssistant.getEmail().endsWith("@uok.ac.uk");
        if (!endsWithValidDomain) {
            System.out.println("Could not add assistant, email must end with '@uok.ac.uk'.");
        } else {
            // Make sure name is not blank
            if (newAssistant.getName().isBlank()) {
                System.out.println("Could not add assistant, name cannot be empty.");
            } else {
                // Name is not blank
                // Get assistants
                getAssistants().add(newAssistant);
            }
        }
    }
/** 
* This main method just tests that room and assistants are created properly
*/
    public static void main(String[] args) {
        var universityResources = new universityResources();
        universityResources.addRoom(new room("1", 0));
        universityResources.addRoom(new room("1", 1));
        universityResources.addRoom(new room("3", 1));
        universityResources.addAssistant(new assistant("2", "2"));
        universityResources.addAssistant(new assistant("2@uok.ac.uk", "2"));
        universityResources.addAssistant(new assistant("2@uok.ac.uk", ""));
    }
}