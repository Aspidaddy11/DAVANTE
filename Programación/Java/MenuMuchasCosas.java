import java.util.Scanner;

public class MenuMuchasCosas {
    public static void main(String[] args) {
        Scanner sc new Scanner(System.in);
        int menu;
        System.out.println("\nMenu con muchas cosas");
        System.out.println("1. Raíz cubica de un número");
        System.out.println("2. Logaritmo");
        System.out.println("3. Factorial");
        System.out.println("4. Número primo");

        switch (menu){
            case 1:
                int n1;
                System.out.println("Introduce un numero para conocer su raíz cúbica: ");
                n1 = sc.nextInt();

                System.out.println("El valor de " + n1 + "Es igual a: " + (Math.cbrt(n1)));
                break;
            
            case 2:
                int n;
                System.out.println("Introduce el valor del número al cual quieres saber su logaritmo:");
                n = sc.nextInt();
                

        }
    sc.close();

    }
    
}
