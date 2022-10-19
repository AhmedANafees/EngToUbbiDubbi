
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nafea8846
 */
public class UbbiDubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.toLowerCase();
        String translate = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter != 'a' && letter != 'o' && letter != 'u' && letter != 'i' && letter != 'e') {
                translate = translate + letter;
            } else {
                if (word.charAt(i - 1) != 'a' && word.charAt(i - 1) != 'o' && word.charAt(i - 1) != 'u' && word.charAt(i - 1) != 'i' && word.charAt(i - 1) != 'e') {
                    translate = translate + "ub" + letter;
                } else {
                    translate = translate + letter;
                }
            }
        }
        System.out.println(translate);
    }

}
