import java.util.Scanner;
public class PrincipalR{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Retangulo obj = new Retangulo();
        System.out.println("Entre com o valor da Altura:");
        obj.setAltura(ler.nextDouble());
        System.out.println("Entre com o valor da Largura:");
        obj.setLargura(ler.nextDouble());
        System.out.println("A sua Área:"+obj.calcularArea());
        System.out.println("Seu Perímetro:"+obj.calcularPerimetro());
    }
}
