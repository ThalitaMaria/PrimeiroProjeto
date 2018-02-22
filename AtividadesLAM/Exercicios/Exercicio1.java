import java.util.*;

public class Exercicio1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        float horas;
        float valorHora;
        float valorTotal;
        System.out.println("Digite seu nome: ");
        nome = input.next();
        System.out.println("Informe o número de horas trabalhadas: ");
        horas = input.nextFloat();
        System.out.println("Informe o valor pago por horas: ");
        valorHora = input.nextFloat();
        valorTotal = valorHora * horas;
        System.out.printf("\nO valor total a ser pago será %f\n", valorTotal);
    }
}
