import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nivel;
		String nome;
		int xp;
		
		
		System.out.print("Digite o nome do herói: ");
		nome = sc.nextLine();
		
		System.out.print("Quanto de XP você tem? ");
		xp = sc.nextInt();
		
		if (xp <= 1000) {
			nivel = "Ferro";
		} 
		else if (xp <= 2000) {
			nivel = "Bronze";
		}
		else if (xp <= 5000) {
			nivel = "Prata";
		}
		else if (xp <= 7000) {
			nivel = "Ouro";
		}
		else if (xp <= 8000) {
			nivel = "Platina";
		}
		else if (xp <= 9000) {
			nivel = "Ascendente";
		}
		else if (xp <= 10000) {
			nivel = "Imortal";
		}
		else if (xp > 10000) {
			nivel = "Radiante";
		} 
		else {
			nivel = null;
		}
				
		System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);
				
		sc.close();
	}

}
