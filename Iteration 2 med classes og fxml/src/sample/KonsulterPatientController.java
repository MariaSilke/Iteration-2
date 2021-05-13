package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


public class KonsulterPatientController {
    public TextField cpr2Text;
    public TabPane KonsulterTabpane;
    public Tab TestTab;
    public TableView TestTable;
    public TableColumn TestDatoKolonne;
    public TableColumn TestTypeKolonne;
    public TableColumn ResultatKolonne;
    public TableColumn CovidTypeKolonne;
    public TableColumn KommentarKolonne;
    public Tab SensorTab;
    public TableView SensorTable;
    public TableColumn SensorDatoKolonne;
    public TableColumn PulsKolonne;
    public TableColumn TemperaturKolonne;
    public TableColumn SensorKommentarKolonne;
    public Tab GeoTab;
    public Tab KontaktTab;
    public TextArea KontaktText;
    public Button SendBesked;
    public Label labelcpr2;
    public Button Søg;


    @FXML
    private GridPane grid;

    private void clearTextFields(GridPane grid) {
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                // clear
                ((TextField) node).setText("");
                node.setStyle(null);
            }
        }
    }

    private void resetTextFields(GridPane grid) {
        // Simple method to reset the style on text fields in a grid which have a style set
        // and don't touch the other fields
        // We use it to clear the fields we turned yellow
        for (Node node : grid.getChildren()) {
            if (node instanceof TextField) {
                System.out.println(node.getStyle());
                // clear
                if (node.getStyle() != null && !node.getStyle().equals("")) {
                    ((TextField) node).setText("");
                    node.setStyle(null);
                }
            }
        }
    }

    public void SøgButton(ActionEvent actionEvent) { clearTextFields(grid); }
    public void SendButton(ActionEvent actionEvent) { clearTextFields(grid); }

}
