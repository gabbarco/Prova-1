public class Aluno {
    private String nome;
    private double notaprova1;
    private double notaprova2;
    private double media;

    public Aluno(String nome, double notaprova1, double notaprova2) {
        this.nome = nome;
        this.notaprova1 = notaprova1;
        this.notaprova2 = notaprova2;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;   
    }
    public double getNota1() {
        return this.notaprova1;
    }
    public void setNota1(double notaprova1) {
        this.notaprova1 = notaprova1;
    }
    public double getNota2() {
        return this.notaprova2;
    }
    public void setNota2(double notaprova2) {
        this.notaprova2 = notaprova2;
    }
    public double getMedia() {
        return this.media;
    }
    public void setMedia(double media) {
        this.media = media;
    }

    public void DefinirTurma(String nome) { //Alunos com nome de A-M pertencem à turma A, aqueles com nome de N-Z pertencem à B
        if ((nome.startsWith("A")) || (nome.startsWith("B")) || (nome.startsWith("C")) || (nome.startsWith("D")) || (nome.startsWith("E")) || (nome.startsWith("F")) || (nome.startsWith("G")) || (nome.startsWith("H")) || (nome.startsWith("I")) || (nome.startsWith("J")) || (nome.startsWith("K")) || (nome.startsWith("L")) || (nome.startsWith("M"))) {
            System.out.println("\nO aluno " +nome+ " pertence à turma A");
        } else {
            System.out.println("\nO aluno " +nome+ " pertence à turma B");
        }
    }
    private void CalcularMedia(double nota1, double nota2) {
        double media= (nota1+nota2)/2;
        this.media=media;
    }
    public void DefinirSituacao(double nota1, double nota2, String nome) {
        CalcularMedia(nota1, nota2);
        if (media<7) {
            System.out.println("O aluno "+nome+" foi reprovado");
        }
        if (media>=7) {
            System.out.println("O aluno "+nome+" foi aprovado (Média: "+media+")");
        }
    }
}
