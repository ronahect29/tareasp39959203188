/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author daguilae
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float opc=0,dato1=0,dato2=0,result=0;
        JOptionPane.showMessageDialog(null,"Operaciones Basicas ");
       // JOptionPane.showInputDialog("seleccione una opcion:  1. -sumar  2. -restar  3-multiplicar  4-dividir  otro numeero.-salir");
        
       
        opc=Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion: 1. -sumar  2. -restar  3-multiplicar  4-dividir  otro numeero.-salir\""));

        if(opc>0&&opc<5){
            dato1=Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero: "));
            dato2=Integer.parseInt(JOptionPane.showInputDialog("ingrese segundo numero"));
        if(opc!=0){
            if(opc==1)
                result=dato1+dato2;
            if(opc==2)
                result=dato1-dato2;
            if(opc==3)
                result=dato1*dato2;
            if(opc==4)
                result=dato1/dato2;
            System.out.print("el resultado es: ");
            System.out.println(result);
        }
        JOptionPane.showMessageDialog(null, "el resultado es: "+result);
        }
            System.out.println("saliendo...");
            JOptionPane.showMessageDialog(null,"adios");      
    }
    
}
