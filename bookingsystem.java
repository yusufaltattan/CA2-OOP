import java.util.Arrays;

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
    public bookingsystem() {
        setBookableRooms(new bookableRoom[] {});
        setAssistantOnShift(new assistantOnShift[] {});
    }
    public bookingsystem(bookableRoom[] bookableRooms,assistantOnShift[] assistantOnShift, bookings[] bookings, String time) {
        this();
        setBookableRooms(bookableRooms);
        setAssistantOnShift(assistantOnShift);
        setBookings(bookings);
        setTime(time);
    }

    // Methods
    public void addBookableRoom(bookableRoom newBookableRoom) {
        // Make sure occupancy is not more than capacity
        if (bookableRoom.getOccupancy() >= room.getCapacity()); {
            System.out.println("Cannot create bookable room, occupancy cannot be greater than capacity.");
        } else {
            // Occupancy is fine
            // Create rooms
            // Get current bookable rooms array
            var currentBookableRooms = getBookableRooms();
            // Creat new array with additional element
            var newBookableRooms = Arrays.copyOf(currentBookableRooms, currentBookableRooms.length + 1);
            // Assign new bookable room to the last (new) element
            newBookableRooms[newBookableRooms.length - 1] = newBookableRoom;
            // Update bookable rooms
            setBookableRooms(newBookableRooms);
        }       
    }

    public void addAssistantOnShift(assistantOnShift newAssistantOnShift) {
        // When you assign one per day, it creates 3 assistants on shifts based on the time slots
        var add1 = newAssistantOnShift;
        var add2 = newAssistantOnShift;
        var add3 = newAssistantOnShift;
        add1.setTime(getTime() + " 07:00"); 
        add2.setTime(getTime() + " 08:00"); 
        add3.setTime(getTime() + " 09:00"); 
        // Get current array
        var currentAssistantsOnShift = getAssistantOnShifts();
        // Creat new array with 3 additional element
        var newAssistantsOnShift = Arrays.copyOf(currentAssistantsOnShift, currentAssistantsOnShift.length + 3);
        // Assign 3 new assistant on shift to the last 3 (new) element
        newAssistantsOnShift[newAssistantsOnShift.length - 1] = add1;
        newAssistantsOnShift[newAssistantsOnShift.length - 2] = add2;
        newAssistantsOnShift[newAssistantsOnShift.length - 3] = add3;
        // Update bookable rooms
        setAssistantOnShift(newAssistantsOnShift);
    }
    public static void main(String[] args) {
        var bookingsystem = new bookingsystem();
        bookingsystem.addAssistantOnShift(new assistantOnShift("24/02/2021", 3));
        System.out.println(bookingsystem.getAssistantOnShifts()[0].getTime());
    }
}
