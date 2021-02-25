import java.util.*; 

public class bookings {
    // Properties
    private int identificationCode;
    private bookableRoom bookableRoom;
    private assistantOnShift assistantOnShift;
    private Date TimeSlot;
    private String statusBooking;
    private String studentEmail;
    
    // Get Functions
    public int getIdentificationCode() {
        return this.identificationCode;
    }
    public bookableRoom getBookableRoom() {
        return this.bookableRoom;
    }
    public assistantOnShift getAssistantOnShift() {
        return this.assistantOnShift;
    }
    public Date getTimeSlot() {
        return this.TimeSlot;
    }
    public String getStatusBooking() {
        return this.statusBooking;
    }
    public String getStudentEmail() {
        return this.studentEmail;
    }

    // Set Functions
    public void setIdentificationCode(int identificationCode) {
        this.identificationCode = identificationCode;
    }
    public void setBookableRoom(bookableRoom bookableRoom) {
        this.bookableRoom = bookableRoom;
    }
    public void setAssistantOnShift(assistantOnShift assistantOnShift) {
        this.assistantOnShift = assistantOnShift;
    }
    public void setTime(Date TimeSlot) {
        this.TimeSlot = TimeSlot;
    }
    public void setStatus(String statusBooking) {
        this.statusBooking = statusBooking;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    // Constructors
    public bookings(Date TimeSlot, String statusBooking, String studentEmail) {
        this.TimeSlot = TimeSlot;
        this.statusBooking = statusBooking;
        this.studentEmail = studentEmail;
    }

    public static void main(String[] args) {
        String entry;
        entry = "University of Knowledge - COVID test" + "\n" + "\n";
        String ending;
        ending = "\n" + "0. Back to main menu." + "\n" + "-1. Quit application." + "\n" + "\n";
        String please;
        please = "\n" + "Please, enter one of the following" + "\n" + "\n" + "The sequential ID";

        System.out.println(entry + "Manage Bookings"+ "\n" + "\n" + "Please enter the number to select your option:" + "\n"+ "\n" + "To manage Bookable Rooms:" + "\n" + "\t" + "1. List" + "\n" + "\t" + "2. Add" + "\n" + "\t" + "3. Remove" + "\n" + "To manage Assistans on Shift:" + "\n" + "\t" + "4. List" + "\n" + "\t" + "5. Add" + "\n" + "\t" + "6. Remove" + "\n" + "To manage Bookings:" + "\n" + "\t" + "7. List" + "\n" + "\t" + "8. Add" + "\n" + "\t" + "9. Remove" + "\n" + "\t" + " 10. Conclude" + "\n" + "After selecting one the options above, you will be presented other screens." +"\n" + "If you press 0, you will be able to return to this main menu." + "\n" + "Press -1 (or ctrl+c) to quit this application." + "\n"+ "\n"); 
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        if (option.equals("1")) {
            System.out.print(entry + "<List Bookable Rooms Here>" + ending);
        } 
        else if (option.equals("2")) {
            System.out.print(entry + "Adding bookable room"+ "\n" + "\n" + "<List rooms here> "+ please + " listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space." + ending);
        }
        // If the booking is valid
        //    System.out.print("Bookable room added successfully:" + "\n" + "\n" + "<Print bookable room>"+ "\n" + please + " listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space." + ending);

        // If the booking is invalid
        //    System.out.print("Error!"+ "\n" + "<Message explaining error>"+ please + " listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space." + ending);

        else if (option.equals("3")) {
            System.out.print(entry+ "<list bookable rooms status:EMPTY>"+ "\n" + "Removing bookable room" + please + " to select the bookable room to be removed." + ending);
        }
        // If the booking removal is valid
        //    System.out.print("Bookable Room removed successfully:" + "\n" + "\n" + "<Print bookable room>"+ "\n" + please + " to select the bookable room to be removed." + ending);

        // If the booking removal is invalid
        //    System.out.print("Error!" + "\n" + "<Message explaining error>"+ please + " to select the bookable room to be removed." + ending);

        else if (option.equals("4")) {
            System.out.print(entry + "<list assistants on shift>"+ending);
        }
        else if (option.equals("5")) {
            System.out.print(entry + "Adding assistant on shift"+ "\n" + "\n" + "<List assistants here> "+ please + " of an assistant and date (dd/mm/yyyy), separated by a white space." + ending);
        }
        // If the booking is valid
        //    System.out.print("Assistant on Shift added successfully:" + "\n" + "\n" + "<Print assistant on shift>"+ "\n" + please + " of an assistant and date (dd/mm/yyyy), separated by a white space." + ending);

        // If the booking is invalid
        //    System.out.print("Error!"+ "\n" + "<Message explaining error>"+ please + " of an assistant and date (dd/mm/yyyy), separated by a white space." + ending);

        else if (option.equals("6")) {
            System.out.print(entry + "<list assistant on shifts status:FREE>"+ "\n" + "Removing assistant on shift" + please + " to select the assistant on shift to be removed." + ending);
        }
        // If the booking removal is valid
        //    System.out.print("Assistant on Shift removed successfully:" + "\n" + "\n" + "<Print assistant on shift>"+ "\n" + please + " to select the assistant on shift to be removed." + ending);

        // If the booking removal is invalid
        //    System.out.print("Error!" + "\n" + "<Message explaining error>"+ please + " to select the assistant on shift to be removed." + ending);

        else if (option.equals("7")) {
            System.out.print(entry + "Select which booking to list:" + "\n" + "1. All" + "\n" + "2. Only bookings status: SCHEDULED" + "\n" + "3. Only bookings status: COMPLETED" + ending);
            Scanner sca = new Scanner(System.in);
            String option7 = sca.nextLine();

            if (option7.equals("1")) {
                System.out.println("<List all bookings>" + ending);
            }
            else if (option7.equals("2")) {
                System.out.println("<List SCHEDULED bookings>" + ending);
            }
            else if (option7.equals("3")) {
                System.out.println("<List COMPLETED bookings>" + ending);
            }
            else {
                System.out.println("<List all bookings>" + ending);
            }
        }
        else if (option.equals("8")) {
            System.out.print(entry + "Adding booking (appointment for a COVID test) to the system" + "\n" + "\n" + "List of available time-slots:"+ "\n" + "11. dd/mm/yyyy HH:"+ "\n" + "12. dd/mm/yyyy HH:"+ "\n" + "13. dd/mm/yyyy HH:"+"\n" + "..."+ please + " of an available time-slot and the student email, seperated by a white space."+ ending);
            // If valid
            // System.out.print("Booking added successfully:" + "\n" + "<Print booking>"+ "\n" + "\n" + "List of available time-slots:"+ "\n" + "11. dd/mm/yyyy HH:"+ "\n" + "12. dd/mm/yyyy HH:"+ "\n" + "13. dd/mm/yyyy HH:"+"\n" + "..."+ please + " of an available time-slot and the student email, seperated by a white space."+ ending);

            // If invalid 
            // System.out.print("Error!" + "\n" + "<Message explaining error>"+ please + " of an available time-slot and the student email, seperated by a white space."+ ending);

        }
        else if (option.equals("9")) {
            System.out.print(entry + "<List booking status: SCHEDULED>" + "\n" + "Removing booking from the system"+ "\n" + please + " to select the booking to be removed from the listed bookings above."+ ending);
            // If valid
            // System.out.print("Booking removed successfully:" + "\n" + "<Print booking>"+ please + " to select the booking to be removed from the listed bookings above."+ ending);

            // If invalid
            // System.out.print("Error!" + "\n" + "<Message explaining error>"+ please + " to select the booking to be removed from the listed bookings above."+ ending);
        }
        else if (option.equals("10")) {
            System.out.print(entry + "<List booking status: SCHEDULED>" + "\n" + "Conclude booking"+ "\n" + please + " to select the booking to be completed."+ ending);
            // If valid
            // System.out.print("Booking completed successfully:" + "\n" + "<Print booking>"+ please + " to select the booking to be completed."+ ending);

            // If invalid
            // System.out.print("Error!" + "\n" + "<Message explaining error>"+ please + " to select the booking to be completed."+ ending);
        }

    }
}
