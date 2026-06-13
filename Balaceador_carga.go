package main

import "fmt"

func main() {
	fmt.Println("--- INFRAESTRUTURA EM NUVEM: BALANCEADOR DE CARGA ---")

	servidorA := "Servidor_Alpha"
	servidorB := "Servidor_Beta"
	
	totalRequisicoes := 5

	fmt.Printf("Iniciando distribuicao de %d acessos...\n\n", totalRequisicoes)

	for i := 1; i <= totalRequisicoes; i++ {
		
		if i % 2 == 0 {
			fmt.Printf("[Requisicao #%d] -> Redirecionada para: %s\n", i, servidorA)
		} else {
			fmt.Printf("[Requisicao #%d] -> Redirecionada para: %s\n", i, servidorB)
		}
	}

	fmt.Println("\n✓ Todas as requisicoes foram distribuidas com sucesso. Nenhum servidor caiu!")
}
