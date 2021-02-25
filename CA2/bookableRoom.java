import java.util.Date;

/** 
* This class is for the bookable room
*/
public class bookableRoom {
    // Properties
    private room Room;
    private Date timeSlot;
    private int occupancy;
    private String statusRoom;

    // Get Functions
/** 
* This returns the room
* @return Room
*/
    public room getRoom() {
        return this.Room;
    }
/** 
* This returns the timeslot
* @return timeSlot
*/
    public Date getTimeSlot() {
        return this.timeSlot;
    }
/** 
* This returns the occupancy
* @return occupancy
*/
    public int getOccupancy() {
        return this.occupancy;
    }
/** 
* This returns the room status
* @return statusRoom
*/
    public String getStatusRoom() {
        return this.statusRoom;
    }

    // Set Functions
/** 
* Sets the room
*/
    public void setRoom(room Room) {
        this.Room = Room;
    }
/** 
* Sets the timeslot
*/
    public void setTimeSlot(Date timeSlot) {
        this.timeSlot = timeSlot;
    }
/** 
* Sets the occupancy
*/
    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }
/** 
* Sets the room status
*/
    public void setStatusRoom(String statusRoom) {
        this.statusRoom = statusRoom;
    }

    // Constructors
    public bookableRoom() {
    }

    public bookableRoom(room Room, Date timeSlot, int occupancy, String statusRoom) {
        // Call default constructor
        this();
        // Set Values
        setRoom(Room);
        setTimeSlot(timeSlot);
        setOccupancy(occupancy);
        setStatusRoom(statusRoom);
    }

    // Methods
/** 
* Prints the bookable room
*/
    public void printBookableRoom() {
        System.out.println(" | " + getTimeSlot() + " | " + getStatusRoom() + " | " + Room.getCode() + " | " + "Occupancy:"+ getOccupancy());
    }
}