import java.util.Scanner;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int calif [] = new int[6];
        int suma = 0;
        float promedio;

        System.out.println("CALIFICACIONES DE PRIMER SEMESTRE\n");
        System.out.println("Calificación de Cálculo Diferencial: ");
        calif[0]= sc.nextInt();

        System.out.println("Calificación de Introducción a la Programación: ");
        calif[1]= sc.nextInt();

        System.out.println("Calificación de Fundamentos de Inestigación: ");
        calif[2]= sc.nextInt();

        System.out.println("Calificación de Matemáticas Discretas: ");
        calif[3]= sc.nextInt();

        System.out.println("Calificación de Ética: ");
        calif[4]= sc.nextInt();

        System.out.println("Calificación de Taller de Administración: ");
        calif[05]= sc.nextInt();

        for (int i = 0; i < calif.length; i++)
        {
            suma +=calif[i];
        }

        promedio = (suma/calif.length);
        System.out.println("El promedio de tus Calificaciones es: " + promedio);



    }



}
