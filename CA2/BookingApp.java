import java.util.Scanner;
/** 
* This is the main booking app, where the design of the app exists including all the prints to the console
*/
public class BookingApp {

     public static void main(String[] args) {

          // Initialize University Resources
          universityResources universityResources = initdata.initializeUniversityResources();
          printMenu();

          // Initialize Booking System
          bookingsystem bookingsystem = new bookingsystem();

          // Use Scanner to read user input
          Scanner userInput = new Scanner(System.in);

          // Ensure input is Int
          if (!userInput.hasNextInt())
               return;
          // Get User Input
          int selectedMenuItem = userInput.nextInt();
          while (selectedMenuItem != -1) {
               switch (selectedMenuItem) {
                    case 0:
                         printMenu();
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 1:
                         // Bookable Rooms - View
                         printBookableRoom(universityResources);
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 2:
                         // Bookable Room - Add
                         printBookableRoom_Add(universityResources);
                         var bookableRoom_Add = userInput.nextLine().split(" ");
                         System.out.print(bookableRoom_Add.length);
                         selectedMenuItem = userInput.nextInt(); 
                         break;
                    case 3:
                         // Bookable Room - Remove
                         printBookableRoom_Remove(bookingsystem);
                         var bookableRoom_Remove = userInput.nextLine();
                         // What to do with the ID here?
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 4:
                         // Assistants on Shift - View
                         printAssistantOnShift(universityResources);
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 5:
                         // Assistant on Shift - Add
                         printAssistantOnShift_Add(universityResources);
                         var assistantOnShift_Add = userInput.nextLine().split(" ");
                         System.out.print(assistantOnShift_Add.length);
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 6:
                         // Assistant on Shift - Remove
                         printAssistantOnShift_Remove(bookingsystem);
                         var assistantOnShift_Remove = userInput.nextLine();
                         // What to do with the ID here?
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 7:
                         // Booking - View
                         printBooking(bookingsystem);
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 8:
                         // Booking - Add
                         printBooking_Add(bookingsystem);
                         var booking_Add = userInput.nextLine().split(" ");
                         System.out.print(booking_Add.length);
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 9:
                         // Booking - Remove
                         printBooking_Remove(bookingsystem);
                         var booking_Remove = userInput.nextLine();
                         // What to do with the ID here?
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 10:
                         // Conclude
                         printConclude(bookingsystem);
                         // This should change status of booking from SCHEDULED to COMPLETED
                         selectedMenuItem = userInput.nextInt();
                         break;
                    default:
                         selectedMenuItem = userInput.nextInt();
                         break;
               }
          }

          userInput.close();
     }

     // Methods
     public static void printMenu() {
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          System.out.println("Manage Bookings");
          System.out.println();
          System.out.println("Please, enter the number to select your option:");
          System.out.println();
          System.out.println("To manage Bookable Rooms:");
          System.out.println("\t" + "1. List");
          System.out.println("\t" +"2. Add");
          System.out.println("\t" +"3. Remove");
          System.out.println("To manage Assistants on Shift:");
          System.out.println("\t" +"4. List");
          System.out.println("\t" +"5. Add");
          System.out.println("\t" +"6. Remove");
          System.out.println("To manage Bookings:");
          System.out.println("\t" +"7. List");
          System.out.println("\t" +"8. Add");
          System.out.println("\t" +"9. Remove");
          System.out.println("\t" + " 10. Conclude");
          System.out.println("After selecting one the options above, you will be presented other screens.");
          System.out.println("If you press 0, you will be able to return to this main menu.");
          System.out.println("Press -1 (or ctrl+c) to quit this application.");
          System.out.println();
     }


