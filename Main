import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeCursos gestor = new GestorDeCursos();

        int opcao;
        do {
            System.out.println("\n--- Sistema de Gerenciamento de Cursos ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Cadastrar Curso");
            System.out.println("4. Listar Cursos");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Professores"); // Nova opção
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha para evitar problemas de leitura

           
            switch (opcao) {
                case 1:
                    System.out.print("Nome do Aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("CPF do Aluno: ");
                    String cpfAluno = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    Aluno aluno = new Aluno(nomeAluno, cpfAluno, matricula);
                    gestor.cadastrarAluno(aluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("CPF do Professor: ");
                    String cpfProfessor = scanner.nextLine();
                    System.out.print("Especialidade: ");
                    String especialidade = scanner.nextLine();
                    Professor professor = new Professor(nomeProfessor, cpfProfessor, especialidade);
                    gestor.cadastrarProfessor(professor);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Nome do Curso: ");
                    String nomeCurso = scanner.nextLine();
                    Curso curso = new Curso(nomeCurso);
                    gestor.cadastrarCurso(curso);
                    System.out.println("Curso cadastrado com sucesso!");
                    break;

                case 4:
                    gestor.listarCursos();
                    break;

                case 5:
                    gestor.listarAlunos();
                    break;

                case 6:
                    gestor.listarProfessores();
                    break;

                case 7:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}
