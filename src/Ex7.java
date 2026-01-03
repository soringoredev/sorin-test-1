import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        //7.	Scrieti un program ce ii permite utilizatorului sa introduca ceva de la tastatura.
        // Utilizatorul va scrie un numar, iar programul ii va spune daca numarul introdus este par sau impar.

        Scanner scan = new Scanner(System.in);

        System.out.print("Introdu varsta: ");
        int varstaUtilizator = scan.nextInt();

        if (varstaUtilizator % 2 == 0) {
            System.out.println("Numar par");
        } else {
            System.out.println("Numar impar");
        }

    }
}