     public static void printBookableRoom(universityResources universityResources) {
          // Case 1
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          for (int i = 0; i < universityResources.getRooms().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               universityResources.getRooms().get(i).printRoom();
          }
          System.out.println();
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBookableRoom_Add(universityResources universityResources) {
          // Case 2
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          System.out.println("Adding bookable room");
          System.out.println();
          for (int i = 0; i < universityResources.getRooms().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               universityResources.getRooms().get(i).printRoom();
          }
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println(
                    "The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM), separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBookableRoom_Add_Success(bookingsystem bookingsystem) {
          // Case 2
          System.out.println("Bookable Room added successfully:");
          System.out.println();
          System.out.println(bookingsystem.getBookableRooms().get((getBookableRooms().size())-1));
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBookableRoom_Add_Error(bookingsystem bookingsystem) {
          // Case 2
          System.out.println("Error!");
          // Message Explaining Error
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBookableRoom_Remove(bookingsystem bookingsystem) {
          // Case 3
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          for (int i = 0; i < bookingsystem.getBookableRooms().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getBookableRooms().get(i).printBookableRoom();
          }
          System.out.println("Removing bookable room");
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the bookable room to be removed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBookableRoom_Remove_Success(bookingsystem bookingsystem) {
          // Case 3
          System.out.println("Bookable Room removed successfully:");
          // Print bookable room just removed
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the bookable room to be removed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBookableRoom_Remove_Error(bookingsystem bookingsystem) {
          // Case 3
          System.out.println("Error!");
          // Message Explaining Error
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the bookable room to be removed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     

     public static void printAssistantOnShift(universityResources universityResources) {
          // Case 4
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          for (int i = 0; i < universityResources.getAssistants().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               universityResources.getAssistants().get(i).printAssistant();
          }
          System.out.println();
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printAssistantOnShift_Add(universityResources universityResources) {
          // Case 5
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          System.out.println("Adding assistant on shift");
          System.out.println();
          for (int i = 0; i < universityResources.getAssistants().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               universityResources.getAssistants().get(i).printAssistant();
          }
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println(
                    "The sequential ID listed to a room, a date (dd/mm/yyyy), separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printAssistantOnShift_Add_Success(bookingsystem bookingsystem) {
          // Case 5
          System.out.println("Assistant on Shift added successfully:");
          System.out.println();
          System.out.println(bookingsystem.getAssistantOnShifts().get(getAssistantOnShift().size()-1));
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println(
                    "The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printAssistantOnShift_Add_Error(bookingsystem bookingsystem) {
          // Case 5
          System.out.println("Error!");
          // Message explaining error
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println(
                    "The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     public static void printAssistantOnShift_Remove(bookingsystem bookingsystem) {
          // Case 6
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          for (int i = 0; i < bookingsystem.getAssistantOnShifts().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getAssistantOnShifts().get(i).printAssistantOnShift();
          }
          System.out.println("Removing assistant on shift");
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the assistant on shift to be removed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }


     public static void printBooking(bookingsystem bookingsystem) {
          // Case 7
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          System.out.println("Select which booking to list:");
          System.out.println("1. All");
          System.out.println("2. Only bookings status:SCHEDULED");
          System.out.println("3. Only bookings status:COMPLETED");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBooking_Add(bookingsystem bookingsystem) {
          // Case 8
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          System.out.println("Adding booking (appointment for a COVID test) to the system");
          System.out.println();
          System.out.println("List of available time-slots:");
          for (int i = 0; i < bookingsystem.getBookings().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getBookings().get(i).printBooking();
          }
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBooking_Remove(bookingsystem bookingsystem) {
          // Case 9
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          // Only print booking that are SCHEDULED status
          for (int i = 0; i < bookingsystem.getBookings().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getBookings().get(i).printBooking();
          }
          System.out.println("Removing booking from the system");
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     
     public static void printConclude(bookingsystem bookingsystem) {
          // Case 10
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          // Only print booking that are SCHEDULED status
          for (int i = 0; i < bookingsystem.getBookings().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getBookings().get(i).printBooking();
          }
          System.out.println("Conclude Booking");
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the booking to be completed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     
}
