import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo em MB: ");
        double t = sc.nextDouble();
        System.out.print("Digite a velocidade do link da internet em Mbps: ");
        double v = sc.nextDouble();
        double tt = t / (v / 8);
        double m = tt / 60;

        System.out.printf("O tempo aproximado do download é de %.2f minutos", m);

        sc.close();

    }

}
