module com.example.billsreminderapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.billsreminderapp to javafx.fxml;
    exports com.example.billsreminderapp;
}