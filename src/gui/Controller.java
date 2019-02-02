package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


/**
 * This is the controller class that provides functionality to the buttons.
 */
public class Controller {

    /**
     * The feedback label across the top of the screen
     */
    private Label feedback;

    @FXML
    private ComboBox<String> dropSymbol;


    int one = 1;
    String Outstring = "";

    /**
     * Implements the actions when reset button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onResetClicked(ActionEvent actionEvent) {
        feedback.setText("Resetting all fields...");

        feedback.setText("Resetting output string");
        Outstring = "";

        feedback.setText("Successfully Reset all Fields!");
    }

    /**
     * Implements the actions when next image button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onNextImageClicked(ActionEvent actionEvent) {
        feedback.setText("Moving to Next File...");

        feedback.setText(dropSymbol.getValue());
    }

    /**
     * Implements the actions when previous image button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onPrevImageClicked(ActionEvent actionEvent) {
        feedback.setText("Moving to Next File...");

        feedback.setText("Migrated to Next File");
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
    }

    /**
     * Implements the actions when open button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onOpenClicked(ActionEvent actionEvent) {

    }

    private void checkDirectorySet() {
        // check if directory set
        // if not pop up window and tell to use open
    }
}

