package sample;

import javafx.fxml.FXML;

import java.awt.*;

public class Controller {
    @FXML
    TextField item1;
    @FXML TextField item2;
    @FXML TextField itogo;
    @FXML Button button1;

    @FXML
    private void handleReset(){
        item1.setText("0");
        item2.setText("0");
        itogo.setText("0");
    }
}
