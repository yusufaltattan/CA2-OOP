public class bookings {
    // Properties
    private bookingsystem[] bookingSystem;
    private String time;
    private int statusBooking;
    private String studentEmail;
    
    // Get Functions
    public bookingsystem[] getBookingSystem() {
        return this.bookingSystem;
    }
    public String getTime() {
        return this.time;
    }
    public int getStatusBooking() {
        return this.statusBooking;
    }
    public String getStudentEmail() {
        return this.studentEmail;
    }

    // Set Functions
    public void setBookingSystem(bookingsystem[] bookingSystem) {
        this.bookingSystem = bookingSystem;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setStatus(int statusBooking) {
        this.statusBooking = statusBooking;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    // Constructors
    public bookings(bookingsystem[] bookingSystem, String time, int statusBooking, String studentEmail) {
        this.bookingSystem = bookingSystem;
        this.time = time;
        this.statusBooking = statusBooking;
        this.studentEmail = studentEmail;
    }

    public static void main(String[] args) {

    }
}
