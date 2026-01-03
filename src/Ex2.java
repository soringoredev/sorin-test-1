import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        //2.	Scrieti un program Java  care ia doua numere introduse
        // de la tastatura si afiseaza la ecran rezultatul
        // inmultirii acestor numere. (Scanner)

        // am creat obiect al clasei Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduceti Va rog frumos primul numar: ");
        int primulNumar = scan.nextInt();

        System.out.print("Introduceti Va rog frumos al doilea numar: ");
        int alDoileaNumar = scan.nextInt();

        int rezultat = primulNumar * alDoileaNumar;
        System.out.println("Rezultat: " + rezultat);


    }
}
