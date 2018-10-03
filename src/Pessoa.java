public class Pessoa {
    public String nome;
    public String dataNacimenmto;
    public String rg;
    public String cpf;
    public String nomeDaMae;
    public String nomeDoPai;
    public String telefones;
    private Endereco endPessoa;
    
    public void setEndPessoa(Endereco e) {
        this.endPessoa = e;
    }
    
    public String getEnderecoCompleto() {
        String endereco = this.endPessoa.rua+" / "+this.endPessoa.bairro;
        return endereco;
    }
    
    public int getIdade() {
        Utilidades.obterData(null);
        return 0;
    }
    
    public String getPrimeiroNome() {
        String [] arrayNome = this.nome.split(" ");
        return arrayNome[0];
    }
    
    public String[] getTelefonesSeparados() {
        String[] arrayTelefones = this.telefones.split(",");
        return arrayTelefones;
    }
}