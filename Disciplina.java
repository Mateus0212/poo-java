class Disciplina {
    private String nome;
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void exibirDetalhes() {
        System.out.println("Disciplina: " + nome + ", Professor: " + professor.getNome());
    }
}