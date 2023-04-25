import java.time.LocalDate;
import java.time.LocalDateTime;

enum Periodo {
    MANHA, TARDE, NOITE
}

class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataAgendamento;
    private Periodo periodo;

    public Pessoa(String nome, String cpf, String telefone, LocalDate dataNascimento, LocalDateTime dataAgendamento, Periodo periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}