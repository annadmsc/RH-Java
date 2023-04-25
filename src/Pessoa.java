import javax.lang.model.type.NullType;


class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private NullType dataNascimento;
    private NullType dataAgendamento;


    public Pessoa(String nome, String cpf, String telefone, NullType dataNascimento, NullType dataAgendamento, String periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public NullType getDataNascimento() {
        return dataNascimento;
    }

    public NullType getDataAgendamento() {
        return dataAgendamento;
    }

}