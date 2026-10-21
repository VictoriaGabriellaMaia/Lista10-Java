package pessoa;

public class PessoaEstrangeira extends Pessoa {
    private String passaporte;

    public PessoaEstrangeira(String nome, String passaporte) {
        super(nome);
        this.passaporte = passaporte;
    }

    public String getPassaporte() {
        return passaporte;
    }

    @Override
    public String getIdentificacao() {
        return super.getIdentificacao() + " Passaporte: " + this.passaporte;
    }
}
