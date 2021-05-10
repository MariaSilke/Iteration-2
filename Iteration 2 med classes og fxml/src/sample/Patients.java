package sample;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Patients {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String CPR;

    public Patients(String firstName, String lastName, String phoneNumber, String CPR) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.CPR = CPR;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }
    public int getAge () {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("ddMMuu");
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.parse(CPR.substring(0,6), dateFormatter);
        // If the birthdate is after today, it's probably in the 1900's. Subtract 100 years.
        if (birthdate.isAfter(today)) { birthdate = birthdate.minusYears(100); }
        int age = Period.between(birthdate, today).getYears();
        return age;
    }
    public String getGender() {
        String serial = CPR.substring(7,11);
        if (Integer.parseInt(serial) % 2 == 0) {
            return "female";
        } else {
            return "male";
        }
    }

    @Override
    public String toString() {
        return "Patients{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", CPR='" + CPR + '\'' +
                '}';
    }
}