import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     System.out.println("Notas de Alumno");

     Scanner sc = new Scanner(System.in);

     int notaAlumno=sc.nextInt();

     sc.close();

     switch (notaAlumno) {case 0,1,2,3,4:
         System.out.println("Suspenso");
         break;
         case 5:
             System.out.println("Bien");
         break;
         case 7,8:
             System.out.println("Notable");
         break;
         case 9,10:System.out.println("Sobresaliente");
         break;
         default:
             System.out.println("Valor no valido");
     }
    }
}