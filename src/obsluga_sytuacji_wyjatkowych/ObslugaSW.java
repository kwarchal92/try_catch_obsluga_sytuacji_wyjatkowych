package obsluga_sytuacji_wyjatkowych;

import java.io.*;
public class ObslugaSW {

    public static void main(String [] args)
        throws IOException
    {

        double a, b, wynik;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {

            System.out.println("Podaj dlugosc boku a: ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj dlugosc boku b: ");
            b = Double.parseDouble(br.readLine());

            wynik = 2 * a + 2 * b;
            System.out.printf("Obwod prostokata wynosi: %2.2f\n", wynik);

            wynik = a * b;
            System.out.printf("Pole prostokata wynosi: %2.2f", wynik);
        }
        catch (NumberFormatException exc)
        {
            System.out.println("Nie wczytano liczby, program nie moze wykonac sie poprawnie");
        }


    }
}
