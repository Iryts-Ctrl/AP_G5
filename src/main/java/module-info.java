module Assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens Assignment to javafx.fxml;
    exports Assignment;
}