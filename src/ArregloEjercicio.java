import java.util.Arrays;

public class ArregloEjercicio
{
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i;

        for (i = 0; i < numeros.length / 2; i++)
        {

            int num = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = num;
        }

        System.out.println("Los numeros son: " + Arrays.toString(numeros));
    }
}
