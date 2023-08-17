import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        try{
            conta(n1,n2);
        } catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void conta(int n1, int n2) throws ParametrosInvalidosException{
        if (n1 > n2){
            throw new ParametrosInvalidosException();
        }

        for(int i = 1; i <= n2-n1; i++){
            System.out.println("Imprimindo número "+i);
        }

    }
}
