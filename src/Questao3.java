import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe responsavel por toda implementação da questão 3
 * @author Lucas Almeida
 */
public class Questao3 {

    /**
     * Verifica quantos anagramas pares possui
     * @param frase Frase recebida pelo usuario
     * @return Quantos pares substrings que são anagramas
     */
    static int anagramas(String frase) {
            Map<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < frase.length(); i++) {
                for (int j = i; j < frase.length(); j++) {
                    char[] substrings = frase.substring(i, j + 1).toCharArray();
                    Arrays.sort(substrings);
                    String nova = new String(substrings);

                    if (hashMap.containsKey(nova)) {
                        hashMap.put(nova, hashMap.get(nova) + 1);
                    } else {
                        hashMap.put(nova, 1);
                    }
                }
            }
            int paresAnagrama = 0;
            for (String nova : hashMap.keySet()) {
                int i = hashMap.get(nova);
                paresAnagrama += (i * (i - 1)) / 2; // i = combinação i! /(2! *(i -2)!
            }
            return paresAnagrama;
        }

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String frase = scanner.next();

            System.out.print(anagramas(frase));

    }

}



