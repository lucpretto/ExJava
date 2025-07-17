public class Elevador{
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoas;
    public void setAndarAtual(int andarAtualP){
        andarAtual = andarAtualP; 
    }
    public int getAndarAtual(){
        return andarAtual;
    }
    public void setTotalAndares(int totalAndaresP){
        totalAndares = totalAndaresP;
    }
    public int getTotalAndares(){
        return totalAndares;
    }
    public void setCapacidade(int capacidadeP){
        capacidade = capacidadeP;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setQuantidadePessoas(int quantidadePessoasP){
        quantidadePessoas = quantidadePessoasP;
    }
    public int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    public String entrar(){
        if(quantidadePessoas < capacidade){
            quantidadePessoas++;
            return "Quantia de pessoas que entraram"+quantidadePessoas;
        }else{
            return "Elevador cheio";
        }   
    }
    public String sair(){
        if(quantidadePessoas > 0){
            quantidadePessoas--;
            return "Quantia de pessoas que sobrou"+quantidadePessoas;
        }else{
            return "O elevador está vazio";
        }
    }
    public String subir(){
        if(andarAtual < totalAndares){
            andarAtual++;
            return "O elevador está no andar:"+totalAndares;
        }else{
            return "Já esta no último andar";
        }
    }
    public String descer(){
        if(andarAtual > 0){
            andarAtual--;
            return "O elevador está no andar:"+totalAndares;
        }else{
            return "Já esta no térreo";
        }
    }
}

/* 
Exercício 5: Classe Elevador 
Crie uma classe Elevador com os atributos privados: andarAtual (int), totalAndares 
(int), capacidade (int) e quantidadePessoas (int). 
Implemente métodos para: 
• Métodos get e set para cada atributo. 
• entrar() (só se não ultrapassar a capacidade); 
• sair() (só se tiver pessoas dentro); 
• subir() e descer() (respeitando limites de andares). 
Desafio: Simule um cenário com várias ações no main. 
*/