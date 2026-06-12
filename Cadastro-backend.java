import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner leitor= new Scanner(System.in);
	    
		System.out.println("--- SISTEMA DE CADASTRO (BACK-END) ---");
		
		System.out.print("Crie um nome de usuário: ");
		String usuario=leitor.nextLine();
		
		System.out.print("Crie uma senha (mínimo de 6 caractres): ");
		String senha=leitor.nextLine();
		
		System.out.print("Confirme sua senha: ");
		String confirmacao=leitor.nextLine();
		
		System.out.println("\n--- PROCESSANDO REQUISIÇÃO ---");
		
		
		if (senha.length()<6){
		    System.out.println("ERRO 400: Senha muito fraca. Tente de novo.");
		}
		
		else if (!senha.equals(confirmacao)){
		    System.out.println("ERRO 400: As senhas não coincidem! Tente novamente.");
		}
		else{
		    System.out.println("SUCESSO: Usuário '" + usuario + "' cadastrado com sucesso no banco de dados!");
		    }
		    leitor.close();
		}
	}
