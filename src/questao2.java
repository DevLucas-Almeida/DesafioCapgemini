import java.util.Scanner;
import java.util.regex.*;

/**
 * Classe responsavel por toda implementação da questão 2
 * @author Lucas Almeida
 */
public class questao2 {

    /**
     * Usada para retornar o quanto a senha é forte
     * @param senha Senha recebida pelo usuario
     * @return valor entre [0,5]
     */
    public static int validaSenha(String senha) {
        int contador = 0;
        if (senha.length() >= 6) {
            contador++;
        }
        if (senha.length() >= 1) {
            contador++;
        }
        Matcher maiusculo = Pattern.compile("[A-Z]").matcher(senha);
        if (maiusculo.find()) {
            contador++;
        }
        Matcher minusculo = Pattern.compile("[a-z]").matcher(senha);
        if (minusculo.find()) {
            contador++;
        }
        Matcher especiais = Pattern.compile("[!@#%^$&*()\\-+]").matcher(senha);
        if (especiais.find()) {
            contador++;
        }
        return contador;
    }

    /**
     * indica quantos digitos faltam para a senha ser forte
     * @param senha Senha recebida pelo usuario
     * @return inteiro de [0,5]
     */
    public static int caracteresRestantes(String senha) {
        int senhaForte = validaSenha(senha);
        if (senha.length() == 6 && senhaForte == 5) {
            return 0;
        }else if(senha.length() == 6 && senhaForte < 5) {
            return (5 - senhaForte);
        }else {
            return (6 - senha.length());
        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String senha = entrada.next();

        System.out.print(caracteresRestantes(senha));
    }
}
