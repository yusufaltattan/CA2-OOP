import java.util.*;

public class bookingsystem {
    // Properties
    private ArrayList<bookableRoom> bookableRooms;
    private ArrayList<assistantOnShift> assistantOnShift;
    private ArrayList<bookings> bookings;

    // Get Functions
    /**
     * This returns the bookable rooms
     * 
     * @return bookableRooms
     */
    public ArrayList<bookableRoom> getBookableRooms() {
        return this.bookableRooms;
    }

    /**
     * This returns the assistants on shift
     * 
     * @return assistantOnShift
     */
    public ArrayList<assistantOnShift> getAssistantOnShifts() {
        return this.assistantOnShift;
    }

    /**
     * This returns the bookings
     * 
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
     * 
     * @param newRoom     argument to create bookable room
     * @param newTimeSlot argument for the timeslot
     * @param newTime     for the date
     */
    public void addBookableRoom(room newRoom, Date newTimeSlot) {
        var newRecord = new bookableRoom(newRoom, newTimeSlot, 0, "EMPTY");
        getBookableRooms().add(newRecord);
    }
    /**
     * This method adds bookable rooms
     * 
     * @param newRoom     argument to create bookable room
     * @param newTimeSlot argument for the timeslot
     * @param newTime     for the date
     */
    public void addBookableRoomTwo(room newRoom, Date newTimeSlot, int occupancy, String newRoomStatus) {
        var newRecord = new bookableRoom(newRoom, newTimeSlot, occupancy, newRoomStatus);
        getBookableRooms().add(newRecord);
    }

    /**
     * This method removes bookable rooms
     */
    public void removeBookableRoom(int Index) {
        getBookableRooms().remove(Index);
    }

    /**
     * * This method adds assistants on shift
     * 
     * @param newAssistant argument to create assistant on shift
     * @param newTimeSlot  argument for the timeslot
     */
    public void addAssistantOnShift(assistant newAssistant, Date newTimeSlot) {
        // 1 User Input should create 3 assistants
        var newRecord = new assistantOnShift(newAssistant, newTimeSlot, "FREE");
        getAssistantOnShifts().add(newRecord);
    }
        /**
     * * This method adds assistants on shift
     * 
     * @param newAssistant argument to create assistant on shift
     * @param newTimeSlot  argument for the timeslot
     */
    public void addAssistantOnShiftTwo(assistant newAssistant, Date newTimeSlot, String newStatus) {
        // 1 User Input should create 3 assistants
        var newRecord = new assistantOnShift(newAssistant, newTimeSlot, newStatus);
        getAssistantOnShifts().add(newRecord);
    }
    /**
     * This method removes assistants on shift
     */
    public void removeAssistantOnShift(int Index) {
        getAssistantOnShifts().remove(Index);
    }

    /**
     * * * This method adds bookings
     * 
     * @param newIdentificationCode argument for the ID code
     * @param newStudentEmail       argument for the student emails
     */
    public void addBooking(String newStudentEmail, bookableRoom newBookableRoom, Date newTimeSlot, assistantOnShift newAssistantOnShift) {
        // User wants to create a booking
        var newRecord = new bookings(newStudentEmail, newBookableRoom, newAssistantOnShift, newTimeSlot, "SCHEDULED");
        getBookings().add(newRecord);
    }
        /**
     * * * This method adds bookings
     * 
     * @param newIdentificationCode argument for the ID code
     * @param newStudentEmail       argument for the student emails
     */
    public void addBookingTwo(String newStudentEmail, bookableRoom newBookableRoom, Date newTimeSlot, assistantOnShift newAssistantOnShift, String newbookingStatus) {
        // User wants to create a booking
        var newRecord = new bookings(newStudentEmail, newBookableRoom, newAssistantOnShift, newTimeSlot, newbookingStatus);
        getBookings().add(newRecord);
    }
    /**
     * This method removes bookings
     */
    public void removeBooking(int Index) {
        getBookings().remove(Index);
    }

}