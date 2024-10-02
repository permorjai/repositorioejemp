module com.uiejemplos.holamundofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.holamundofx to javafx.fxml;
    exports com.uiejemplos.holamundofx;
}