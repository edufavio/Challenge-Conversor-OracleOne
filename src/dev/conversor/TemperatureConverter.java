package dev.conversor;

import javax.swing.*;
import java.text.DecimalFormat;

import static dev.conversor.Main.main;
import static dev.conversor.ContinuePanel.toContinue;

public class TemperatureConverter {

    public static void tempConverter() {
        DecimalFormat decimalFormat = new DecimalFormat();
        double temp = 0;

        // Try catch to verify the temperature is a double
        try {
            temp = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature to convert"));
        } catch (NumberFormatException e) {
            // If temperature is not double, show an error message
            JOptionPane.showMessageDialog(null, "Invalid amount");
            tempConverter();
        } catch (NullPointerException e) {
            // If amount is null, go to main menu
            main(null);
        }

        // Unit of temperature to choose from
        Object[] options = {
                "Celsius to Kelvin",
                "Celsius to Fahrenheit",
                "Celsius to Rankine",
                "Fahrenheit to Celsius",
                "Fahrenheit to Kelvin",
                "Fahrenheit to Rankine",
                "Kelvin to Celsius",
                "Kelvin to Fahrenheit",
                "Kelvin to Rankine",
                "Rankine to Celsius",
                "Rankine to Fahrenheit",
                "Rankine to Kelvin"
        };

        try {
            String choices = (String) JOptionPane.showInputDialog(null, "Options",
                    "Temperature converter", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            // Conversion operations
            switch (choices) {
                case "Celsius to Kelvin":
                    double cToK = temp + 273.15;
                    JOptionPane.showMessageDialog(null,
                            temp + " Celsius = " + decimalFormat.format(cToK) + " Kelvin");
                    break;
                case "Celsius to Fahrenheit":
                    double cToF = (temp * 1.8) + 32;
                    JOptionPane.showMessageDialog(null,
                            temp + " Celsius = " + decimalFormat.format(cToF) + " Fahrenheit");
                    break;
                case "Celsius to Rankine":
                    double cToR = (temp + 273.15) * ((double) 9 / 5);
                    JOptionPane.showMessageDialog(null,
                            temp + " Celsius = " + decimalFormat.format(cToR) + " Rankine");
                    break;
                case "Fahrenheit to Celsius":
                    double fToC = (temp - 32) / 1.8;
                    JOptionPane.showMessageDialog(null,
                            temp + " Fahrenheit = " + decimalFormat.format(fToC) + " Celsius");
                    break;
                case "Fahrenheit to Kelvin":
                    double fToK = (temp + 459.67) * ((double) 5 / 9);
                    JOptionPane.showMessageDialog(null,
                            temp + " Fahrenheit = " + decimalFormat.format(fToK) + " Kelvin");
                    break;
                case "Fahrenheit to Rankine":
                    double fToR = temp + 459.67;
                    JOptionPane.showMessageDialog(null,
                            temp + " Fahrenheit = " + decimalFormat.format(fToR) + " Rankine");
                    break;
                case "Kelvin to Celsius":
                    double kToC = temp - 273.15;
                    JOptionPane.showMessageDialog(null,
                            temp + " Kelvin = " + decimalFormat.format(kToC) + " Celsius");
                    break;
                case "Kelvin to Fahrenheit":
                    double kToF = (temp * ((double) 9 / 5)) - 459.67;
                    JOptionPane.showMessageDialog(null,
                            temp + " Kelvin = " + decimalFormat.format(kToF) + " Fahrenheit");
                    break;
                case "Kelvin to Rankine":
                    double kToR = temp * ((double) 9 / 5);
                    JOptionPane.showMessageDialog(null,
                            temp + " Kelvin = " + decimalFormat.format(kToR) + " Rankine");
                    break;
                case "Rankine to Celsius":
                    double rToC = (temp - 491.67) * ((double) 5 / 9);
                    JOptionPane.showMessageDialog(null,
                            temp + " Rankine = " + decimalFormat.format(rToC) + " Celsius");
                    break;
                case "Rankine to Fahrenheit":
                    double rToF = temp - 459.67;
                    JOptionPane.showMessageDialog(null,
                            temp + " Rankine = " + decimalFormat.format(rToF) + " Fahrenheit");
                    break;
                case "Rankine to Kelvin":
                    double rToK = temp * ((double) 5 / 9);
                    JOptionPane.showMessageDialog(null,
                            temp + " Rankine = " + decimalFormat.format(rToK) + " Kelvin");
                    break;
                default:
                    main(null);
            }
        } catch (NullPointerException e) {
            // If user clicks on cancel, go to main menu
            main(null);
        }

        // The user chooses to continue or end the program
        toContinue();
    }
}
