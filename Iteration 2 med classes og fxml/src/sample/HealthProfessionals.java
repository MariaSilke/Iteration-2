package sample;

public class HealthProfessionals {
    private String ID;
    private String firstName;
    private String lastName;
    private String professionTitle;

    public HealthProfessionals(String ID, String firstName, String lastName, String professionTitle) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.professionTitle = professionTitle;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfessionTitle() {
        return professionTitle;
    }

    public void setProfessionTitle(String professionTitle) {
        this.professionTitle = professionTitle;
    }

    @Override
    public String toString() {
        return "HealthProfessionals{"+
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", professionTitle='" + professionTitle + '\'' +
                '}';
    }
}
