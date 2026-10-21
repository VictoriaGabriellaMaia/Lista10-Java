package principal;
import pessoa.*;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa;
        pessoa = new PessoaFisica("Ana", "123.456.789-00");
        System.out.println(pessoa.getIdentificacao());

        pessoa = new PessoaJuridica("Escola", "03.278.251/0001-32");
        System.out.println(pessoa.getIdentificacao());

        pessoa = new PessoaEstrangeira("Jimmy", "FE407812");
        System.out.println(pessoa.getIdentificacao());
    }
}
