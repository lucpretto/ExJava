import java.util.Scanner;
public class PrincipalP{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Produto obj = new Produto();
        System.out.println("Entre com o nome do produto:");
        obj.setNome(ler.nextLine());
        System.out.println("Entre com o preço:");
        obj.setPreco(ler.nextDouble());
        System.out.println("Entre com a quantidade:");
        obj.setQuantidade(ler.nextInt());
        System.out.println("Valor total:"+obj.calcularValorTotal());
    }
}