#include <stdio.h>

int main(){
    char nome[50];
    int idade;
    
    printf("Digite o seu nome: ");
    scanf("%49s", nome);
    
    printf("Digite sua idade: ");
    scanf("%d", &idade);
    
    if (idade>=18){
        printf("Olá, %s! Você tem %d anos e já é maior de idade. \n", nome, idade);
    }
    else {
        printf("Olá, %s! Você tem %d anos e ainda é menor de idade. \n", nome, idade);
    }
    return 0;
}
