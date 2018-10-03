
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Pessoa[] arrayDePessoas = new Pessoa[3];
        Scanner entrada = new Scanner(System.in);
        
        //Preenche o array
        for (int i = 0; i < arrayDePessoas.length; i++) {
            
            System.out.println("Informe os dados da"
                    + " pessoa posição "+i+":");
            
            //Dados da pessoa
            Pessoa p = new Pessoa();
            System.out.println("Informe seu nome:");
            p.nome = entrada.nextLine();
            
            System.out.println("Informe sua data de nascimento:");
            p.dataNacimenmto = entrada.nextLine();
            
            System.out.println("Informe seus telefones de contato:");
            p.telefones = entrada.nextLine();
            
            //Dados do endereço
            Endereco e = new Endereco();
            
            System.out.println("Informe o nome da rua:");
            e.rua = entrada.nextLine();
            
            System.out.println("Informe o bairro:");
            e.bairro = entrada.nextLine();
            
            System.out.println("Infrome o CEP (somente números):");
            e.cep = entrada.nextLine();
            
            System.out.println("Informe o complemento:");
            e.complemento = entrada.nextLine();
            p.setEndPessoa(e);
            
            /*Inseri o objeto pessoa 
            na respectiva posição*/
            arrayDePessoas[i] = p;
        }
        
        //Imprime as informações
        for (int i = 0; i < arrayDePessoas.length; i++) {
            Pessoa p = arrayDePessoas[i];
            System.out.println(p.nome);
            System.out.println(p.getEnderecoCompleto());
            System.out.println("---------------------");
        }

    }

}