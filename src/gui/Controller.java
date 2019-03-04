package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import javax.swing.event.MouseInputListener;
import java.io.File;
import java.io.IOException;

import com.drew.imaging.*;
import com.drew.lang.*;
import com.drew.metadata.*;
import com.drew.tools.*;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;



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

    /**
     * Implements the actions when next image button is clicked
     *
     * @param actionEvent The event that triggered the call
     */
    public void onChooseFolder(ActionEvent actionEvent) {

        Node source = (Node) actionEvent.getSource();
        Window stage = source.getScene().getWindow();

        final FileChooser fc = new FileChooser();
        fc.setTitle("Image Folder Selection");
        File file = fc.showOpenDialog(stage);
        String path = file.getAbsolutePath();

        if (file != null && file.isFile()) {
             if (isImageFile(path)){
                 updateFeedback("File Loaded: " + path);
                 imageView.setImage(new Image(file.toURI().toString()));
                 try {
                     Metadata metadata = ImageMetadataReader.readMetadata(file);
                     //print(metadata, "Using ImageMetadataReader");

                     for (Directory directory : metadata.getDirectories()) {

                         for (Tag tag : directory.getTags()) {
                             System.out.println(tag);
                         }
                         for (String error : directory.getErrors()) {
                             System.err.println("ERROR: " + error);
                         }
                     }
                 } catch (ImageProcessingException e) {
                 } catch (IOException e) {
                 }

             } else {
                 updateFeedback("Not an Image File: " + path);
             }
        } else {
            updateFeedback("Failed to open file. Try again.");
        }
    }

    public void imageClicked(MouseEvent e) {

        System.out.println("Mouse clicked");
        
    }

    private void updateFeedback(String update) {
        feedback.setText(update);
    }

    private boolean isImageFile(String path) {
        return path.endsWith(".jpeg") || path.endsWith(".png") || path.endsWith(".raw");
    }
}

