package gui;

import io.JSONHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;

import org.apache.commons.io.FilenameUtils;



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
     * The ImageView of the ui
     */
    @FXML
    private ImageView imageView;

    /**
     * The ComboBoxes for choosing the fields describing the image
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

    /**
     * The Label to display the image's size
     */
    @FXML
    private Label sizeLabel;

    /**
     * The path to the folder containing the current image or null
     */
    private String directoryPath = null;

    /**
     * The name of the current image loaded without extension or null
     */
    private String imageName = null;


    /**
     * Implements the actions when reset button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onResetClicked(ActionEvent actionEvent) {
        resetFields();
    }

    /**
     * Implements the actions when create file button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onCreateJSONClicked(ActionEvent actionEvent) {
        if (allFieldsChosen() && directoryPath != null && imageName != null) {

            String symbolValue = symbol.getValue();
            String directionValue = direction.getValue();
            String shapeValue = shape.getValue();
            String symbolColorValue = symbolColor.getValue();
            String backgroundColorValue = backgroundColor.getValue();

            String fileName = directoryPath + "/" + imageName + ".json";
            boolean result = JSONHandler.createJson(fileName, 100.1, 200.1, directionValue, shapeValue,
                    backgroundColorValue, symbolValue, symbolColorValue);

            if (result) {
                updateFeedback("JSON Created at: " + fileName);
            } else {
                updateFeedback("JSON Creation Failed.");
            }
        } else {
            updateFeedback("ERROR: Not all fields are selected or an error occurred with the image name.");
        }
    }


    /**
     * Implements the actions when next image button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onOpenImageClicked(ActionEvent actionEvent) {

        resetFields();

        Node source = (Node) actionEvent.getSource();
        Window stage = source.getScene().getWindow();

        final FileChooser fc = new FileChooser();
        fc.setTitle("Image Selection");
        File file = fc.showOpenDialog(stage);

        directoryPath = file.getParent();
        imageName = FilenameUtils.removeExtension(file.getName());


        String path = file.getAbsolutePath();


        if (file != null && file.isFile()) {
             if (isImageFile(path)){
                 updateFeedback("File Loaded: " + path);
                 imageView.setImage(new Image(file.toURI().toString()));
             } else {
                 updateFeedback("Not an Image File: " + path);
             }
        } else {
            updateFeedback("Failed to open file. Try again.");
        }
    }

    public void imageClickedEvent(MouseEvent e) {
        /**
         * Not in use
         *
         *System.out.println("Mouse clicked: " + e.getX() + " x " + e.getY());
         */
        
    }

    private void updateFeedback(String update) {
        feedback.setText(update);
    }

    private boolean isImageFile(String path) {
        return path.endsWith(".jpeg") || path.endsWith(".png") || path.endsWith(".raw");
    }

    private boolean allFieldsChosen() {
        return !symbol.getSelectionModel().isEmpty() &&
                !direction.getSelectionModel().isEmpty() &&
                !shape.getSelectionModel().isEmpty() &&
                !symbolColor.getSelectionModel().isEmpty() &&
                !backgroundColor.getSelectionModel().isEmpty();
    }

    private void resetFields() {
        symbol.valueProperty().setValue(null);
        direction.valueProperty().setValue(null);
        shape.valueProperty().setValue(null);
        backgroundColor.valueProperty().setValue(null);
        symbolColor.valueProperty().setValue(null);
    }
}

