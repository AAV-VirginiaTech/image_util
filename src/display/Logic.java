package display;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Logic {
    public Label helloWorld;


    public void sayTESTCallResponse(ActionEvent actionEvent) {
        helloWorld.setText("Response");
    }


}
