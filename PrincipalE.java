import java.util.Scanner;
public class PrincipalE{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Elevador obj = new Elevador();
        System.out.println("Qual andar está o elevador:");
        obj.setAndarAtual(ler.nextInt());
        System.out.println("Qual o último andar");
        obj.setTotalAndares(ler.nextInt());
        System.out.println("Qual a capacidade máxima do elevador");
        obj.setCapacidade(ler.nextInt());
        System.out.println("Quantas pessoas tem no elevador");
        obj.setQuantidadePessoas(ler.nextInt());
    }
}