#include <iostream>
#include <string>

int main() {
    std::string nome;
    int idade;
    
    std::cout<<"Digite o seu nome: ";
    
    std::cin >> nome;
    
    std::cout << "Digite a sua idade: ";
    std::cin >> idade;
    
    if (idade >= 18){
        std::cout <<"Ola, "<<nome<< "! Voce tem " <<idade<< " anos e já é maior de idade.\n";}
        else{
        std::cout <<"Ola, "<<nome<< "! Voce tem " <<idade<< " anos e ainda é menor de idade.\n";
    }
    return 0;
}
