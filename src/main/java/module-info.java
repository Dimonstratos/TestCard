module ru.netology.testcard {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.netology.testcard to javafx.fxml;
    exports ru.netology.testcard;
}