public class Patient {
    // The unique id for the patient
    private int id;
    // can be 1-5, from not urgent to resuscitation
    private int triageLevel;
    private String phoneNumber;
    private String name;
    private String location;

    public Patient(String name, String phoneNumber, int triageLevel, String location, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.triageLevel = triageLevel;
        this.location = location;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTriageLevel() {
        return triageLevel;
    }

    public void setTriageLevel(int triageLevel) {
        this.triageLevel = triageLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
