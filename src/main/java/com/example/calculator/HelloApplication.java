package com.example.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Boolean clear = true;
    @Override
    public void start(Stage stage) throws IOException {
        //text field for input output
        TextField txt = new TextField();
        txt.setText("0");

        //number buttons
        Button btn0 = new Button("0");
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "0");
            }
        });
        Button btn1 = new Button("1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "1");
            }
        });
        Button btn2 = new Button("2");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "2");
            }
        });
        Button btn3 = new Button("3");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "3");
            }
        });
        Button btn4 = new Button("4");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "4");
            }
        });
        Button btn5 = new Button("5");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "5");
            }
        });
        Button btn6 = new Button("6");
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "6");
            }
        });
        Button btn7 = new Button("7");
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "7");
            }
        });
        Button btn8 = new Button("8");
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "8");
            }
        });
        Button btn9 = new Button("9");
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(clear){
                    txt.clear();
                    clear = false;
                }
                txt.setText(txt.getText() + "9");
            }
        });

        //operation buttons
        Button plus = new Button("+");
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                txt.setText(txt.getText() + " + ");
            }
        });
        Button minus = new Button("-");
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                txt.setText(txt.getText() + " - ");
            }
        });
        Button times = new Button("×");
        times.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                txt.setText(txt.getText() + " × ");
            }
        });
        Button divide = new Button("÷");
        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                txt.setText(txt.getText() + " ÷ ");
            }
        });
        Button equals = new Button("=");
        equals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                clear = true;
                String[] input = txt.getText().split(" ");
                int num1 = Integer.parseInt(input[0]);
                int num2 = Integer.parseInt(input[2]);
                int sum;
                int diff;
                int prod;
                double quot;

                System.out.println(input[0] + input[1] + input[2]);
                if(input[1].equals("+")){
                    sum = num1 + num2;
                    txt.setText(txt.getText() + " = " + Integer.toString(sum));
                }else if (input[1].equals("-")){
                    diff = num1 - num2;
                    txt.setText(txt.getText() + " = " + Integer.toString(diff));
                }else if (input[1].equals("×")){
                    prod = num1*num2;
                    txt.setText(txt.getText() + " = " + Integer.toString(prod));
                }else if (input[1].equals("÷")){
                    if(num2 == 0) {
                        txt.setText("ERROR: Can't divide by 0");
                    }else{
                        quot = (double)num1/(double)num2;
                        txt.setText(txt.getText() + " = " + Double.toString(quot));
                    }
                }
            }
        });

        //display
        StackPane root=new StackPane();

        root.getChildren().add(btn0);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        root.getChildren().add(btn6);
        root.getChildren().add(btn7);
        root.getChildren().add(btn8);
        root.getChildren().add(btn9);

        btn1.setTranslateX(-150);
        btn1.setTranslateY(-150);
        btn1.setMaxSize(90,90);

        btn2.setTranslateX(0);
        btn2.setTranslateY(-150);
        btn2.setMaxSize(90,90);

        btn3.setTranslateX(-150);
        btn3.setTranslateY(-50);
        btn3.setMaxSize(90,90);

        btn4.setTranslateX(0);
        btn4.setTranslateY(-50);
        btn4.setMaxSize(90,90);

        btn5.setTranslateX(-150);
        btn5.setTranslateY(50);
        btn5.setMaxSize(90,90);

        btn6.setTranslateX(0);
        btn6.setTranslateY(50);
        btn6.setMaxSize(90,90);

        btn7.setTranslateX(-150);
        btn7.setTranslateY(150);
        btn7.setMaxSize(90,90);

        btn8.setTranslateX(0);
        btn8.setTranslateY(150);
        btn8.setMaxSize(90,90);

        btn9.setTranslateX(-150);
        btn9.setTranslateY(250);
        btn9.setMaxSize(90,90);

        btn0.setTranslateX(0);
        btn0.setTranslateY(250);
        btn0.setMaxSize(90,90);

        root.getChildren().add(plus);
        root.getChildren().add(minus);
        root.getChildren().add(times);
        root.getChildren().add(divide);
        root.getChildren().add(equals);

        plus.setTranslateX(150);
        plus.setTranslateY(-150);
        plus.setMaxSize(90,90);

        minus.setTranslateX(150);
        minus.setTranslateY(-50);
        minus.setMaxSize(90,90);

        times.setTranslateX(150);
        times.setTranslateY(50);
        times.setMaxSize(90,90);

        divide.setTranslateX(150);
        divide.setTranslateY(150);
        divide.setMaxSize(90,90);

        equals.setTranslateX(150);
        equals.setTranslateY(250);
        equals.setMaxSize(90,90);

        root.getChildren().add(txt);

        txt.setTranslateX(0);
        txt.setTranslateY(-250);

        Scene scene = new Scene(root, 500, 600);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}