import java.util.Scanner;
public class PrincipalF{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Farmacia obj = new Farmacia();
        System.out.println("O nome do medicamento");
        obj.setMedicamento(ler.nextLine());
        System.out.println("A marca do medicamento");
        obj.setMarca(ler.nextLine());
        System.out.println("Indique 0 para não controlado e 1 para controlado");
        obj.setTipo(ler.nextInt());
        System.out.println("Todos os medicamentos cadastrados:"+obj.exibirInformacoes());
        System.out.println("Todos os medicamentos controlados:"+obj.exibirTipoMedicamento());
    }
}