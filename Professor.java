import java.text.DecimalFormat;
import java.util.Scanner;

public class Professor {
    Scanner scan = new Scanner(System.in);
    private String nomeProf;
    private double totalAlunos;
    private double alunosAprovados;
    private String materia;
    private double rendimento;

    public Professor(String nomeProf, double totalAlunos, double alunosAprovados) {
        this.nomeProf = nomeProf;
        this.totalAlunos = totalAlunos;
        this.alunosAprovados = alunosAprovados;
    }

    public String getNomeProf() {
        return this.nomeProf;
    }
    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;   
    }
    public double getTotalAlunos() {
        return this.totalAlunos;
    }
    public void setTotalAlunos(int totalAlunos) {
        this.totalAlunos = totalAlunos;   
    }
    public double getAlunosAprovados() {
        return this.alunosAprovados;
    }
    public void setAlunosAprovados(int alunosAprovados) {
        this.alunosAprovados = alunosAprovados;   
    }
    public double getRendimento() {
        return this.rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void Materia() {
        System.out.print("Qual matéria o professor "+nomeProf+" leciona? ");
        String materia= scan.next();
        this.materia=materia;
    }
    private void CalculoRendimento() {
        double rendimento= (alunosAprovados/totalAlunos)*100;
        this.rendimento= rendimento;
    }
    public void ExibeRendimento() {
        CalculoRendimento();
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("\nO professor "+nomeProf+" que leciona "+materia+" obteve um rendimento de "+formatador.format(rendimento)+"% de alunos aprovados!");
    }
}
