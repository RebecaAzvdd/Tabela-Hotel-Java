import java.util.Scanner;

public class At155 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] quartos = new char[4][3];
        
        do {
            System.out.println("Informe o número do andar de 1 a 4:");
            int andar = scanner.nextInt();
            System.out.println("Informe o número do quarto de 1 a 3:");
            int quarto = scanner.nextInt();
            
            if (andar >= 1 && andar <= 4 && quarto >= 1 && quarto <= 3) {
                quartos[4 - andar][quarto - 1] = 'X';
            } else {
                System.out.println("Valor inválido");
            }
            System.out.println("Deseja informar outra ocupação? (S/N)");
        } while (scanner.next().equalsIgnoreCase("S"));
        
        System.out.println("Ocupação do hotel:");
        for (int i = 0; i < quartos.length; i++) {
            System.out.println((4 - i) + "º andar:");

            for (int j = 0; j < quartos[i].length; j++) {
                char status = quartos[i][j] == 'X' ? 'X' : '0';
                System.out.print("[" + status + "] ");
            }
            System.out.println(); // Adiciona uma quebra de linha após cada andar
        }
    }
}




    

