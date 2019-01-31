/*This file is the logic behind the ui, it handles the button interactions, reads image information,
* and ultimately creates and sends a string containing image information to the turned into a json file*/
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


    public void sayTESTCallResponse(ActionEvent actionEvent) { //temporary button for learning purposes
        Feedback.setText("Response");
        one += 1;
        Outstring += "wungus";
    }


    public void modifylocation(ActionEvent actionEvent) { //temporary button for learning purposes
        /*Feedback.setText(String.valueOf(one));*/

    }

    public void resetallfields(ActionEvent actionEvent) { //Resets dropdown buttons when [RESET} is pushed
        Feedback.setText("Resetting all fields...");

        Feedback.setText("Resetting output string");
        Outstring = "";

        Feedback.setText("Successfully Reset all Fields!");
    }

    public void nextimage(ActionEvent actionEvent) { //Moves to next file in the folder
        Feedback.setText("Moving to Next File...");

        Feedback.setText("Migrated to Next File");
    }

    public void preview(ActionEvent actionEvent) { //Outputs the current string to the feedback label
        Feedback.setText(Outstring);
    }

    public void pushchanges(ActionEvent actionEvent) { //Creates a text fle from the output string
        String filedir = "PLACEHOLDER";
        Feedback.setText("Creating Text...");

        Feedback.setText("Text file created at: " + filedir);
    }

    public void imgNext(ActionEvent actionEvent) {
    }

    public void imgPrev(ActionEvent actionEvent) {
    }

    public void imgCrop(ActionEvent actionEvent) {
    }
}
