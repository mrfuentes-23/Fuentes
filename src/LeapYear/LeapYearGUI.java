package LeapYear;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(leap.jpanel);
        leap.setSize(400,300);
        leap.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        leap.setVisible(true);
    }

}


