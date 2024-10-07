/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvjavawhile3;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class ATVjavawhile3 {

    public static void main(String[] args) {
      int maior=0;
      //primeiro valor maior
      int Segmaior=0;
      //segundo
      
      
      Scanner scanner= new Scanner(System.in);
     
      int  contador=0;//so pra limitar quantos numeros vao entrar, quantos o usuasrio vai colocar
      
      System.out.println("Digite 10 numeros: ");
      
      int W;
      
      // W por quanto do while mesmo
      
      while(contador<10){//limite
          
         W=scanner.nextInt();
         
         
           if (W > maior) {//se o valor colocado for menor que a variavel
               
        Segmaior = maior; // ai faz isso
        
        maior = W; 
    } 
   
    else if (W> Segmaior) { //"se nao" isso
        
        Segmaior=maior;
        
        maior = W; // recebe oq foi dado ali em cima 
    }
    
        contador++;
      }
       System.out.println("Maior: " + maior);
       
        System.out.println("Segundo maior: " + Segmaior);
    }
}
