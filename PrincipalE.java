import java.util.Scanner;
public class PrincipalE{
    public static void main(String args[]){
        int op;
        Scanner ler = new Scanner(System.in);
        Elevador obj = new Elevador();

        System.out.println("Qual a capacidade máxima do elevador");
        obj.setCapacidade(ler.nextInt());
        System.out.println("Qual o último andar");
        obj.setTotalAndares(ler.nextInt());

        do{
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Entrar pessoa");
            System.out.println("2 - Sair pessoa");
            System.out.println("3 - Subir");
            System.out.println("4 - Descer");
            System.out.println("0 - Encerrar");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println(obj.entrar());
                    break;
                case 2:{
                    System.out.println(obj.sair());
                    break;
                }
                case 3:{
                    System.out.println(obj.subir());
                    break;
                }
                case 4:{
                    System.out.println(obj.descer());
                    break;
                }
                case 0:{
                    System.out.println("Sistema encerrado");
                    break;
                }
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(op != 0);
    }
}
