package gui;

import com.sun.org.apache.xpath.internal.operations.Bool;
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
            resetComboBoxes();
            outString = "";
            feedback.setText("Successfully Reset all Fields!");
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
        // check all boxes are filled - CHECK
        // parse all input values - CHECK
        // send all values to JSONHandler
        if(checkDirectorySet()) {
            if(isFields()){
                createFile(directory,getFields());
            }
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
            feedback.setText("[ERR]No directory specified");
        }
    }

    /**
     * Resets the five Comboboxes [Direct, Color, Shape, Symbol, Symbolcolor when called
     */
    private void resetComboBoxes() {
        dropDirect.setItems(null);
        dropColor.setItems(null);
        dropShape.setItems(null);
        dropSymbol.setItems(null);
        dropSymbolcolor.setItems(null);
    }

    /**
     * Checks if a directory is set
     * Returns True if is and False if not
     * @return
     */
    private boolean checkDirectorySet() {
        // check if directory set
        // if not pop up window and tell to use open
        if(directory != ""){
            return true;
        } else {
            feedback.setText("[ERR] No directory set");
            return false;
        }

    }

    /**
     * Checks if the all fields have values in them
     * @return true if fields are not blank and false if they are
     */
    private boolean isFields() {
        if      ((dropDirect.getValue() == null )||
                (dropShape.getValue() == null )||
                (dropColor.getValue() == null )||
                (dropSymbol.getValue() == null )||
                (dropSymbolcolor.getValue() == null )) {
            feedback.setText("[ERR] All fields not defined!");
            return false;
        } else {
            return true;
        }
    }

    /**
     *Checks if fields are empty by calling checkFields()
     *Then returns those values separated by commas [x,y,z]
     */
    private String getFields() {
        if(isFields()) {
            String direction = (String) dropDirect.getValue();
            String shape = (String) dropShape.getValue();
            String color = (String) dropColor.getValue();
            String symbol = (String) dropSymbol.getValue();
            String symbolcolor = (String) dropSymbolcolor.getValue();
            return direction + ',' + shape + ',' + color + ',' + symbol + ',' + symbolcolor;
        } else {
            return "";
        }
    }

    /**
     * Creates the file using a given Directory and String
     * returns nothing
     */
    private void createFile(String dir, String str) {

        feedback.setText("Creating File '" + dir + "' with contents '" + str +"'");
    }
}

