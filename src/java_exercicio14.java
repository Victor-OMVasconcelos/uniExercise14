import java.util.*;
public class java_exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int ano = sc.nextInt();
        int atual = 2024;

        if (ano > atual) {
            System.out.println("Ano invalido");
        }
        else {
            System.out.println("Sua idade é: "+(atual-ano));
        }
    }
}