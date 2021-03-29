/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdozeverdadeiro;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExDozeVerdadeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          float salario;
        double imposto=0;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o seu salario");
        salario = Float.parseFloat(leia.nextLine());
    
            imposto = (salario*0.05);
        
        System.out.println("Valor do Imposto é :"+ imposto);

    }
    
    
}
