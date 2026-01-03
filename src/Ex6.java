public class Ex6 {
    public static void main(String[] args) {

        // 6.	Scrieti toate numerele pare de la 1 la 100;


//        // prima varianta
//        for (int i = 0; i < 101; i+= 2) {
//            System.out.println(i);
//        }

        // var 2
        for (int i = 0; i < 101; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
