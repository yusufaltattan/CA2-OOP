import java.util.Date;
/** 
* This class is for the assistant on shift
*/
public class assistantOnShift {
    // Properties
    private assistant assistant;
    private Date timeSlot;
    private String statusAssistant;

    // Get Functions
/** 
* This returns the assistant
* @return assistant
*/
    public assistant getAssistant() {
        return this.assistant;
    }
/** 
* This returns the timeslot
* @return timeSlot
*/
    public Date getTimeSlot() {
        return this.timeSlot;
    }
/** 
* This returns the assistant status
* @return statusAssistant
*/
    public String getStatusAssistant() {
        return this.statusAssistant;
    }

    // Set Functions
/** 
* Sets the assistant
*/
    public void setAssistant(assistant assistant) {
        this.assistant = assistant;
    }
/** 
* Sets the timeslot
*/
    public void setTime(Date timeSlot) {
        this.timeSlot = timeSlot;
    }
/** 
* Sets the assistant status
*/
    public void setStatusAssistant(String statusAssistant) {
        this.statusAssistant = statusAssistant;
    }

    // Constructors
    public assistantOnShift() {
    }

    public assistantOnShift(assistant assistant, Date timeSlot, String statusAssistant) {
        // Call default constructor
        this();
        // Set Values
        setAssistant(assistant);
        setTime(timeSlot);
        setStatusAssistant(statusAssistant);
    }

    // Methods
/** 
* Prints the assistant on shift
*/
    public void printAssistantOnShift() {
        System.out.println(" | " + getTimeSlot() + " | " + getStatusAssistant() + " | " + assistant.getEmail() + " | ");
    }
}