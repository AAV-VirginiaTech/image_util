package gui;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import javax.swing.text.html.ImageView;


/**
 * This is the controller class that provides functionality to the buttons.
 */
public class Controller<image> {

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
    String outString = null;
    String directory = null;

    String valDirection;
    String valShape;
    String valColor;
    String valSymbol;
    String valSymbolcolor;

    /**
     * Implements the actions when reset button is clicked
     * Specifically, resets fields but not data
     * @param actionEvent The event that triggered the call
     */
    public void onResetClicked(ActionEvent actionEvent) {
        try{
            resetComboBoxes();
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
            resetComboBoxes();
            resetData();
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
        if(checkDirectorySet()){
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
            showOpenFile();
            feedback.setText("Directory set to: " + directory);
        }catch(Exception e){
            feedback.setText("[ERR]No directory specified");
        }
    }

    /**
     * Resets the five Comboboxes [Direct, Color, Shape, Symbol, Symbolcolor when called
     */
    private void resetComboBoxes() {
        ObservableList listDirect = dropDirect.getItems();
        dropDirect.setItems(null);
        dropDirect.setItems(listDirect);

        ObservableList listColor = dropColor.getItems();
        dropColor.setItems(null);
        dropColor.setItems(listColor);

        ObservableList listShape = dropShape.getItems();
        dropShape.setItems(null);
        dropShape.setItems(listShape);

        ObservableList listSymbol = dropSymbol.getItems();
        dropSymbol.setItems(null);
        dropSymbol.setItems(listSymbol);

        ObservableList listSymbolcolor = dropSymbolcolor.getItems();
        dropSymbolcolor.setItems(null);
        dropSymbolcolor.setItems(listSymbolcolor);

    }

    /**
     * Clears the outstring variable and any others that may be added
     */
    private void resetData(){
        outString = null;
        valDirection = null;
        valShape = null;
        valColor = null;
        valSymbol = null;
        valSymbolcolor = null;
    }

    /**
     * Checks if a directory is set
     * Returns True if is and False if not
     * @return
     */
    private boolean checkDirectorySet() {
        // check if directory set
        // if not pop up window and tell to use open
        if(directory != null){
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
     *Then returns those values separated by commas [x,y,z] until a better solution is found
     */
    private String getFields() {
        if(isFields()) {
            valDirection = (String) dropDirect.getValue();
            valShape = (String) dropShape.getValue();
            valColor = (String) dropColor.getValue();
            valSymbol = (String) dropSymbol.getValue();
            valSymbolcolor = (String) dropSymbolcolor.getValue();
            return valDirection + ',' + valShape + ',' + valColor + ',' + valSymbol + ',' + valSymbolcolor;
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

    private void showOpenFile() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Please Open a Directory");
        alert.setHeaderText("I have no idea how to do this");
        alert.setContentText("Directory set to" + directory);

        alert.showAndWait();
    }
}

