import javax.swing.*;

/**
 * the class for the methods to get the amount of "Umlaute" and the percentige
 * of "satzzeichen" of the text, also it checks for the cahrs if its a "satzzeichen"
 * @author Johannes Hummer
 * @version 2024-05-27
 */
public class NaturalLanguageProcessing {
    /**
     * the methode to get the amount of 'umlaute' in the text
     * @return retruns weither the text is empty or how many umlaute ar in it
     */
    public static String anzahlUmlaute(String text){
        text.toLowerCase();
        String back;
        char check;
        int anzahl=0;
        for (int i = 0; i < text.length(); i++) {
           check = text.charAt(i);
            switch (check) {
                case 'ä':
                case 'ö':
                case 'ü':
                case 'ß':
                    anzahl++;
            }
        }
        if(text.length()!=0){
            return "Umlaut-Andere = "+anzahl+"-"+(text.length()-anzahl)+".";
        }else {
            return "Es wurde kein Text übergeben.";
        }
    }

    /**
     * the methode to get the percentage of "satzzeichen" in the text
     * @param text the text from the input
     * @return returns if the percentage of satzzeichen is high, low  middle or error
     */
    public static String satzzeichenAnteil(String text){
        int length = text.length();
        double anzahl=0;
        for (int i = 0; i < length; i++){
            if (istSatzzeichen(text.charAt(i))){
                anzahl++;
            }
        }
        if (anzahl==0){
            return "Error! There are 0 punctuation marks!";
        } else if ((anzahl / length*100)<30) {
            return "Der Text enthält eher wenige Satzzeichen.";
        } else if ((anzahl/length*100)>=30&&(anzahl/length*100)<=60) {
            return "Der Text enthält etwa gleich viele Satzzeichen wie andere Buchstaben.";
        } else if ((anzahl/length*100)>60) {
            return "Der Text enthält eher viele Satzzeichen.";
        }
        return "Error! Deleting \\System32\\";
    }

    /**
     * the methode to check if one specific character is a satzzeichen or not
     * @param c the character to test
     * @return returns if the testet character is a "satzzeichen" or not
     */
    public static boolean istSatzzeichen(char c){
        switch (c){
            case '.':
            case ',':
            case ';':
            case ':':
            case '!':
            case '?':
            case '"':
            case '\'':
            case '-':
            case ')':
            case '(':
                return true;
            default: return false;
        }
    }
}
