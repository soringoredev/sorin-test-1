import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        //5.	Scrieti un program Java in care sa scrieti o parola, iar ulterior la output va fi afisata parola.
        //a.	Exemplu:
        //b.	Input password:
        //c.	Password was: qwerty123123                 (Nu complicati lucrurile simple)

        Scanner scan = new Scanner(System.in);

        System.out.print("Input password: ");
        String password = scan.next();
        System.out.println("Password was: " + password);



    }
}
