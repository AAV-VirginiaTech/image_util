package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


/**
 * This is the controller class that provides functionality to the buttons.
 */
public class Controller {

    //The Combobox for Direction, Shape, Color, Symbol, and Symbol Color
    @FXML private ComboBox dropDirect;
    @FXML private ComboBox dropShape;
    @FXML private ComboBox dropColor;
    @FXML private ComboBox dropSymbol;
    @FXML private ComboBox dropSymbolcolor;

    /**
     * The feedback label across the top of the screen
     */
    @FXML
    private Label feedback;



    boolean isDirKnown = false;
    int one = 1;
    String outString = "";
    String directory = "";

    /**
     * Implements the actions when reset button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onResetClicked(ActionEvent actionEvent) {
        try{
            feedback.setText("Successfully Reset all Fields!");

            outString = "";
        }
        catch(Exception e){
            feedback.setText("Failed to reset all Fields");
        }
    }

    /**
     * Implements the actions when next image button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onNextImageClicked(ActionEvent actionEvent) {
        if(checkDirectorySet()){
            feedback.setText("Moving to Next File...");

            feedback.setText(outString);

        }else{
            feedback.setText("[ERR] No Directory Selected");
        }
    }

    /**
     * Implements the actions when previous image button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onPrevImageClicked(ActionEvent actionEvent) {
        if(isDirKnown){
            feedback.setText("Moving to Previous File...");


        }else{
            feedback.setText("[ERR] No Directory Selected");
        }
    }

    /**
     * Implements the actions when undo button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onUndoClicked(ActionEvent actionEvent) {
        // undoes an image crop
    }

    /**
     * Implements the actions when create file button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onCreateFileClicked(ActionEvent actionEvent) {
        // check all boxes are filled
        // parse all input values
        // send all values to JSONHandler
        if(isDirKnown){
            feedback.setText("Sending files to JSON");


        }else{
            feedback.setText("[ERR] No Directory Selected");
        }
    }

    /**
     * Implements the actions when open button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onOpenClicked(ActionEvent actionEvent) {
        try{

            directory = "*/*/NotARealDirectory";
            isDirKnown = true;
        }catch(Exception e){
            feedback.setText("No directory specified");
        }
    }

    /**
     * Checks if a directory is set
     * Returns True if is and False if not
     * @return
     */
    private boolean checkDirectorySet() {
        // check if directory set
        // if not pop up window and tell to use open
        return true;
    }

    private boolean isFields() {

        return true;
    }

    /**
     *Checks if fields are empty by calling checkFields()
     *Then writes those fields into the outString string
     */
    private void getFields() {
        //(String) dropDirect.getValue()
    }
}

