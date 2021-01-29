import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
    String nome, dataNascimento, telefone, cpf, rg, endereco, email, sexo, apoio;
    int idade;
    double salario, imposto;
    boolean ativo;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome: "); 
    nome = sc.nextLine();
    System.out.println("Digite a data de seu nascimento com as barras: "); 
    dataNascimento = sc.nextLine();
    System.out.println("Digite sua idade: "); 
    idade = sc.nextInt();
    sc.nextLine();
    System.out.println("Digite seu número de telefone: "); 
    telefone = sc.nextLine();
    System.out.println("Digite o número do seu CPF, incluindo os pontos e hífen: "); 
    cpf = sc.nextLine();
    System.out.println("Digite o número do seu RG, incluindo os pontos e hífen: "); 
    rg = sc.nextLine();
    System.out.println("Digite seu endereço: "); 
    endereco = sc.nextLine();
    System.out.println("Digite seu E-mail: "); 
    email = sc.nextLine();
    System.out.println("Digite seu sexo: "); 
    sexo = sc.nextLine();
    System.out.println("Digite seu salário: "); 
    salario = sc.nextDouble();
    sc.nextLine();
    System.out.println("Você tem Emprego ativo? (SIM/NÃO)"); 
    apoio = sc.nextLine();
    ativo = apoio.equals("SIM");
    imposto = salario*0.15;
    System.out.println("Olá " + nome +" , bem vindo ao Sistema de Cálculo de Imposto de Renda!" + "Nascido em "+ dataNascimento + " sua idade é "+ idade +" , portador do CPF: "+ cpf +" e portador do RG: "+ rg +" e você tem: ");
    if (!ativo)
        System.out.println("Emprego inativo.");
    else
        System.out.println("Emprego ativo. ");
    System.out.println("Seu salário é " + salario + " e o imposto é "+ imposto);
  } 
}