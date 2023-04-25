import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Digite a data de nascimento (no formato dd/MM/yyyy):");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Digite a data de agendamento (no formato dd/MM/yyyy HH:mm):");
        LocalDateTime dataAgendamento = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println("Digite o período (MANHA, TARDE ou NOITE):");
        Periodo periodo = Periodo.valueOf(scanner.nextLine().toUpperCase());

        Pessoa pessoa = new Pessoa(nome, cpf, telefone, null, null, periodo);

        System.out.println("Pessoa registrada:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Período: " + pessoa.getPeriodo());
    }
}