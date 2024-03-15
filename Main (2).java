/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
      
 
    System.out.println("É um novo cliente ?");
          String condicao1 = sc.next();
          
    System.out.println ("\n");
     
    System.out.println("O Clientes fez mais de 5 compras nos últimos 6 meses ?");
          String condicao2 = sc.next();
          
    System.out.println ("\n");
    
    System.out.println("Informe o valor total das compras"); 
	  float valorCompras = sc.nextFloat();
	  
	System.out.println ("\n");  
     
     if(condicao1.equals("sim") && valorCompras > 500) {
      
      System.out.println("não  podem fazer  compras com valor total superior a esse limite até que completem  3 meses como clientes ativos.");   
         
      } else if (condicao1.equals("sim") && valorCompras < 500) {
          
         System.out.println(String.format("Valor das compras: %.2f", valorCompras));  
     
      } else if  (condicao1.equals("sim") && condicao2.equals("sim")){
          
       float valorcomDesconto = valorCompras - valorCompras * 0.1f;
          
          System.out.println(String.format("Valor das compras com desconto de 10% : %.2f", valorCompras));  
  
      } else if  (condicao1.equals("sim") && condicao2.equals("não")){

     System.out.println(String.format("Valor das compras com desconto de 10% : %.2f", valorCompras));  
  
      }
     
     
     


	}
}
