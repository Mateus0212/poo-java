import java.util.ArrayList;
import java.util.List;

class Turma {
    private String codigo;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos da turma " + codigo + ":");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome());
        }
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
