package com.example.billsreminderapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class HelloController {
    @FXML
    public void greet(ActionEvent e){
        System.out.println("Welcome");
    }
    public void showDate(ActionEvent e){
        DatePicker datePicker=new DatePicker(LocalDate.now());
        LocalDate ld = datePicker.getValue();
        Calendar c =  Calendar.getInstance();
        c.set(ld.getYear(), ld.getMonthValue() - 1, ld.getDayOfMonth());
        Date date = c.getTime();
        System.out.println(ld+"\n"+date);
    }
    public void onClick(ActionEvent e) {
        Stage stage = new Stage();
        HelloApplication obj = new HelloApplication();
        obj.dispCalender(stage);
    }
}