/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <math.h>

int main()
{
    
    float a,x,b,y,c;
    
      int opcao;
    
    
    printf("Informe o valor sua opcao:");
    scanf("%d", &opcao);
    
    
    if (opcao == 1) {
    
    printf("Informe o valor de a:");
    scanf("%f", &a);

    printf("Informe o valor de x:");
    scanf("%f", &x);

    printf("Informe o valor de b:");
    scanf("%f", &b);


     y = a*pow(x,3)- b*pow(x,0.5); 

    printf("O valor de y é: %.2f", y);
    
    }
    

 if (opcao == 2) {


    printf("Informe o valor de a:");
    scanf("%f", &a);

    printf("Informe o valor de x:");
    scanf("%f", &x);

    printf("Informe o valor de b:");
    scanf("%f", &b);


     y = 3*a*pow(x,3) - b/(2*pow(x,0.5));

    printf("O valor de y é : %.2f", y);


 }
 
 
 if (opcao == 3) {
     
      printf("Informe o valor de a:");
    scanf("%f", &a);

    printf("Informe o valor de x:");
    scanf("%f", &x);

    printf("Informe o valor de b:");
    scanf("%f", &b);
    
    printf("Informe o valor de c:");
    scanf("%f", &c);
    
    


     y = a*pow(x,2) + c*x - b*pow(x,3);

    printf("O valor de y é, %.2f", y);

 
 
 }
    
}