/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvjavawhile;

import java.util.Scanner;



/**
 *
 * @author gustavowz
 */
public class ATVjavawhile {

    public static void main(String[] args) {
 
   
        Scanner scanner = new Scanner(System.in);  
        
       
        System.out.println("Digite a quantidade de alunos:");
        int quantidadeAlunos = scanner.nextInt();  
        int contador = 0;  
        double soma = 0;  
        
        //enquanto o contador for menor que o numero inserido pelo usurario, sera executado o processo todo
        while (contador < quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            //vai adicionar 1 no contador a cada processo para mostrar cada aluno e seu respectivo numero
          
            double nota = scanner.nextDouble();
            
           //coloquei double mas nao sei se era double mesmo
           
           
            soma += nota;
            
            // vai receber o valor que foi colocado no scanner e somar
            
        //++ultilizao para somar 1 cada vez que é rodado o precesso e a cada nota de aluno
            contador++;
        
        
        
        double media = soma / quantidadeAlunos;
        //vai receber o valor que foi calculado no processo passado e e dividir pela quantidade de alunos colocada na primeira interaçao com o usurario
        
     
        System.out.println("A média aritmética da turma é: " + media);
       // ira mostrar o resultador do ultimo processo
        scanner.close();
    // se abriu o scanner tem que fechar para ao dar problema no codigo todo
    }
}
}