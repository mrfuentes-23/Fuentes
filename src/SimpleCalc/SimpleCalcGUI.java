package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            int num1,num2,result;
            String ope;

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane mess = new JOptionPane();
                mess.setSize(200, 200);
                try {
                    num1 = Integer.parseInt(tfNumber1.getText());
                    num2 = Integer.parseInt(tfNumber2.getText());
                    ope = cbOperations.getSelectedItem().toString();

                    if (ope == "+") {
                        result = num1 + num2;
                    }else if(ope == "-"){
                        result = num1 - num2;
                    }else if(ope == "*"){
                        result = num1 * num2;
                    }else if(ope == "/"){
                        result = num1 / num2;
                    }
                } catch (NumberFormatException nf) {
                    mess.showMessageDialog(btnCompute, "Invalid Input: Inputs must be Integer");
                } catch (ArithmeticException ae){
                    mess.showMessageDialog(btnCompute, "Invalid Input: Second number must not be zero");
                } finally{

                }
                lblResult.setText(String.valueOf(result));
            }

        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setTitle("Simple Calculator");
        calc.setContentPane(calc.panel1);
        calc.setSize(530,400);
        calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}
