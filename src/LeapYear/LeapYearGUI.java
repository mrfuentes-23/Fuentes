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
                JOptionPane show = new JOptionPane();
                show.setSize(200,300);
                int year = Integer.parseInt(tfYear.getText());
                int leap = leapYear(year);
                if(leap == 1) {
                    show.showMessageDialog(null, "Leap year");
                }else {
                    show.showMessageDialog(null, "Not a leap year");
                }
                show.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();
        leap.setTitle("Leap Year Checker");
        leap.setContentPane(leap.jpanel);
        leap.setSize(400,300);
        leap.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        leap.setVisible(true);
    }

    public static int leapYear(int year){
        if(year%400==0){
            return 1;
        } else if(year%4==0 && year%100!=0){
            return 1;
        }
        return 0;
    }
}


