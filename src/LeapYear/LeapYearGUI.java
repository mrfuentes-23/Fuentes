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
            int year=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane show = new JOptionPane();
                show.setSize(200,200);
                try {
                    year = Integer.parseInt(tfYear.getText());
                    if(year<0){
                        throw new Exception();
                    }
                    int leap = leapYear(year);

                    if(leap == 1) {
                        show.showMessageDialog(btnCheckYear, "Leap year");
                    }else {
                        show.showMessageDialog(btnCheckYear, "Not a leap year");
                    }
                }catch (NumberFormatException nf){
                    show.showMessageDialog(btnCheckYear, "Invalid Input: Input must be an integer.");
                }catch (Exception ex){
                    show.showMessageDialog(btnCheckYear, "Invalid Input.");
                } finally{

                }

            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();
        leap.setTitle("Leap Year Checker");
        leap.setContentPane(leap.jpanel);
        leap.setSize(300,300);
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


