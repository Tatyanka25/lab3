import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Zadanie1 {
   public static void main(String[] args) {
        Scanner z1 = new Scanner(System.in);
        ArrayList<Double> allelements = new ArrayList<Double>();
        while (true) {
            String nline = z1.nextLine();
            if (Objects.equals(nline, "quit")) break;
            double tmp = Double.parseDouble(nline);
            allelements.add(tmp);
        }
        System.out.print("Исходный массив: ");
       for (int i = 0; i < allelements.size(); i++) {
           double elem = allelements.get(i);
           System.out.print(elem + " ");
       }
       System.out.print("\nМассив после обработки: ");
        double suma = 0.0;
        for (int i = 0; i < allelements.size(); i++) {
            suma += allelements.get(i);
            double resultat = suma / (double) (i + 1);
            System.out.print(resultat + " ");
        }
        z1.close();
    }
}
