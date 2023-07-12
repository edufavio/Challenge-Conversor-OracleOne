package dev.conversor;

import javax.swing.*;

import static dev.conversor.ForeignExchange.currencyConverter;
import static dev.conversor.TemperatureConverter.tempConverter;


public class Main {

    public static void main(String[] args) {

        try{
            // Main menu where the user will choose to convert currency or temperature
            Object[] options = {
                    "Foreign exchange",
                    "Temperature converter"
            };

            String choices = (String) JOptionPane.showInputDialog(null, "Options",
                    "Alura Challenge # 2 - Conversor", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choices.equals("Foreign exchange")) {
                // Currency converter
                currencyConverter();
            } else {
                // Temperature converter
                tempConverter();
            }
        } catch (NullPointerException e) {
            // If user clicks button cancel, show goodbye message
            JOptionPane.showMessageDialog(null,
                    "Goodbye and thank you for using", "Alura Challenge # 2 - Conversor",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
