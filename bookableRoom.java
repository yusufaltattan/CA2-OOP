import java.util.Date;

public class bookableRoom {
    // Properties
    private room Room;
    private Date timeSlot;
    private int occupancy;
    private String statusRoom;

    // Get Functions
    public room getRoom() {
        return this.Room;
    }
    public Date getTimeSlot() {
        return this.timeSlot;
    }
    public int getOccupancy() {
        return this.occupancy;
    }
    public String getStatusRoom() {
        return this.statusRoom;
    }

    // Set Functions
    public void setRoom(room Room) {
        this.Room = Room;
    }
    public void setTimeSlot(Date timeSlot) {
        this.timeSlot = timeSlot;
    }
    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }
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
    public void printBookableRoom() {
        System.out.println(" | " + getTimeSlot() + " | " + getStatusRoom() + " | " + Room.getCode() + " | " + "Occupancy:"+ getOccupancy());
    }

}