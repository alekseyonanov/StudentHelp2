package lab7;
/*
 * Как и View, контролер привязан к форме
 * */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller extends View {
    @FXML
    private Button beginTest;
    @FXML
    private TextField varX;    //varX совпадает с полем в Model. Может немного изменить имя?

    @FXML
    private void onActionbeginSum(ActionEvent event) {
        // отдаем модели нужные данные
        model.setVarX(varX.getText());
        // проводим вычисления
        model.calculate();        // передаем из model во view
    }
}
