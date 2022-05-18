package pl.migibud.wzorceprojektowe.zadania.observer.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrzykładObserwatoraSwing {

    JFrame frame;

    public static void main(String[] args) {
        PrzykładObserwatoraSwing przykładObserwatoraSwing = new PrzykładObserwatoraSwing();
        przykładObserwatoraSwing.go();
    }

    public void go(){
/*        jFrame = new JFrame();
        JButton jButton = new JButton("Czy powinienem to zrobić?");
        jButton.addActionListener(new DiabelksiObNasłuchujący());
        jButton.addActionListener(new AnielskiObiektNasłuchujący());*/
        frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame By Example");
        JButton button = new JButton();
        button.setText("Button");
        button.addActionListener(new DiabelksiObNasłuchujący());
        button.addActionListener(new AnielskiObiektNasłuchujący());
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class AnielskiObiektNasłuchujący implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Nie rób tego!");
        }
    }

    class DiabelksiObNasłuchujący implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Pewnie, zrób to!");
        }
    }
}
