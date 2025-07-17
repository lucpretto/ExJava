public class Farmacia
{
    private String medicamento;
    private String marca;
    private int tipo;
    public void setMedicamento(String medicamentoP){
        medicamento = medicamentoP;
    }
    public String getMedicamento(){
        return medicamento;
    }
    public void setMarca(String marcaP){
        marca = marcaP;
    }
    public String getMarca(){
        return marca;
    }
    public void setTipo(int tipoP){
        tipo = tipoP;
    }
    public int getTipo(){
        return tipo;
    }
    public String exibirInformacoes(){
        return getMedicamento();
    }
    public int exibirTipoMedicamento(){
        return getTipo();
    }
}
