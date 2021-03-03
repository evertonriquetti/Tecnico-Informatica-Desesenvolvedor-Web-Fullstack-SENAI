/* 
   Data: 03/03/2021
   Disciplina: UC4 - Lógica de Programação
   Curso: Técnico em Informática para Internet (Desenvolvedor Web Fullstack)
   Autor: Everton dos Santos Riquetti
*/
import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
    //Declaração da Matriz e variaveis
    String[][] funcionario;
    funcionario = new String[5][5];
    int i, j;
    Scanner sc = new Scanner(System.in);
    //Informação ao usuário
    System.out.println("Informe os dados dos funcionários na seguinte ordem: ");
    System.out.println("Nome");
    System.out.println("Função");
    System.out.println("Idade");
    System.out.println("Sexo");
    System.out.println("Salário");
    //Laço para armazenar dados na Matriz
    for (i=0; i<funcionario.length; i++){
      System.out.println("Dados funcionário "+(i+1));
      for (j=0; j<funcionario[i].length;j++){
        funcionario[i][j]=sc.nextLine();
      }
    }
    //Mostrar os dados armazenados na matriz
    System.out.println("Término da entrada de dados");
    System.out.println("****************************");
    System.out.println("Leitura da Matriz e apresentação dos dados");
    for (i=0; i<funcionario.length; i++){
      for (j=0; j<funcionario[i].length; j++){
        System.out.println(funcionario[i][j]+" ");
      }
    }
    System.out.println("");
  } 
}