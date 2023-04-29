module New {
    requires java.desktop;
    requires jlayer;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires junit;

    opens com.Brax;
    opens com.Brax.backgroundPNG;
    opens com.Brax.foodPNG;
    opens com.Brax.misc;
    opens com.Brax.snakeModel;
    opens com.Brax.scoreTXT;
    opens com.Brax.Controller;
    opens com.Brax.Model;
    opens com.Brax.View;
}