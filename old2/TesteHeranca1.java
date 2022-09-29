package old2;
public class TesteHeranca1 {
  public static void main(String[] args) {
    //vejamos se alunos de graduação têm nome e idade
    //construtor que não recebe coisa alguma chama: construtor padrão 
    AlunoDeGraduacao aluno = new AlunoDeGraduacao();
    aluno.nome = "João";
    aluno.idade = 17;
    System.out.printf(
      "Nome: %s, idade: %d\n",
      aluno.nome,
      aluno.idade
    );
  }
}
