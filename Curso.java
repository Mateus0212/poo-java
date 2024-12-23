import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas do curso " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println("- " + d.getNome());
        }
    }
}
