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
    @FXML
    private Label feedback;

    /**
     * The ComboBox to select the alphanumberic character on the target
     */
    @FXML
    private ComboBox<String> symbol;

    @FXML
    private ComboBox<String> direction;
    @FXML
    private ComboBox<String> shape;
    @FXML
    private ComboBox<String> backgroundColor;
    @FXML
    private ComboBox<String> symbolColor;


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

        feedback.setText(symbol.getValue());
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

        if (allFieldsChosen()) {

            String symbolValue = symbol.getValue();
            String directionValue = direction.getValue();
            String shapeValue = shape.getValue();
            String symbolColorValue = symbolColor.getValue();
            String backgroundColorValue = backgroundColor.getValue();

            System.out.println("Symbol selected: " + symbolValue);
            System.out.println("Direction selected: " + directionValue);
            System.out.println("Shape selected: " + shapeValue);
            System.out.println("Symbol Color selected: " + symbolColorValue);
            System.out.println("Background Color selected: " + backgroundColorValue);
            System.out.println();


        } else {
            System.out.println("Nothing Selected for one of the fields.");
        }
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

    private boolean allFieldsChosen() {
        return !symbol.getSelectionModel().isEmpty() &&
                !direction.getSelectionModel().isEmpty() &&
                !shape.getSelectionModel().isEmpty() &&
                !symbolColor.getSelectionModel().isEmpty() &&
                !backgroundColor.getSelectionModel().isEmpty();
    }
}

