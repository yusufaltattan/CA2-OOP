import java.io.ObjectInputFilter.Status;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class initdata {
     // Method
     public static universityResources initializeUniversityResources() {
          var universityResources = new universityResources();
          universityResources.addRoom(new room("RoomOne", 3));
          universityResources.addRoom(new room("RoomTwo", 3));
          universityResources.addRoom(new room("RoomThree", 3));
          universityResources.addAssistant(new assistant("al@uok.ac.uk", "Al"));
          universityResources.addAssistant(new assistant("barry@uok.ac.uk", "Barry"));
          universityResources.addAssistant(new assistant("charlie@uok.ac.uk", "Charlie"));
          return universityResources;
     }

     public static void initializeBookingSystem(universityResources universityResources, bookingsystem bookingsystem) {
          Date newTimeSlot = new Date();
          try {
               for (int i = 0; i < universityResources.getRooms().size(); i++) {
                    var newRoom = universityResources.getRooms().get(i);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 07:00");
                    bookingsystem.addBookableRoom(newRoom, newTimeSlot);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 08:00");
                    bookingsystem.addBookableRoom(newRoom, newTimeSlot);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 09:00");
                    bookingsystem.addBookableRoomTwo(newRoom, newTimeSlot, 2, "AVAILABLE");

                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("22/02/2021 09:00");
                    bookingsystem.addBookableRoomTwo(newRoom, newTimeSlot, 3, "FULL");
               }
          } catch (ParseException e) {
               e.printStackTrace();
          }
     }

     public static void initializeAssistantsOnShift(universityResources universityResources, bookingsystem bookingsystem){
          Date newTimeSlot = new Date();
          try {
               for (int i = 0; i < universityResources.getAssistants().size(); i++) {
                    var newAssistant = universityResources.getAssistants().get(i);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 07:00");
                    bookingsystem.addAssistantOnShift(newAssistant, newTimeSlot);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 08:00");
                    bookingsystem.addAssistantOnShift(newAssistant, newTimeSlot);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 09:00");
                    bookingsystem.addAssistantOnShiftTwo(newAssistant, newTimeSlot, "BUSY");
               }
          } catch (ParseException e) {
               e.printStackTrace();
          }
     }
     public static void initializeBoooking(universityResources universityResources, bookingsystem bookingsystem){
          Date newTimeSlot = new Date();
          try {
               for (int i = 0; i < universityResources.getAssistants().size(); i++) {
                    var newBookableRoom = bookingsystem.getBookableRooms().get(i);
                    var newAssistantOnShift = bookingsystem.getAssistantOnShifts().get(i);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 07:00");
                    bookingsystem.addBooking("yusuf@uok.ac.uk", newBookableRoom, newTimeSlot, newAssistantOnShift);
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 08:00");
                    bookingsystem.addBookingTwo("diogo@uok.ac.uk", newBookableRoom, newTimeSlot, newAssistantOnShift, "SCHEDULED");
                    
                    newTimeSlot = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("21/02/2021 09:00");
                    bookingsystem.addBookingTwo("josef@uok.ac.uk", newBookableRoom, newTimeSlot, newAssistantOnShift, "COMPLETED");
               }
          } catch (ParseException e) {
               e.printStackTrace();
          }
     }
}
