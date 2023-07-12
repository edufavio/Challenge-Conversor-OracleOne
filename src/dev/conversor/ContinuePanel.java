package dev.conversor;

import javax.swing.*;

import static dev.conversor.Main.main;

public class ContinuePanel {
    // Controls the window where the user will choose to make another operation or end the program
    public static void toContinue() {
        int response = JOptionPane.showConfirmDialog(null,
                "Do you wish to make another operation?", "Alura Challenge # 2 - Conversor",
                JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            main(null);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Goodbye and thank you for using", "Alura Challenge # 2 - Conversor",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
