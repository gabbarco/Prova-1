import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int escolha;
        do {
          System.out.println("\n---- Menu ----\n1.Verificar situação de aluno\n2.Calcular número de alunos aprovados\n3.Rendimento do professor\n0.Sair");
          escolha= scan.nextInt();
          if (escolha==1) {
            System.out.print("Nome do aluno: ");  
            String nome= scan.next();
            System.out.print("Nota da primeira prova: ");  
            double nota1= scan.nextDouble();
            System.out.print("Nota da segunda prova: ");  
            double nota2= scan.nextDouble();
            Aluno aluno = new Aluno(nome, nota1, nota2);
            aluno.DefinirTurma(nome);
            aluno.DefinirSituacao(nota1, nota2, nome);
          }
          if (escolha==2) {
            System.out.println("Qual turma deseja analisar (A ou B)? ");
            String turma= scan.next();
            System.out.println("Qual o número de alunos da turma? ");
            int numAlunos= scan.nextInt();
            Disciplina disciplina = new Disciplina(numAlunos, turma);
            disciplina.DefineMedias();
            disciplina.ExibeNumAprovados();
          }
          if(escolha==3) {
            System.out.print("Nome do professor: ");  
            String nomeProf= scan.next();
            System.out.print("Total de aluno para os quais leciona: ");  
            int totalAlunos= scan.nextInt();
            System.out.print("Total de alunos aprovados: ");  
            int alunosAprovados= scan.nextInt();
            Professor professor = new Professor(nomeProf, totalAlunos, alunosAprovados);
            professor.Materia();
            professor.ExibeRendimento();
          }
       } while (escolha!=0);
       scan.close();
}
}