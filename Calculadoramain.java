import java.util.Scanner;

public class Calculadoramain {
    public static void main(String[] args) {
        System.out.println("Bem vindo a Calculadora ");
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        double n1,n2;

        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Divir");
        System.out.println("4- Multiplicar");
        System.out.println("Selecione uma operação Matématica :");
        int x = sc.nextInt();


        switch (x){

            case 1 :

                System.out.println("Digite o numero 1 :");
                n1 = sc.nextDouble();
                System.out.println("Digite o numero 2 :");
                n2 = sc.nextDouble();
                System.out.println(c.somar(n1,n2));
                break;

            case 2 :

                System.out.println("Digite o numero 1 :");
                n1 = sc.nextDouble();
                System.out.println("Digite o numero 2 :");
                n2 = sc.nextDouble();
                System.out.println(c.subtrair(n1,n2));
                break;
            case 3 :

                System.out.println("Digite o numero 1 :");
                n1 = sc.nextDouble();
                System.out.println("Digite o numero 2 :");
                n2 = sc.nextDouble();
                System.out.println(c.dividir(n1,n2));
                break;
            case 4 :

                System.out.println("Digite o numero 1 :");
                n1 = sc.nextDouble();
                System.out.println("Digite o numero 2 :");
                n2 = sc.nextDouble();
                System.out.println(c.multiplicar(n1,n2));
                break;

        }


    }
}
