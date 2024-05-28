import javax.swing.*;

/**
 * the class for the main methode to read in and print out the text and information
 * @author Johannes Hummer
 * @version 2024-05-27
 */
public class NatLangProcTest {
    /**
     * the text gets read in and the informations get printet out in a dialoge field
     */
    public static void main(String[] args) {
        String test;
        test = JOptionPane.showInputDialog(null, "Enter a test string");
        JOptionPane.showMessageDialog(null, NaturalLanguageProcessing.anzahlUmlaute(test));
        JOptionPane.showMessageDialog(null, NaturalLanguageProcessing.satzzeichenAnteil(test));
    }
}
