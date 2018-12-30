package gui;
//Import hell 0, java

//Import hell 1, javafx
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

//Import hell 2, java io


public class Logic { //-----button logic for button functions
    public Label Feedback;

    //-----File logic for creating the output string file.
    /*    File dir = new File("io/test");
        dir.mkdirs();
    File tmp = new File(dir, "tmp.txt");
        tmp.createNewFile();*/

    int one = 1;
    String Outstring = "";


    public void sayTESTCallResponse(ActionEvent actionEvent) {
        Feedback.setText("Response");
        one += 1;
        Outstring += "wungus";
    }


    public void modifylocation(ActionEvent actionEvent) {
        /*Feedback.setText(String.valueOf(one));*/
        Feedback.setText(Outstring);
    }

    public void resetallfields(ActionEvent actionEvent) {

    }
}
