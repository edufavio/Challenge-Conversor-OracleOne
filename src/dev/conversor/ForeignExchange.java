package dev.conversor;

import javax.swing.*;
import java.text.DecimalFormat;

import static dev.conversor.Main.main;
import static dev.conversor.ContinuePanel.toContinue;

public class ForeignExchange {

    public static void currencyConverter() {
        DecimalFormat decimalFormat = new DecimalFormat();
        double amount = 0;

        // Try catch to verify if amount is a double
        try {
            amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to convert"));
        } catch (NumberFormatException e) {
            // If amount is not double, show an error message
            JOptionPane.showMessageDialog(null, "Invalid amount");
            currencyConverter();
        } catch (NullPointerException e) {
            // If amount is null, go to main menu
            main(null);
        }

        // Currencies to choose from
        Object[] options = {
                "Peruvian sol PEN to United States dollar USD",
                "Peruvian sol PEN to Euro EUR",
                "Peruvian sol PEN to Pound sterling GBP",
                "Peruvian sol PEN to Japanese jen JPY",
                "Peruvian sol PEN to South Korean won KRW",
                "United States dollar USD to Peruvian sol PEN",
                "Euro EUR to Peruvian sol PEN",
                "Pound sterling GBP to Peruvian sol PEN",
                "Japanese jen JPY to Peruvian sol PEN",
                "South Korean won KRW to Peruvian sol PEN"
        };

        try {
            // Choose conversion option
            String choices = (String) JOptionPane.showInputDialog(null, "Options",
                    "Foreign exchange", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            // Switch case
            switch (choices) {
                case "Peruvian sol PEN to United States dollar USD":
                    double usd = amount * 0.28;
                    JOptionPane.showMessageDialog(null,
                            amount + " PEN = " + decimalFormat.format(usd) + " USD");
                    break;
                case "Peruvian sol PEN to Euro EUR":
                    double eur = amount * 0.25;
                    JOptionPane.showMessageDialog(null,
                            amount + " PEN = " + decimalFormat.format(eur) + " EUR");
                    break;
                case "Peruvian sol PEN to Pound sterling GBP":
                    double gbp = amount * 0.22;
                    JOptionPane.showMessageDialog(null,
                            amount + " PEN = " + decimalFormat.format(gbp) + " GBP");
                    break;
                case "Peruvian sol PEN to Japanese jen JPY":
                    double jpy = amount * 39.16;
                    JOptionPane.showMessageDialog(null,
                            amount + " PEN = " + decimalFormat.format(jpy) + " JPY");
                    break;
                case "Peruvian sol PEN to South Korean won KRW":
                    double krw = amount * 357.96;
                    JOptionPane.showMessageDialog(null,
                            amount + " PEN = " + decimalFormat.format(krw) + " KRW");
                    break;
                case "United States dollar USD to Peruvian sol PEN":
                    double usdP = amount * 3.63;
                    JOptionPane.showMessageDialog(null,
                            amount + " USD = " + decimalFormat.format(usdP) + " PEN");
                    break;
                case "Euro EUR to Peruvian sol PEN":
                    double eurP = amount * 3.94;
                    JOptionPane.showMessageDialog(null,
                            amount + " EUR = " + decimalFormat.format(eurP) + " PEN");
                    break;
                case "Pound sterling GBP to Peruvian sol PEN":
                    double gbpP = amount * 4.59;
                    JOptionPane.showMessageDialog(null,
                            amount + " GBP = " + decimalFormat.format(gbpP) + " PEN");
                    break;
                case "Japanese jen JPY to Peruvian sol PEN":
                    double jpyP = amount * 0.03;
                    JOptionPane.showMessageDialog(null,
                            amount + " JPY = " + decimalFormat.format(jpyP) + " PEN");
                    break;
                case "South Korean won KRW to Peruvian sol PEN":
                    double krwP = amount * 0.0027;
                    JOptionPane.showMessageDialog(null,
                            amount + " KRW = " + decimalFormat.format(krwP) + " PEN");
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
