package sample;

import javafx.event.ActionEvent;

public class MultisceneController {

    public void tilføjPatient(ActionEvent actionEvent) { Main.setGridPane(0); }

    public void patientKonsultation(ActionEvent actionEvent) { Main.setGridPane(1); }

    public void Luk(ActionEvent actionEvent) { Main.setGridPane(2); }

    public void skiftAdgangskode(ActionEvent actionEvent) { Main.setGridPane(3); }

    public void visProfil(ActionEvent actionEvent) { Main.setGridPane(4); }

    public void smitteKort(ActionEvent actionEvent) { Main.setGridPane(5); }

    public void smitteTal(ActionEvent actionEvent) { Main.setGridPane(6); }

    public void omCoronaNet(ActionEvent actionEvent) { Main.setGridPane(7); }
}
