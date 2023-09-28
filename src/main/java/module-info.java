module com.example.kinectfusion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kinectfusion to javafx.fxml;
    exports com.example.kinectfusion;
}