import java.util.Scanner;

/**
 * Classe responsavel por toda implementação da questão 1
 * @author Lucas Almeida
 */
public class Questao1 {

    /**
     * Imprimir os asteristicos em escada
     * @param n Tamanho da escada
     */
    public static void escada(int n) {
        for (int i = 0; i < n; i++) { // para cada linha
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");  // imprime espaços
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");  // imprime asterisco
            }
            System.out.println(); // pula linha
        }
    }

    public static void main(String[] args) {

        Scanner numeroEntrada = new Scanner(System.in);
        System.out.print("n=");
        int n = numeroEntrada.nextInt();

        escada(n);

    }

}
