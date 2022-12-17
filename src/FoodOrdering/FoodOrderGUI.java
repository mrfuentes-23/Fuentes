package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    class NoSelectedOrder extends Exception{
    }
    class NoSelectedDiscount extends Exception{
    }
    class BothNotSelected extends Exception{
    }
    int flagO=0, flagD=0;
    double dis=0,discount,total;
    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane order = new JOptionPane();
                order.setSize(200,200);
                flagD=0;
                flagO=0;
                total=0;
                order();
                discount();
                try{
                discount = total*dis;
                total-=discount;
                if(flagO==0 && flagD==1){
                    total=0;
                    throw new NoSelectedOrder();
                }else if(flagO==1 && flagD==0){
                    total=0;
                    throw new NoSelectedDiscount();
                }else if(flagO==0 && flagD==0){
                    total=0;
                    throw new BothNotSelected();
                }else {
                 if(total%1==0){
                     order.showMessageDialog(btnOrder,  "The total price is Php " +String.format("%.0f",total) );
                 }else{
                     order.showMessageDialog(btnOrder,  "The total price is Php " +String.format("%.2f",total));
                 }
                }
            }catch (NoSelectedOrder so) {
                order.showMessageDialog(btnOrder, "Select order to avail a discount.");
            }catch (NoSelectedDiscount sd) {
                order.showMessageDialog(btnOrder, "Select a discount.");
            }catch (BothNotSelected ns) {
                order.showMessageDialog(btnOrder, "Place your order.");
            }catch(Exception ex){
                order.showMessageDialog(btnOrder, "Invalid Choices");
            }finally {
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
            flagO=1;
        } if(cBurger.isSelected()){
            total += 80;
            flagO=1;
        } if(cFries.isSelected()){
            total += 65;
            flagO=1;
        } if(cSoftDrinks.isSelected()){
            total += 55;
            flagO=1;
        } if(cTea.isSelected()){
            total += 50;
            flagO=1;
        } if(cSundae.isSelected()){
            total += 40;
            flagO=1;
        }
    }

    public void discount(){
        if(rb5.isSelected()){
            dis = .05;
            flagD = 1;
        } if(rb10.isSelected()){
            dis = .1;
            flagD = 1;
        } if(rb15.isSelected()){
            dis = .15;
            flagD = 1;
        } if(rbNone.isSelected()){
            dis = 0;
            flagD =1;
        }
    }
}
