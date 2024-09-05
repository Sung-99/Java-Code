
package src.logica;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button equals;
    @FXML
    private Button minus;
    @FXML
    private Button plus;
    @FXML
    private Button multiplication;
    @FXML
    private Button division;
    @FXML
    private Button clear;
    @FXML
    private TextField display;

    double answer = 0.0;
    int operation = 0;
    String leftValue = "", rightValue = "", displayString = "";
    boolean fillLeft = true;

    @FXML
    void handleButtonAction(ActionEvent event) {
        //Valores numericos
        if (event.getSource() == one) {
            if (fillLeft) {
                leftValue += "1";
                displayString = leftValue;
            } else {
                rightValue += "1";
                displayString += "1";
            }
            display.setText(displayString);
        } else if (event.getSource() == two) {
            if (fillLeft) {
                leftValue += "2";
                displayString = leftValue;
            } else {
                rightValue += "2";
                displayString += "2";
            }
            display.setText(displayString);
        } else if (event.getSource() == three) {
            if (fillLeft) {
                leftValue += "3";
                displayString = leftValue;
            } else {
                rightValue += "3";
                displayString += "3";
            }
            display.setText(displayString);
        } else if (event.getSource() == four) {
            if (fillLeft) {
                leftValue += "4";
                displayString = leftValue;
            } else {
                rightValue += "4";
                displayString += "4";
            }
            display.setText(displayString);
        } else if (event.getSource() == five) {
            if (fillLeft) {
                leftValue += "5";
                displayString = leftValue;
            } else {
                rightValue += "5";
                displayString += "5";
            }
            display.setText(displayString);
        } else if (event.getSource() == six) {
            if (fillLeft) {
                leftValue += "6";
                displayString = leftValue;
            } else {
                rightValue += "6";
                displayString += "6";
            }
            display.setText(displayString);
        } else if (event.getSource() == seven) {
            if (fillLeft) {
                leftValue += "7";
                displayString = leftValue;
            } else {
                rightValue += "7";
                displayString += "7";
            }
            display.setText(displayString);
        } else if (event.getSource() == eight) {
            if (fillLeft) {
                leftValue += "8";
                displayString = leftValue;
            } else {
                rightValue += "8";
                displayString += "8";
            }
            display.setText(displayString);
        } else if (event.getSource() == nine) {
            if (fillLeft) {
                leftValue += "9";
                displayString = leftValue;
            } else {
                rightValue += "9";
                displayString += "9";
            }
            display.setText(displayString);
        } else if (event.getSource() == zero) {
            if (fillLeft) {
                leftValue += "0";
                displayString = leftValue;
            } else {
                rightValue += "0";
                displayString += "0";
            }
            display.setText(displayString);
        } else if (event.getSource() == clear) {
            leftValue = rightValue = "";
            displayString = "0.0";
            fillLeft = true;
            answer = 0;
            display.setText(displayString);
        } else { //Equações
            if (!leftValue.equals("")) {
                fillLeft = false;
                if (event.getSource() == plus) {
                    if (!displayString.contains("+")) {
                        operation = 1;
                        displayString += " + ";
                        display.setText(displayString);
                    }
                } else if (event.getSource() == minus) {
                    if (!displayString.contains("-")) {
                        operation = 2;
                        displayString += " - ";
                        display.setText(displayString);
                    }
                } else if (event.getSource() == multiplication) {
                    if (!displayString.contains("*")) {
                        operation = 3;
                        displayString += " * ";
                        display.setText(displayString);
                    }
                } else if (event.getSource() == division) {
                    if (!displayString.contains("/")) {
                        operation = 4;
                        displayString += " / ";
                        display.setText(displayString);
                    }
                } else if (event.getSource() == equals) {
                    if (!rightValue.equals("")) {
                        fillLeft = true;
                        switch (operation) {
                            case 1: // Addition
                                answer = Float.parseFloat(leftValue) + Float.parseFloat(rightValue);
                                displayString = String.valueOf(answer);
                                break;
                            case 2: // Subtraction
                                answer = Float.parseFloat(leftValue) - Float.parseFloat(rightValue);
                                displayString = String.valueOf(answer);
                                break;
                            case 3: // Multiplication
                                answer = Float.parseFloat(leftValue) * Float.parseFloat(rightValue);
                                displayString = String.valueOf(answer);
                                break;
                            case 4: // Division
                                try {
                                    answer = Float.parseFloat(leftValue) / Float.parseFloat(rightValue);
                                } catch (Exception e) {
                                    displayString = String.valueOf(e.getMessage());
                                }
                                displayString = String.valueOf(answer);
                                break;
                        }
                        display.setText(displayString);
                        leftValue = rightValue = displayString = "";
                        fillLeft = true;
                        answer = 0;
                    }
                }
            }
        }

    }

}