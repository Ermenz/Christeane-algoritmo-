import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("É um novo cliente?");
        String condicao1 = sc.next();

        System.out.println("\n");

        String condicao2 = "não"; // Inicialmente, assumimos que o cliente não fez mais de 5 compras

        
        if (condicao1.equals("nao")) {
            System.out.println("O cliente fez mais de 5 compras nos últimos 6 meses?");
            condicao2 = sc.next();
            System.out.println("\n");
        }

        System.out.println("Informe o valor total das compras");
        float valorCompras = sc.nextFloat();

        System.out.println("\n");

     
        if (condicao1.equals("sim") && valorCompras > 500) {
                System.out.println("Não pode fazer compras com valor total superior a esse limite até que complete 3 meses como cliente ativo.");
            }
        
        
        if (condicao1.equals("sim") && valorCompras < 500) {
                System.out.println(String.format("Valor das compras: %.2f", valorCompras));
            }
        
        

         if (condicao1.equals("nao") && condicao2.equals("sim")) {
               float valorComDesconto = valorCompras - valorCompras * 0.1f; 
                  System.out.println(String.format("Valor das compras com desconto de 10%%: %.2f", valorComDesconto));
            }
            
    
       if (condicao1.equals("nao") && condicao2.equals("nao")) {
                  System.out.println(String.format("Valor das compras sem desconto: %.2f",  valorCompras));
            }
      
      

        sc.close(); 
    }
}