public class Retangulo{
    private double largura;
    private double altura;
    public void setAltura(double alturaP){
        if(alturaP > 0){
            altura = alturaP;
        }else{
           System.out.println("Digite um número positivo"); 
        }
    }
    public double getAltura(){
        return altura;
    }
    public void setLargura(double larguraP){
        if(larguraP > 0){
            largura = larguraP;
        }else{
           System.out.println("Digite um número positivo"); 
        }
    }
    public double getLargura(){
        return altura;
    }
    public double  calcularArea(){
        return getAltura() * getLargura();
    }
    public double calcularPerimetro(){
        return 2* (getAltura() + getLargura());
    }
}