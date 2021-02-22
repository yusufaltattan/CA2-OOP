import java.util.*; 

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
        System.out.println("University of Knowledge - COVID test "+ "\n" + "Manage Bookings" + "\n" + "Please enter the number to select your option:" + "\n" + "To manage Bookable Rooms:" + "\n" + "\t" + "1. List" + "\n" + "\t" + "2. Add" + "\n" + "\t" + "3. Remove" + "\n" + "To manage Assistans on Shift:" + "\n" + "\t" + "4. List" + "\n" + "\t" + "5. Add" + "\n" + "\t" + "6. Remove" + "\n" + "To manage Bookings:" + "\n" + "\t" + "7. List" + "\n" + "\t" + "8. Add" + "\n" + "\t" + "9. Remove" + "\n" + "\t" + " 10. Conclude" + "\n" + "After selecting one the options above, you will be presented other screens." +"\n" + "If you press 0, you will be able to return to this main menu." + "\n" + "Press -1 (or ctrl+c) to quit this application." + "\n");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        if (option.equals("1")) {
            System.out.print("You chose option 1");
        } 
        else if (option.equals("2")) {
            System.out.print("You chose option 2");
        }
        else if (option.equals("3")) {
            System.out.print("You chose option 3");
        }
        else if (option.equals("4")) {
            System.out.print("You chose option 4");
        }
        else if (option.equals("5")) {
            System.out.print("You chose option 5");
        }
        else if (option.equals("6")) {
            System.out.print("You chose option 6");
        }
        else if (option.equals("7")) {
            System.out.print("You chose option 7");
        }
        else if (option.equals("8")) {
            System.out.print("You chose option 8");
        }
        else if (option.equals("9")) {
            System.out.print("You chose option 9");
        }

    }
}
