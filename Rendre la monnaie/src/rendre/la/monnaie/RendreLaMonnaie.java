/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendre.la.monnaie;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Stack;

/**
 *
 * @author Theo
 */
public class RendreLaMonnaie {

    
public static void main(String[] args) throws IOException {
        double tab[]={500,200,100,50,10,5,2,1,0.50,0.20,0.10,0.05,0.02,0.01}; //representation triee de la liste des monnaies.

                               
        int j=0;        
        double value=12.34; 
        for (int i=0;i<tab.length;i++){
        if(value >= tab[i]){
       
            System.out.println(tab[i]);
         int val = (int) (value / (tab[i]));
         DecimalFormat df = new DecimalFormat ( ) ; 
        df.setMaximumFractionDigits ( 2 ) ; //arrondi à 2 chiffres apres la virgules 
        df.setMinimumFractionDigits ( 2 ) ; 
        df.setDecimalSeparatorAlwaysShown ( true ) ; 
          value =  Double.parseDouble(df.format (value%(tab[i])));
         System.out.println("rendre "+val+" de "+ tab[i]+"  res =" +Double.parseDouble(df.format ( value)));
        
        }else i++;       
         }  
    

}
}