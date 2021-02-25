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

     // public static bookingsystem initializeBookingSystem() {
     //      var bookingsystem = new bookingsystem();
     //      bookingsystem.addBookableRoom(universityResources.getRoom()[0], "21/02/2021", "07:00");
     // }
}
