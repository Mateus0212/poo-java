class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf); // Chama o construtor da classe Pessoa
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Aluno: " + getNome() + ", Matrícula: " + matricula);
    }
}
