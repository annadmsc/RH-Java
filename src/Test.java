import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {

        String nome = "Anna";

        String cpf = "234567890456789";
        String telefone = "232345";

        LocalDateTime dataNascimento = null;

        LocalDateTime dataAgendamento = null;

        Pessoa pessoa = new Pessoa(nome, cpf, telefone, null, null, "MANHã");

        // Verifica se os valores das propriedades estão corretos
        if (!pessoa.getNome().equals(nome)) {
            System.out.println("ERRO: nome incorreto");
        }
        if (!pessoa.getCpf().equals(cpf)) {
            System.out.println("ERRO: CPF incorreto");
        }
        if (!pessoa.getTelefone().equals(telefone)) {
            System.out.println("ERRO: telefone incorreto");
        }

    
    }
}
