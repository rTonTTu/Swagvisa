/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.GUI;

import java.util.Scanner;
import javax.swing.SwingUtilities;
import swagvisa.Questions.Question;
import swagvisa.User.Player;
import swagvisa.GUI.UserInterface;
import swagvisa.Logic.Game;

/**
 *
 * @author TonTTu
 */
public class main {

    public static void main(String args[]) {
        Game g = new Game();
        UserInterface ui = new UserInterface(g);
        SwingUtilities.invokeLater(ui);
        
    }
}
