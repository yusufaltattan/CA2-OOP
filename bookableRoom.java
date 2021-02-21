public class bookableRoom {
    // Properties
    private universityResources[] rooms;
    private String time; // Need to implement actual time? or just 3 time slots?
    private int occupancy;
    private int statusRoom; // Not sure whether to implement using 1 = FirstStatus, 2 = Second... or using Enum
     
    // Get Functions
    public universityResources[] getRooms() {
        return this.rooms; // Do I need to do this?
    }
    public String getTime() {
        return this.time;
    }
    public int getOccupancy() {
        return this.occupancy;
    }
    public int getStatusRoom() {
        return this.statusRoom;
    }

    // Set Functions
    public void setRooms(universityResources[] rooms) {
        this.rooms = rooms;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }
    public void setStatusRoom(int statusRoom) {
        this.statusRoom = statusRoom;
    }

    // Constructors
    public bookableRoom(universityResources[] rooms, String time, int occupancy, int statusRoom) {
        this.rooms = rooms;
        this.time = time;
        this.occupancy = occupancy;
        this.statusRoom = statusRoom;
    }

}
