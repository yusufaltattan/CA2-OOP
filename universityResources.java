import java.util.Arrays;

public class universityResources {
    // Properties
    private room[] rooms;
    private assistant[] assistants;

    // Get Functions
    public room[] getRooms() {
        return this.rooms;
    }
    public assistant[] getAssistants() {
        return this.assistants;
    }

    // Set Functions
    public void setRooms(room[] rooms) {
        this.rooms = rooms;
    }
    public void setAssistants(assistant[] assistants) {
        this.assistants = assistants;
    }
    
    // Constructors
    public universityResources() {
        setRooms(new room[] {});
        setAssistants(new assistant[] {});
    }
    public universityResources(room[] rooms, assistant[] assistants) {
        // Call default constructor
        this();
        // Set Values
        setRooms(rooms);
        setAssistants(assistants);
    }

    // Methods
    public void addRoom(room newRoom) {
        // Check if Capacity is greater than 0
        if (newRoom.getCapacity() <= 0) {
            System.out.print("Could not add room, capacity must be above zero.");
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
                System.out.print("Could not add room, code must be unique.");
            } else {
                // Code is Unique
                // Get current rooms array
                var currentRooms = getRooms();
                // Create new array with additional element
                var newRooms = Arrays.copyOf(currentRooms, currentRooms.length + 1);
                // Assign new room to the last (new) element
                newRooms[newRooms.length - 1] = newRoom;
                // Update object
                setRooms(newRooms);
            }
        }
    }

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
                var currentAssistants = getAssistants();
                // Creat new array with additionall element
                var newAssistants = Arrays.copyOf(currentAssistants, currentAssistants.length + 1);
                // Assign new assistant to the last (new) element
                newAssistants[newAssistants.length - 1] = newAssistant;
                // Update Object
                setAssistants(newAssistants);
            }
        }
    }
    public static void main(String[] args) {
        var universityResources = new universityResources();
        universityResources.addRoom(new room("1", 1));
        universityResources.addRoom(new room("1", 1));
        universityResources.addRoom(new room("2", 0));
        universityResources.addAssistant(new assistant("2", "2"));
        universityResources.addAssistant(new assistant("2@uok.ac.uk", "2"));
        universityResources.addAssistant(new assistant("2@uok.ac.uk", ""));
    }


    // public static room[] getStaticDataRoom() {3
    //     room roomOne = new room("RoomOne", 3);
    //     room roomTwo = new room("RoomTwo", 3);
    //     room roomThree = new room("RoomThree", 3);
    //     return new room[]{roomOne, roomTwo, roomThree};
    // }
    // public static assistant[] getStaticDataAssistant() {
    //     assistant Al = new assistant("al@uok.ac.uk", "Al");
    //     assistant Barry = new assistant("barry@uok.ac.uk", "Barry");
    //     assistant Charlie = new assistant("charlie@uok.ac.uk", "Charlie");
    //     return new assistant[]{Al, Barry, Charlie};
    // }

}
