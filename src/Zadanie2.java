import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner z2 = new Scanner(System.in);
        ArrayList<Integer> allelements = new ArrayList<Integer>();
        int x;
        try {
            x = z2.nextInt();
            z2.nextLine();
            while (true) {
                String nline = z2.nextLine();
                if (Objects.equals(nline, "quit")) break;
                int tmp = Integer.parseInt(nline);
                allelements.add(tmp);
            }
        }
        catch (Exception e) {
            System.out.print("Ошибка: массив и число к удалению должны быть целыми");
            return;
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < allelements.size(); i++) {
            int elem = allelements.get(i);
            System.out.print(elem + " ");
        }
        System.out.print("\nМассив после обработки: ");
        for (int i = 0; i < allelements.size(); i++) {
            int el = allelements.get(i);
            if (el!= x)
                System.out.print(el + " ");
        }
        z2.close();
    }
}
