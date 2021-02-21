public class bookingsystem {
    // Properties
    private bookableRoom[] bookableRooms;
    private assistantOnShift[] assistantOnShift;
    private bookings[] bookings;
    private String time;

    // Get Functions
    public bookableRoom[] getBookableRooms() {
        return this.bookableRooms;
    }
    public assistantOnShift[] getAssistantOnShifts() {
        return this.assistantOnShift;
    }
    public bookings[] getBookings() {
        return this.bookings;
    }
    public String getTime() {
        return this.time;
    }

    // Set Functions
    public void setBookableRooms(bookableRoom[] bookableRooms) {
        this.bookableRooms = bookableRooms;
    }
    public void setAssistantOnShift(assistantOnShift[] assistantOnShift) {
        this.assistantOnShift = assistantOnShift;
    }
    public void setBookings(bookings[] bookings) {
        this.bookings = bookings;
    }
    public void setTime(String time) {
        this.time = time;
    }

    // Constructors
    public bookingsystem(bookableRoom[] bookableRooms,assistantOnShift[] assistantOnShift, bookings[] bookings, String time) {
        this.bookableRooms = bookableRooms;
        this.assistantOnShift = assistantOnShift;
        this.bookings = bookings;
        this.time = time;
    }
}
