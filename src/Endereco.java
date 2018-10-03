public class Endereco {

    public String rua;
    public String bairro;
    public String cep;
    public String complemento;
    
    public String getCep() {
        //  88.352-490
        String[] arrayCep = this.cep.split("");
        String cepFormatado = arrayCep[0]+arrayCep[1]+"."+arrayCep[2]+
                arrayCep[3]+arrayCep[4]+"-"+arrayCep[5]+arrayCep[6]+arrayCep[7];
        return cepFormatado;
    }
    
}