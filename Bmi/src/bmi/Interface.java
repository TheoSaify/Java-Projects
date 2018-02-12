/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author theos
 */
public class Interface extends JFrame implements ActionListener {
    
    JButton b1 = new JButton("calculer");
    JLabel l1 = new JLabel("masse");
    JLabel l2 = new JLabel("taille");
    JLabel l3 = new JLabel("");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();

     BorderLayout b = new BorderLayout();
     JPanel p = new JPanel();
     GridLayout gl = new GridLayout (3,1,20,20);
     
     public Interface(){
         
     this.setLayout(b);
     this.setTitle("BMI");
     this.setSize(400,400);

     p.setLayout(gl);
     
     p.add(l1);
     p.add(t1);
     p.add(l2);
     p.add(t2);
     p.add(b1);
     p.add(l3);
    

b1.addActionListener(this);

this.add(p,BorderLayout.CENTER);
this.setVisible(true);

     }

    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
         double a = Double.parseDouble(t1.getText());
         double b = Double.parseDouble(t1.getText());
         double bmi =a/(b*b);
         double m;
         m=bmi/(b*b);//masse reel
         if(bmi<18){
            l3.setText("sous poids,il faut gagner "+(a-m)+"Kg");
         }else{
         if(bmi>25){
             l3.setText("sur poids,il faut perdre "+(m-a)+"Kg");
         }else{
          l3.setText("Normal");
         }
         }

      }
     
    }

}
