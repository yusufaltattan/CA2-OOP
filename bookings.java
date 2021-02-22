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
            System.out.print("University of Knowledge - COVID test" + "\n" + "\n" + "<List Bookable Rooms Here>" + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
        } 
        else if (option.equals("2")) {
            System.out.print("University of Knowledge - COVID test"
            + "\n" + "\n" + "Adding bookable room"+ "\n" + "\n" + "<List rooms here> "+ "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
        }
        // If the booking is valid
        //    System.out.print("Bookable room added successfully:" + "\n" + "\n" + "<Print bookable room>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        // If the booking is invalid
        //    System.out.print("Error!" + "\n" + "\n" + "<Message explaining error>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        else if (option.equals("3")) {
            System.out.print("University of Knowledge - COVID test" + "\n" + "\n" + "<list bookable rooms status:EMPTY>"+ "\n" + "Removing bookable room" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID to select the bookable room to be removed." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
        }
        // If the booking removal is valid
        //    System.out.print("Bookable Room removed successfully:" + "\n" + "\n" + "<Print bookable room>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID to select the bookable room to be removed." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        // If the booking removal is invalid
        //    System.out.print("Error!" + "\n" + "\n" + "<Message explaining error>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID to select the bookable room to be removed." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        else if (option.equals("4")) {
            System.out.print("University of Knowledge - COVID test" + "\n" + "\n" + "<list assistans on shift>"+"\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
        }
        else if (option.equals("5")) {
            System.out.print("University of Knowledge - COVID test" + "\n" + "\n" + "Adding assistant on shift"+ "\n" + "\n" + "<List assistants here> "+ "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
        }
        // If the booking is valid
        //    System.out.print("Assistant on Shift added successfully:" + "\n" + "\n" + "<Print assistant on shift>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        // If the booking is invalid
        //    System.out.print("Error!" + "\n" + "\n" + "<Message explaining error>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        else if (option.equals("6")) {
            System.out.print("University of Knowledge - COVID test" + "\n" + "\n" + "<list assistant on shifts status:FREE>"+ "\n" + "Removing assistant on shift" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID to select the assistant on shift to be removed." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
        }
        // If the booking removal is valid
        //    System.out.print("Assistant on Shift removed successfully:" + "\n" + "\n" + "<Print assistant on shift>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID to select the assistant on shift to be removed." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        // If the booking removal is invalid
        //    System.out.print("Error!" + "\n" + "\n" + "<Message explaining error>"+ "\n" + "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID to select the assistant on shift to be removed." + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");

        else if (option.equals("7")) {
            System.out.print("University of Knowledge - COVID test" + "\n" + "\n" + "Select which booking to list:" + "\n" + "1. All" + "\n" + "2. Only bookings status: SCHEDULED" + "\n" + "3. Only bookings status: COMPLETED" + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
            Scanner sca = new Scanner(System.in);
            String option7 = sca.nextLine();

            if (option7.equals("1")) {
                System.out.println("<List all bookings>" + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
            }
            else if (option7.equals("2")) {
                System.out.println("<List SCHEDULED bookings>" + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
            }
            else if (option7.equals("3")) {
                System.out.println("<List COMPLETED bookings>" + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
            }
            else {
                System.out.println("<List all bookings>" + "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n");
            }
        }
        else if (option.equals("8")) {
            System.out.print("University of Knowledge - COVID test" + "\n" + "\n" + "Adding booking (appointment for a COVID test) to the system" + "\n" + "\n" + "List of available time-slots:" + "11. dd/mm/yyyy HH:");
        }
        else if (option.equals("9")) {
            System.out.print("You chose option 9");
        }

    }
}
