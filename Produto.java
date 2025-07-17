public class Produto{
    private String nome;
    private double preco;
    private int quantidade;
    public void setPreco(double precoP){
        preco=precoP;
    }
    public double getPreco(){
        return preco;
    }
    public void setNome(String nomeP){
        nome=nomeP;
    }
    public String getNome(){
        return nome;
    }
    public void setQuantidade(int quantidadeP){
        quantidade=quantidadeP;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double calcularValorTotal(){
        return getPreco() * getQuantidade();
    }
}