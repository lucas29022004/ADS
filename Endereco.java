package associacao;

public class Endereco {

    private String Complemento;
    private String Logradouro;
    private String Cep;
    private int Numero;


    public String getComplemento() {
        return Complemento;
    }
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
    public String getLogradouro() {
        return Logradouro;
    }
    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }
    public String getCep() {
        return Cep;
    }
    public void setCep(String cep) {
        Cep = cep;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }

    public String Imprimir(){
        return Logradouro+ ", "+ Numero + "," + Complemento + ", " + Cep;  
    }
    
}
