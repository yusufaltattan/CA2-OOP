import java.util.Date;

public class assistantOnShift {
    // Properties
    private assistant assistant;
    private Date timeSlot;
    private String statusAssistant;

    // Get Functions
    public assistant getAssistant() {
        return this.assistant;
    }

    public Date getTimeSlot() {
        return this.timeSlot;
    }

    public String getStatusAssistant() {
        return this.statusAssistant;
    }

    // Set Functions
    public void setAssistant(assistant assistant) {
        this.assistant = assistant;
    }

    public void setTime(Date timeSlot) {
        this.timeSlot = timeSlot;
    }

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
    public void printAssistantOnShift() {
        System.out.println(" | " + getTimeSlot() + " | " + getStatusAssistant() + " | " + assistant.getEmail() + " | ");
    }
}

