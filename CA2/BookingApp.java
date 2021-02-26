import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * This is the main booking app, where the design of the app exists including
 * all the prints to the console
 */
public class BookingApp {

     public static void main(String[] args) {

          // Initialize University Resources
          universityResources universityResources = initdata.initializeUniversityResources();
          // Initialize Booking System
          bookingsystem bookingsystem = new bookingsystem();
          initdata.initializeBookingSystem(universityResources, bookingsystem);
          initdata.initializeAssistantsOnShift(universityResources, bookingsystem);
          initdata.initializeBoooking(universityResources, bookingsystem);

          // Test to make sure it is initialized
          printMenu();

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
                         printBookableRoom(bookingsystem);
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 2:
                         try {
                              // Bookable Room - Add
                              printBookableRoom_Add(universityResources);
                              userInput.nextLine();
                              var bookableRoom_Add = userInput.nextLine();
                              var roomID = Integer.parseInt(bookableRoom_Add.split(" ")[0]);
                              if (roomID >= 11) {
                                   var selectedDate = bookableRoom_Add.split(" ")[1];
                                   var selectedTime = bookableRoom_Add.split(" ")[2];
                                   Date newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(selectedDate + " " + selectedTime);
                                   // Get Room - By ID
                                   var newRoom = universityResources.getRooms().get(roomID - 11);
                                   bookingsystem.addBookableRoom(newRoom, newTimeSlot);
                                   printBookableRoom_Add_Success(bookingsystem);
                              } else {
                                   printBookableRoom_Add_Error(bookingsystem);
                              }
                         } catch (ParseException e) {

                              e.printStackTrace();
                         }
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 3:
                         // Bookable Room - Remove
                         printBookableRoom_Remove(bookingsystem);
                         var bookableRoom_Remove = userInput.nextInt();
                         if (bookableRoom_Remove >= 11) {
                              bookingsystem.removeBookableRoom(bookableRoom_Remove - 11);
                              printBookableRoom_Remove_Success(bookingsystem);
                         } else {
                              printBookableRoom_Remove_Error(bookingsystem);
                         }
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 4:
                         // Assistants on Shift - View
                         printAssistantOnShift(bookingsystem);
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 5:
                         // Assistant on Shift - Add
                         try {
                              printAssistantOnShift_Add(universityResources);
                              userInput.nextLine();
                              var assistantOnShift_Add = userInput.nextLine();
                              var assistantID = Integer.parseInt(assistantOnShift_Add.split(" ")[0]);
                              if (assistantID >= 11) {
                                   var selectedDate = assistantOnShift_Add.split(" ")[1];
                                   Date newTimeSlot1 = new Date();
                                   Date newTimeSlot2 = new Date();
                                   Date newTimeSlot3 = new Date();
                                   newTimeSlot1 = new SimpleDateFormat("dd/MM/yyyy HH:mm")
                                             .parse(selectedDate + " " + "07:00");
                                   newTimeSlot2 = new SimpleDateFormat("dd/MM/yyyy HH:mm")
                                             .parse(selectedDate + " " + "08:00");
                                   newTimeSlot3 = new SimpleDateFormat("dd/MM/yyyy HH:mm")
                                             .parse(selectedDate + " " + "09:00");
                                   // Get Room - By ID
                                   var newAssistant = universityResources.getAssistants().get(assistantID - 11);
                                   bookingsystem.addAssistantOnShift(newAssistant, newTimeSlot1);
                                   bookingsystem.addAssistantOnShift(newAssistant, newTimeSlot2);
                                   bookingsystem.addAssistantOnShift(newAssistant, newTimeSlot3);
                                   printAssistantOnShift_Add_Success(bookingsystem);
                              } else {
                                   printAssistantOnShift_Add_Error(bookingsystem);
                              }
                         } catch(ParseException e) {
                              e.printStackTrace();
                         }
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 6:
                         // Assistant on Shift - Remove
                         printAssistantOnShift_Remove(bookingsystem);
                              var assistantOnShift_Remove = userInput.nextInt();
                              if (assistantOnShift_Remove >= 11) {
                                   printAssistantOnShift_Remove_Success(bookingsystem);
                                   bookingsystem.removeAssistantOnShift(assistantOnShift_Remove-11);
                              } else {
                                   printAssistantOnShift_Remove_Error(bookingsystem);
                              }
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 7:
                         // Booking - View
                         printBooking(bookingsystem);
                         selectedMenuItem = userInput.nextInt();
                         if (selectedMenuItem == 1) {
                              printBooking_One(bookingsystem);
                         } else if (selectedMenuItem == 2) {
                              printBooking_Two(bookingsystem);
                         } else if (selectedMenuItem == 3) {
                              printBooking_Three(bookingsystem);
                         }
                         selectedMenuItem = userInput.nextInt();
                         break;
                         
                    case 8:
                         // Booking - Add
                              // Bookable Room - Add
                              printBooking_Add(bookingsystem);
                              userInput.nextLine();
                              var booking_Add = userInput.nextLine();
                              var timeSlotID = Integer.parseInt(booking_Add.split(" ")[0]);
                              if (timeSlotID >= 11) {
                                   for (int i = 0; i < bookingsystem.getBookableRooms().size(); i++) {
                                        if (bookingsystem.getBookableRooms().get(i).getTimeSlot().equals(bookingsystem.getAssistantOnShifts().get(timeSlotID-11).getTimeSlot())) {
                                             var newStudentEmail = booking_Add.split(" ")[1];
                                             var newBookableRoom = bookingsystem.getBookableRooms().get(timeSlotID-11);
                                             var newAssistantOnShift = bookingsystem.getAssistantOnShifts().get(timeSlotID-11);
                                             var newTimeSlot = bookingsystem.getBookableRooms().get(timeSlotID-11).getTimeSlot();
                                             // Get Room - By ID
                                             bookingsystem.addBooking(newStudentEmail, newBookableRoom, newTimeSlot, newAssistantOnShift);
                                             printBooking_Add_Success(bookingsystem);
                                             }
                                        }
                                   } else {
                                        printBooking_Add_Error(bookingsystem);
                                   }
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 9:
                         // Booking - Remove
                         printBooking_Remove(bookingsystem);
                         var booking_Remove = userInput.nextInt();
                         if (booking_Remove >= 11) {
                              printAssistantOnShift_Remove(bookingsystem);
                              bookingsystem.removeBooking(booking_Remove-11);
                         }
                         selectedMenuItem = userInput.nextInt();
                         break;
                    case 10:
                         // Conclude
                         printConclude(bookingsystem);
                         // This should change status of booking from SCHEDULED to COMPLETED
                         var removeBooking = userInput.nextInt();
                         if (removeBooking >= 11) {
                              String newStudentEmail = bookingsystem.getBookings().get(removeBooking-11).getStudentEmail();
                              bookableRoom newBookableRoom = bookingsystem.getBookings().get(removeBooking-11).getBookableRoom();
                              assistantOnShift newAssistantOnShift = bookingsystem.getBookings().get(removeBooking-11).getAssistantOnShift();
                              Date newTimeSlot = bookingsystem.getBookings().get(removeBooking-11).getTimeSlot();
                              bookingsystem.addBookingTwo(newStudentEmail, newBookableRoom, newTimeSlot, newAssistantOnShift, "COMPLETED");
                              printConclude_Success(bookingsystem);
                         }
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
          System.out.println("\t" + "2. Add");
          System.out.println("\t" + "3. Remove");
          System.out.println("To manage Assistants on Shift:");
          System.out.println("\t" + "4. List");
          System.out.println("\t" + "5. Add");
          System.out.println("\t" + "6. Remove");
          System.out.println("To manage Bookings:");
          System.out.println("\t" + "7. List");
          System.out.println("\t" + "8. Add");
          System.out.println("\t" + "9. Remove");
          System.out.println("\t" + " 10. Conclude");
          System.out.println("After selecting one the options above, you will be presented other screens.");
          System.out.println("If you press 0, you will be able to return to this main menu.");
          System.out.println("Press -1 (or ctrl+c) to quit this application.");
          System.out.println();
     }

