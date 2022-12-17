package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    int flag=0;
    double dis=0,discount,total;
    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane order = new JOptionPane();
                order.setSize(200,200);
                order();
                discount();
                discount = total*dis;
                total-=discount;
                if(flag==0){
                    order.showMessageDialog(btnOrder, "Select order to avail a discount.");
                }else {order.showMessageDialog(btnOrder,  "The total price is Php " +total);
                total=0;
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI food = new FoodOrderGUI();
        food.setTitle("Food Ordering System");
        food.setContentPane(food.panel1);
        food.setSize(600,450);
        food.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        food.setVisible(true);
    }

    public void order(){
        if(cPizza.isSelected()) {
            total += 100;
            flag=1;
        } if(cBurger.isSelected()){
            total += 80;
            flag=1;
        } if(cFries.isSelected()){
            total += 65;
            flag=1;
        } if(cSoftDrinks.isSelected()){
            total += 55;
            flag=1;
        } if(cTea.isSelected()){
            total += 50;
            flag=1;
        } if(cSundae.isSelected()){
            total += 40;
            flag=1;
        }
    }

    public void discount(){
        if(rb5.isSelected()){
            dis = .05;
        } if(rb10.isSelected()){
            dis = .1;
        } if(rb15.isSelected()){
            dis = .15;
        }
    }
}
