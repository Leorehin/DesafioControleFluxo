import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException{

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro:");

        int parametro1 = scan.nextInt();
        
        System.out.println("Digite o segundo parametro:");

        int parametro2 = scan.nextInt();
        
        Contar(parametro1, parametro2);
        
        scan.close();
    }

    public static void Contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;
        for (int i=0; i<= contagem; i++){
            System.out.println("Imprimindo numero: "+ parametro1++);
        }

}

}

