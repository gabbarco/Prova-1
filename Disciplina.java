import java.util.Scanner;

public class Disciplina {
    Scanner scan= new Scanner(System.in);
    private int numAlunos;
    private double[] medias = new double[1000];
    private int numAprovados;
    private String turma;

    public Disciplina(int numAlunos, String turma) {
        this.numAlunos= numAlunos;
        this.turma= turma;
    }

    public int getNumAlunos() {
        return this.numAlunos;
    }
    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;   
    }
    public double[] getMedias() {
        return this.medias;
    }
    public void setMedias(double[] medias) {
        this.medias = medias;
    }
    public int getNumAprovados() {
        return this.numAprovados;
    }
    public void setNumAprovados(int numAprovados) {
        this.numAprovados = numAprovados;
    }
    public String getTurma() {
        return this.turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void DefineMedias() {
        for (int i=0; i<numAlunos; i++) {
            System.out.print("Nota aluno "+(i+1)+": ");
            medias[i]=scan.nextDouble();
        }
    }
    private void CalculaAprovados(double[] medias) {
        for (int i=0; i<numAlunos; i++) {
            if (medias[i]>=7) {
              numAprovados=numAprovados+1;
            }
        }
    }
    public void ExibeNumAprovados() {
        CalculaAprovados(medias);
        System.out.println("\nA turma "+turma+" teve um total de "+numAprovados+" alunos aprovados!");
    }
}
