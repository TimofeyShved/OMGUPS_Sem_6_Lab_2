package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainWinController {

    // -------------------------------------------------------------------- переменные ---------------------------------------------

    @FXML public TextField item1;
    @FXML public TextField item2;
    @FXML public TextField itogo;
    @FXML public TextField srznach;
    @FXML public Button button1;
    @FXML public Label lable1;

    // ----------------------------------------------------------------------- действия ---------------------------------------

    //--------------------------------------рестарт всего
    public void handleReset(MouseEvent mouseEvent) {
        item1.setText("0");
        item2.setText("0");
        itogo.setText("0");
        srznach.setText("0");
        lable1.setText("");
    }

    //--------------------------------------обновления полей
    private void itogoUpdate(){
        Float sum = Float.parseFloat("0"+item1.getText());
        sum+=Float.parseFloat("0"+item2.getText());
        Float srz = Float.parseFloat("0"+item1.getText());
        srz = (srz+Float.parseFloat("0"+item2.getText()))/2;
        itogo.setText(Float.toString(sum));
        srznach.setText(Float.toString(srz));
    }

    // ----------------------------------------------------------------------- инициализация ---------------------------------------

    public void init(){
        item1.setOnAction(new EventHandler<ActionEvent>() { // действие, при активации элемента
            @Override
            public void handle(ActionEvent event) {
                itogoUpdate();
            }
        });
        item2.setOnAction(event -> itogoUpdate()); // действие, при активации элемента
        item1.setOnKeyReleased(event -> itogoUpdate()); // действие, при нажатии на клавиатуре
        item2.setOnKeyReleased(event -> itogoUpdate()); // действие, при нажатии на клавиатуре
        item1.setOnMouseClicked(event -> lable1.setText("Товар 1")); // действие, при нажатии на мышки
        item2.setOnMouseClicked(event -> lable1.setText("Товар 2")); // действие, при нажатии на мышки
        itogo.setOnMouseClicked(event -> lable1.setText("Всего")); // действие, при нажатии на мышки
        srznach.setOnMouseClicked(event -> lable1.setText("Среднее")); // действие, при нажатии на мышки
    }
}
