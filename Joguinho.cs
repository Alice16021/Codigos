using System;

class Program {
  static void Main() {
    Console.WriteLine("---EMBATE RPG: GUERREIRO VS GOBLIN ---");
    
    int vidaGlobin=50;
    int danoBaseJogador=12;
    
    Random dado= new Random();
    
    Console.WriteLine($"O Globin apareceu com {vidaGlobin} de HP!");
    Console.WriteLine("Pressione ENTER para atacar...");
    Console.ReadLine();
    
    int rolagemDado=dado.Next(1,11);
    int danoFinal=danoBaseJogador;
    
    Console.WriteLine($"Você rolou o dado e tirou: {rolagemDado}");
    
    if (rolagemDado>=9){
        danoFinal=danoBaseJogador*2;
        Console.WriteLine("ATAQUE CRÍTICO! Dano dobrado!");}
        
    else if (rolagemDado==1){
        danoFinal=0;
        Console.WriteLine("Você errou o ataque feio!");}
        
        vidaGlobin=vidaGlobin- danoFinal;
        Console.WriteLine($"Você causou {danoFinal} de dano.");
        
        if (vidaGlobin<=0){
            Console.WriteLine("SUCESSO! O Globin foi derrotado! +100 XP.");}
            else{
                Console.WriteLine($"O Goblin sobreviveu! Ele ainda tem {vidaGlobin} de HP.");
            }
  }
}