     public static void printBookableRoom(bookingsystem bookingsystem) {
          // Case 1
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          for (int i = 0; i < bookingsystem.getBookableRooms().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getBookableRooms().get(i).printBookableRoom();
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
          System.out.println(bookingsystem.getBookableRooms().get((bookingsystem.getBookableRooms().size()) - 1));
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println(
                    "The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),separated by a white space.");
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

     public static void printAssistantOnShift(bookingsystem bookingsystem) {
          // Case 4
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          for (int i = 0; i < bookingsystem.getAssistantOnShifts().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getAssistantOnShifts().get(i).printAssistantOnShift();
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
          System.out.println("The sequential ID listed to a room, a date (dd/mm/yyyy), separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     public static void printAssistantOnShift_Add_Success(bookingsystem bookingsystem) {
          // Case 5
          System.out.println("Assistant on Shift added successfully:");
          System.out.println();
          System.out.println(bookingsystem.getAssistantOnShifts().get(bookingsystem.getAssistantOnShifts().size() - 1));
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
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
          System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
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

     public static void printAssistantOnShift_Remove_Success(bookingsystem bookingsystem) {
          // Case 3
          System.out.println("Assistant on Shift removed successfully:");
          // Print removed assistant
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the bookable room to be removed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     public static void printAssistantOnShift_Remove_Error(bookingsystem bookingsystem) {
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
     public static void printBooking_One(bookingsystem bookingsystem) {
          // Case 7
          for (int i = 0; i < bookingsystem.getBookings().size(); i++) {
               System.out.print(((i + 10) + 1) + " ");
               bookingsystem.getBookings().get(i).printBooking();
          }
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBooking_Two(bookingsystem bookingsystem) {
          // Case 7
          for (int i = 0; i < bookingsystem.getBookings().size(); i++) {
               if (bookingsystem.getBookings().get(i).getStatusBooking().equals("SCHEDULED")) {
                    System.out.print(((i + 10) + 1) + " ");
                    bookingsystem.getBookings().get(i).printBooking();
               } else {
                    return;
               }
          }
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }
     public static void printBooking_Three(bookingsystem bookingsystem) {
          // Case 7
          for (int i = 0; i < bookingsystem.getBookings().size(); i++) {
               if (bookingsystem.getBookings().get(i).getStatusBooking().equals("COMPLETED")) {
                    System.out.print(((i + 10) + 1) + " ");
                    bookingsystem.getBookings().get(i).printBooking();
               }
          }
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
               if (bookingsystem.getBookableRooms().get(i).getTimeSlot().equals(bookingsystem.getAssistantOnShifts().get(i).getTimeSlot())) {
                    System.out.print(((i + 10) + 1) + " | ");
                    System.out.println(bookingsystem.getAssistantOnShifts().get(i).getTimeSlot());
               }
          }
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println(
                    "The sequential ID of an available time-slot and the student email, separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     public static void printBooking_Add_Success(bookingsystem bookingsystem) {
          // Case 5
          System.out.println("Booking added successfully:");
          System.out.println(bookingsystem.getBookings().get(bookingsystem.getBookings().size() - 1));
          System.out.println();
          for (int i = 0; i < bookingsystem.getAssistantOnShifts().size(); i++) {
               if (bookingsystem.getBookableRooms().get(i).getTimeSlot().equals(bookingsystem.getAssistantOnShifts().get(i).getTimeSlot())) {
                    System.out.print(((i + 10) + 1) + " | ");
                    System.out.println(bookingsystem.getAssistantOnShifts().get(i).getTimeSlot());
               }
          }
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     public static void printBooking_Add_Error(bookingsystem bookingsystem) {
          // Case 5
          System.out.println("Error!");
          // Message explaining error
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
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

     public static void printBooking_Remove_Success(bookingsystem bookingsystem) {
          // Case 3
          System.out.println("Booking removed successfully:");
          // Print removed assistant
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the bookable room to be removed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     public static void printBooking_Remove_Error(bookingsystem bookingsystem) {
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

     public static void printConclude(bookingsystem bookingsystem) {
          // Case 10
          System.out.println("University of Knowledge - COVID test");
          System.out.println();
          for (int i = 0; i < bookingsystem.getBookings().size(); i++) {
               if (bookingsystem.getBookings().get(i).getStatusBooking().equals("SCHEDULED")) {
                    System.out.print(((i + 10) + 1) + " ");
                    bookingsystem.getBookings().get(i).printBooking();
               }
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

     public static void printConclude_Success(bookingsystem bookingsystem) {
          // Case 10
          System.out.println("Booking completed successfully:");
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the booking to be completed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

     public static void printConclude_Error(bookingsystem bookingsystem) {
          // Case 10
          System.out.println("Error!");
          System.out.println();
          System.out.println("Please, enter one of the following:");
          System.out.println();
          System.out.println("The sequential ID to select the booking to be completed.");
          System.out.println("0. Back to main menu.");
          System.out.println("-1. Quit application.");
          System.out.println();
     }

}
