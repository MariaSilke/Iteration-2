package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientsTest {

    @Test
    void getFirstName() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        assertEquals("Maria", pt.getFirstName());
    }

    @Test
    void setFirstName() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        pt.setFirstName("Lise");
        assertEquals("Lise", pt.getFirstName(), "Bør være Lise");
    }

    @Test
    void getLastName() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        assertEquals("Pedersen", pt.getLastName());
    }

    @Test
    void setLastName() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        pt.setLastName("Kikkenborg");
        assertEquals("Kikkenborg", pt.getLastName(), "Bør være Kikkenborg");
    }

    @Test
    void getPhoneNumber() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        assertEquals("+45 23698032", pt.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        pt.setPhoneNumber("+45 22448899");
        assertEquals("+45 22448899", pt.getPhoneNumber(), "Bør være +45 22448899");
    }

    @Test
    void getCPR() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        assertEquals("210698-0202", pt.getCPR());
    }

    @Test
    void setCPR() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        pt.setCPR("111297-2121");
        assertEquals("111297-2121", pt.getCPR(), "Bør være 111297-2121");
    }

    @Test
    void getAge() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        assertEquals(22, pt.getAge());
    }

    @Test
    void getGender() {
        Patients pt = new Patients("Maria", "Pedersen", "+45 23698032", "210698-0202");
        assertEquals("male", pt.getGender());
    }

    @Test
    void testToString() {
    }
}







