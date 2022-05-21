module com.example.comp1101m2022ice2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgian.comp1101m2022ice2 to javafx.fxml;
    exports ca.georgian.comp1101m2022ice2;
}