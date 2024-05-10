import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        System.out.println("Informe a idade do aluno:");
        int idade = sc.nextInt();

        System.out.println("aluno: " + nome + "\nidade: " + idade);
        System.out.println("vamos contar até "+idade);
        for (int i = 1; i <= idade; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(i);
        }
    }
}