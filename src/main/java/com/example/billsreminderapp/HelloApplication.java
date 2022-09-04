package com.example.billsreminderapp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);

            stage.show();
        }
        catch(Exception e){

        }

    }

    public void dispCalender(Stage stage){
        VBox vbox = new VBox(20);
        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);
        DatePicker datePicker = new DatePicker();

        datePicker.setValue(LocalDate.now());

        Button b=new Button("Set");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    LocalDate ld = datePicker.getValue();
                    Calendar c = Calendar.getInstance();
                    c.set(ld.getYear(), ld.getMonthValue()-1, ld.getDayOfMonth());
                    Date date = c.getTime();
                    System.out.println(date);
                    stage.hide();

            }
        });


        vbox.getChildren().add(new Label("Set Date:"));
        vbox.getChildren().add(datePicker);
        vbox.getChildren().add(b);
        stage.show();





    }




}