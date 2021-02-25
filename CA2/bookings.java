import java.text.SimpleDateFormat;
import java.util.Date;
/** 
* This class is for the bookings
*/
public class bookings {
    // Properties
    private int identificationCode;
    private String studentEmail;
    private bookableRoom bookableRoom;
    private assistantOnShift assistantOnShift;
    private Date TimeSlot;
    private String statusBooking;

    // Get Functions
/** 
* This returns the identification code
* @return identificationCode
*/
    public int getIdentificationCode() {
        return this.identificationCode;
    }
/** 
* This returns the bookable room
* @return bookableRoom
*/
    public bookableRoom getBookableRoom() {
        return this.bookableRoom;
    }
/** 
* This returns the assistant on shift
* @return assistantOnShift
*/
    public assistantOnShift getAssistantOnShift() {
        return this.assistantOnShift;
    }
/** 
* This returns the timeslot
* @return TimeSlot
*/
    public Date getTimeSlot() {
        return this.TimeSlot;
    }
/** 
* This returns the booking status
* @return statusBooking
*/
    public String getStatusBooking() {
        return this.statusBooking;
    }
/** 
* This returns the student email
* @return studentEmail
*/
    public String getStudentEmail() {
        return this.studentEmail;
    }

    // Set Functions
/** 
* This sets the identification code
*/
    public void setIdentificationCode(int identificationCode) {
        this.identificationCode = identificationCode;
    }
/** 
* This sets the bookable room
*/
    public void setBookableRoom(bookableRoom bookableRoom) {
        this.bookableRoom = bookableRoom;
    }
/** 
* This sets the assistant on shift
*/
    public void setAssistantOnShift(assistantOnShift assistantOnShift) {
        this.assistantOnShift = assistantOnShift;
    }
/** 
* This sets the timeslot
*/
    public void setTime(Date TimeSlot) {
        this.TimeSlot = TimeSlot;
    }
/** 
* This sets the status
*/
    public void setStatus(String statusBooking) {
        this.statusBooking = statusBooking;
    }
/** 
* This sets the student email
*/
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    // Constructors
    public bookings() {
    }

    public bookings(int identificationCode, String studentEmail, bookableRoom bookableRoom, assistantOnShift assistantOnShift, Date TimeSlot, String bookingStatus) {
        // Call default constructor
        this();
        // Set Values
        setIdentificationCode(identificationCode);
        setStudentEmail(studentEmail);
        setBookableRoom(bookableRoom);
        setAssistantOnShift(assistantOnShift);
        setTime(TimeSlot);
        setStatus(statusBooking);
    }

    // Methods
/** 
* This prints the booking
*/
    public void printBooking(){
        System.out.println("|" + new SimpleDateFormat("dd/mm/yyyy HH:MM").format(getTimeSlot()) + " | " + getStatusBooking() + " | " + getAssistantOnShift().getAssistant().getEmail() + " | " + getBookableRoom().getRoom() );
    }
}