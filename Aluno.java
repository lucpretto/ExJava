public class Aluno
{
    private String nome;
    private double nota1;
    private double nota2;
    public void setNome(String nomeP){
        nome = nomeP;
    }
    public String getNome(){
        return nome;
    }
    public void setNota1(double nota1P){
        nota1 = nota1P;
    }
    public double getNota1(){
        return nota1;
    }
    public void setNota2(double nota2P){
        nota2 = nota2P;
    }
    public double getNota2(){
        return nota2;
    }
    public double calcularMedia(){
        return (getNota1() + getNota2()) / 2;
    }
    public String verificarAprovacao(){
        if(calcularMedia() >= 7){
            return "Aluno Aprovado";
        }else{
            return "Aluno Reprovado";
        }
    }
}
