 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class GameInterface implements Runnable {

    private JFrame frame;

    public GameInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("Swagvisa");
        frame.setPreferredSize(new Dimension(640, 480));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.add(new JTextArea("Tähän tulee kysymys ja kolme vaihtoehtoa alle tulostettuna, vaihtoehtona "
                + "jotka näkyvät omalla vastausvaihtoehdollaan napin tekstissä. Shouldn't bee that hard"));
        container.add(createPanel(), BorderLayout.SOUTH);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(new JButton("Vaihtoehto A"));
        panel.add(new JButton("Vaihtoehto B"));
        panel.add(new JButton("Vaihtoehto C"));
        return panel;
    }
    

    public JFrame getFrame() {
        return frame;
    }
}
