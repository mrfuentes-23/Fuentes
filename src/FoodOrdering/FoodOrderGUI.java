package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;

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

    public static void main(String[] args) {
        FoodOrderGUI food = new FoodOrderGUI();
        food.setTitle("Food Ordering System");
        food.setContentPane(food.panel1);
        food.setSize(600,450);
        food.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
