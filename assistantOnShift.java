public class assistantOnShift {
    // Properties
    private universityResources[] assistants;
    private String time;
    private int statusAssistant;
    
    // Get Functions
    public universityResources[] getAssistants() {
        return this.assistants;
    }
    public String getTime() {
        return this.time;
    }
    public int getStatusAssistant() {
        return this.statusAssistant;
    }

    // Set Functions
    public void setAssistants(universityResources[] assistants) {
        this.assistants = assistants;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setStatusAssistant(int statusAssistant) {
        this.statusAssistant = statusAssistant;
    }

    // Constructors
    public assistantOnShift(universityResources[] assistants, String time, int statusAssistant) {
        this.assistants = assistants;
        this.time = time;
        this.statusAssistant = statusAssistant;
    }
}
