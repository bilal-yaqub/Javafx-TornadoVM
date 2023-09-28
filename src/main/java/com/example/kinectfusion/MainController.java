package com.example.kinectfusion;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;

public class MainController {

    // Labels
    @FXML
    private Label sizeMetresLabel;
    @FXML
    private Label sizeVoxelsLabel;
    @FXML
    private Label intrinsicCameraParametersLabel;
    @FXML
    private Label modelConfigurationLabel;
    @FXML
    private Label inputConfigurationLabel;

    // Texts
    @FXML
    private Text sizeMetresXText;
    @FXML
    private Text sizeMetresYText;
    @FXML
    private Text sizeMetresZText;
    @FXML
    private Text sizeVoxelsXText;
    @FXML
    private Text sizeVoxelsYText;
    @FXML
    private Text sizeVoxelsZText;
    @FXML
    private Text fxText;
    @FXML
    private Text fyText;
    @FXML
    private Text x0Text;
    @FXML
    private Text y0Text;
    @FXML
    private Text nearPlaneText;
    @FXML
    private Text farPlaneText;
    @FXML
    private Text scaleText;

    // ComboBox
    @FXML
    private ComboBox<String> inputComboBox;

    // Buttons
    @FXML
    private Button startButton;
    @FXML
    private Button stopButton;

    // Canvas
    @FXML
    private Canvas canvas;

    // Pane
    @FXML
    private Pane centerPane;

    @FXML
    public void initialize() {
        // Initialization code (if necessary)
    }

    @FXML
    private void onStart() {
        System.out.println("Start Button Clicked");
        // Add your start button handling code here
    }

    @FXML
    private void onStop() {
        System.out.println("Stop Button Clicked");
        // Add your stop button handling code here
    }
}
