/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import swagvisa.Logic.Game;
import swagvisa.Questions.Question;
import swagvisa.Questions.QuestionList;

/**
 * Luokassa tehdään graafinen käyttöliittymä jossa piirretään tekstikenttä jonne
 * kysymykset ilmestyvät sekä sen lisäksi 3 vastausvaihtoehtoa nappien muodossa,
 * joita pelaaja painelee.
 *
 */
public class UserInterface implements Runnable {

    private int numberOfQuestions;
    private String playerName;
    private String teamName;
    private JFrame frame;
    private JTextArea questionArea;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    
    private Game g;

    public UserInterface(Game g) {
        this.g = g;
    }
    
    /**
     * Graafisen osan käynnistävä metodi.
     */
    @Override
    public void run() {
        frame = new JFrame("Swagvisa");
        frame.setPreferredSize(new Dimension(800, 120));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        refresh();
    }

    private void createComponents(Container container) {
        this.questionArea = new JTextArea();
        this.buttonA = new JButton();
        this.buttonB = new JButton();
        this.buttonC = new JButton();
        ActionListener kuuntelija = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message;
                if(g.answer(((JButton)e.getSource()).getText())) {
                    message = "Oikein!";
                }
                else {
                    message = "Väärin!";
                }
                JOptionPane.showMessageDialog((JButton)e.getSource(), message);
                refresh();
            }
        };
        buttonA.addActionListener(kuuntelija);
        buttonB.addActionListener(kuuntelija);
        buttonC.addActionListener(kuuntelija);
        container.add(questionArea);
        container.add(createPanel(), BorderLayout.SOUTH);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(buttonC);
        return panel;
    }

    private void refresh() {
        QuestionList list = g.ask();
        questionArea.setText(list.getQuestion1().getDefinition());
        ArrayList<Question> options = list.getQuestions();
        buttonA.setText(options.get(0).getAbbreviation());
        buttonB.setText(options.get(1).getAbbreviation());
        buttonC.setText(options.get(2).getAbbreviation());
    }

    public JFrame getFrame() {
        return frame;
    }
}