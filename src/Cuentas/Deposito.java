/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author Hmora
 */
public class Deposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        operativa_cuenta(200);

    }

    
    
    
    /**
     * @param cantidad
     * 
     */
    private static void operativa_cuenta(float cantidad) {
        // TODO code application logic here
        
        double saldoActual;
        
        CCuenta cuenta1;
        cuenta1= new CCuenta ("Jesus Martinez", "1000-2365-85-1230456789", 2500);
        
        saldoActual=cuenta1.estado();
        
        try{
            cuenta1.retirar(1800);
        }
        catch(Exception e){
            System.out.println("Fallo al retirar");
        }
        
    
        
        
        try{
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        }
        catch(Exception e){
            System.out.println("Fallo al ingresar");
        }
    }
    
}
