import java.util.Scanner;//importe a biblioteca para escanear a entrada de informacoes 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//configurando a entrada de um valor
        System.out.println("Digite o nome do aluno:");//instrucao solicitando ao usuario a informacao desejada
        String nome = sc.nextLine();//recebendo valor nome utilizando o scanner criado e incluindo na variavel nome
        System.out.println("Informe a idade do aluno:");//instrucao solicitando ao usuario a informacao desejada
        int idade = sc.nextInt();//recebendo valor idade utilizando o scanner criado e incluindo na variavel idade

        System.out.println("aluno: " + nome + "\nidade: " + idade);//informando o valor recebido
        System.out.println("vamos contar até "+idade);//instrucao informa o inicio da contagem
        for (int i = 1; i <= idade; i++) {//instrucao ao programa com parametros para contagem
            System.out.println(i);//imprime a contagem na tela do usuario
        }
    }
}
