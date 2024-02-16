import java.util.ArrayList;

public class DailyCodingProblem3 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(8);
        numbers.add(1);

        System.out.println(numbers);

        for (int x = 1; x < 100; x++) {
            for (int y = 0; y < numbers.size(); y++) {
                if (numbers.get(y) == x) {
                    numbers2.add(x);
                }
            }
        }

        System.out.println(numbers2);


        for (int y = 0; y < numbers.size(); y++) {
            if (numbers2.get(y) != y + 1) {
                System.out.println("Pierwsza w kolejności brakująca liczba to: " + (y + 1));
                break;
            }
        }
    }
}
