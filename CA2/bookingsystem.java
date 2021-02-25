import java.util.*;

public class bookingsystem {
    // Properties
    private ArrayList<bookableRoom> bookableRooms;
    private ArrayList<assistantOnShift> assistantOnShift;
    private ArrayList<bookings> bookings;

    // Get Functions
/** 
* This returns the bookable rooms
* @return bookableRooms
*/
    public ArrayList<bookableRoom> getBookableRooms() {
        return this.bookableRooms;
    }
/** 
* This returns the assistants on shift
* @return assistantOnShift
*/
    public ArrayList<assistantOnShift> getAssistantOnShifts() {
        return this.assistantOnShift;
    }
/** 
* This returns the bookings
* @return bookings
*/
    public ArrayList<bookings> getBookings() {
        return this.bookings;
    }

    // Set Functions
/** 
* This sets the bookable rooms
*/
    public void setBookableRooms(ArrayList<bookableRoom> bookableRooms) {
        this.bookableRooms = bookableRooms;
    }
/** 
* This sets the assistants on shift
*/
    public void setAssistantOnShift(ArrayList<assistantOnShift> assistantOnShift) {
        this.assistantOnShift = assistantOnShift;
    }
/** 
* This sets the bookings
*/
    public void setBookings(ArrayList<bookings> bookings) {
        this.bookings = bookings;
    }

    // Constructors
    public bookingsystem() {
        setBookableRooms(new ArrayList<bookableRoom>());
        setAssistantOnShift(new ArrayList<assistantOnShift>());
        setBookings(new ArrayList<bookings>());
    }

    public bookingsystem(ArrayList<bookableRoom> bookableRooms, ArrayList<assistantOnShift> assistantOnShift,
            ArrayList<bookings> bookings) {
        // Call default constructor
        this();
        // Set Values
        setBookableRooms(bookableRooms);
        setAssistantOnShift(assistantOnShift);
        setBookings(bookings);
    }

    // Methods

    // Bookable Rooms
/** 
* This method adds bookable rooms
* @param newRoom argument to create bookable room
* @param newTimeSlot argument for the timeslot
* @param newTime for the date
*/
    public void addBookableRoom(room newRoom, Date newTimeSlot, Date newTime) {
        var newRecord = new bookableRoom(newRoom, newTimeSlot, 0, "EMPTY");
        getBookableRooms().add(newRecord);
    }
/** 
 * * This method adds assistants on shift
* @param newAssistant argument to create assistant on shift
* @param newTimeSlot argument for the timeslot
*/
    public void addAssistantOnShift(assistant newAssistant, Date newTimeSlot) {
        // 1 User Input should create 3 assistants
        var newRecord1 = new assistantOnShift(newAssistant, newTimeSlot, "FREE");
        var newRecord2 = new assistantOnShift(newAssistant, newTimeSlot, "FREE");
        var newRecord3 = new assistantOnShift(newAssistant, newTimeSlot, "FREE");
        getAssistantOnShifts().add(newRecord1);
        getAssistantOnShifts().add(newRecord2);
        getAssistantOnShifts().add(newRecord3);
    }
/** 
* This method matches the checks if a bookable room and assistant on shift have the same time slot
*/
    public void matchAssistantWithRoom() {
        // If there is a bookable room and assistant on shift with the same time slot, create an availability of a booking
        getBookableRooms().retainAll(getAssistantOnShifts());
    }
/** 
*  * * This method adds bookings
* @param newIdentificationCode argument for the ID code
* @param newStudentEmail argument for the student emails
*/
    public void addBooking(int newIdentificationCode, String newStudentEmail) {
        // User wants to create a booking
        var newRecord = new bookings(newIdentificationCode, newStudentEmail, bookableRoom, assistantOnShift, "SCHEDULED");
        getBookings().add(newRecord);
    }

    // Assistants on Shift

    // Bookings
    // public void addAssistantOnShift(assistantOnShift newAssistantOnShift) {
    // // When you assign one per day, it creates 3 assistants on shifts based on
    // the
    // // time slots
    // var add1 = newAssistantOnShift;
    // var add2 = newAssistantOnShift;
    // var add3 = newAssistantOnShift;
    // add1.setTime(getTime() + " 07:00");
    // add2.setTime(getTime() + " 08:00");
    // add3.setTime(getTime() + " 09:00");
    // // Get current array
    // var currentAssistantsOnShift = getAssistantOnShifts();
    // // Creat new array with 3 additional element
    // var newAssistantsOnShift = Arrays.copyOf(currentAssistantsOnShift,
    // currentAssistantsOnShift.length + 3);
    // // Assign 3 new assistant on shift to the last 3 (new) element
    // newAssistantsOnShift[newAssistantsOnShift.length - 1] = add1;
    // newAssistantsOnShift[newAssistantsOnShift.length - 2] = add2;
    // newAssistantsOnShift[newAssistantsOnShift.length - 3] = add3;
    // // Update bookable rooms
    // setAssistantOnShift(newAssistantsOnShift);
    // }
}