package associacao;

public class Pessoa {
    private String Nome;
    private char Sexo;
    private int Idade;
    private Endereco end;


    public Pessoa(){
     this.end = new Endereco();
    }
    
    public Pessoa(String Nome, char Sexo, int Idade) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.end = new Endereco();
    }


    public Pessoa(String Nome, char Sexo, int Idade, Endereco end) {

        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.end = end;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    public Endereco getEnd() {
        return end;
    }
    public void setEnd(Endereco end) {
        this.end = end;
    } 

    public String Imprimir(){
        return "Nome: " + Nome + "\n" + "Idade: " + Idade + "\n" + "Sexo: " + Sexo + "\n" + "Rua: " + end.getLogradouro() + "\n" + "Numero: "+ end.getNumero() + "\n" + "Complemento: " + end.getComplemento() + "\n" + "Cep: " + end.getCep();
    }

    
    
}
