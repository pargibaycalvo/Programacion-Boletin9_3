
package boletin9_3word;

import javax.swing.JOptionPane;

public class rectangulo {
    public void area (){ //declaramos publico el area
     float base, altura; //declaramos en float base y altura
        
do{
    base=Float.parseFloat(JOptionPane.showInputDialog("Base :")); //le decimos que nos pida la base
    
}while(base<=0);
    
do{
    altura=Float.parseFloat(JOptionPane.showInputDialog("Altura :")); //le decimos que nos pida la altura
    
}while(altura<=0);
    
        System.out.println("Area :" +(base*altura)); //le decimos que nos indique el resultado final
}

}