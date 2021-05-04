/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionariologicaexer7;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class QuestionarioLogicaExer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
        String nome;
        double salarioBruto, salarioLiquido, impostoDeRenda;
        
        System.out.println("Informe o nome do funcionário");
        nome = teclado.nextLine();
        System.out.println("Informe o salário bruto do funcionário");
        salarioBruto = teclado.nextDouble();
        
        
        if(salarioBruto < 3.500 ){
      
            salarioLiquido = salarioBruto * 0.055;
            impostoDeRenda = salarioLiquido - 0.035;
            System.out.println("Nome: "+nome);
            System.out.println("Salário Bruto "+salarioBruto+"R$.");
            System.out.println("I.R: "+impostoDeRenda+"R$.");
            System.out.println("Salário Líquido: "+salarioLiquido+"R$.");
           
        }else{
            salarioLiquido = salarioBruto * 0.055;
            impostoDeRenda = salarioLiquido - 0.075;
            System.out.println("Nome: "+nome);
            System.out.println("Salário Bruto: "+salarioBruto+"R$.");
            System.out.println("I.R: "+impostoDeRenda+"R$.");
            System.out.println("Salário Líquido: "+salarioLiquido+"R$.");
        }
    }
    
}
