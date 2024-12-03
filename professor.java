class Professor extends Pessoa implements Avaliacoes {
    private String especialidade;

    public Professor(String nome, String cpf, String especialidade) {
        super(nome, cpf);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Professor: " + getNome() + ", Especialidade: " + especialidade);
    }

    @Override
    public void avaliarAluno(Aluno aluno, String feedback) {
        System.out.println("Professor " + getNome() + " avaliou o aluno " + aluno.getNome() + ": " + feedback);
    }
}
