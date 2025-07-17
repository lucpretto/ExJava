import java.util.Scanner;
public class PrincipalA{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Aluno obj = new Aluno();
        System.out.println("Qual o nome do aluno:");
        obj.setNome(ler.nextLine());
        System.out.println("Qual a primeira nota:");
        obj.setNota1(ler.nextDouble());
        System.out.println("Qual a segunda nota:");
        obj.setNota2(ler.nextDouble());
        System.out.println("A situação final do aluno(a) foi:"+obj.verificarAprovacao());
    }
}
