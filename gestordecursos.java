import java.util.ArrayList;
import java.util.List;

class GestorDeCursos {
    private List<Curso> cursos;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public GestorDeCursos() {
        cursos = new ArrayList<>();
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    public void cadastrarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarCursos() {
        System.out.println("Cursos disponíveis:");
        for (Curso c : cursos) {
            System.out.println("- " + c.getNome());
        }

    }

    public void listarAlunos() {
        System.out.println("\n--- Alunos cadastrados ---");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                aluno.mostrarDados();
            }
        }
    }

    public void listarProfessores() {
        System.out.println("\n--- Professores cadastrados ---");
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (Professor professor : professores) {
                professor.mostrarDados();
            }
        }
    }
}
