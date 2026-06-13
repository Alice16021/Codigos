fun main() {
    println("--- SISTEMA DE NOTIFICAÇÕES PUSH (ANDROID) ---")
    
    val nomeUsuario="Alice"
    
    val tipoNotificacao=1 
    
    println("Verificando novas notificações para $nomeUsuario...\n")
    
    val mensagemFinal= when (tipoNotificacao){
        1-> "[CUPOM] Ola, $nomeUsuario! Voce ganhou 20% de desconto na nossa loja. Aproveite!"
        2-> "[MENSAGEM] Alguem curtiu seus storys"
        3-> "[SEGURANCA] Um novo login foi detectado em um dispositivo desconhecido."
        else -> "[NOTIFICACAO] Voce tem uma nova atualizacao pendente."
    }
    
    println("Enviando Push Notification...")
    println(mensagemFinal)
}
