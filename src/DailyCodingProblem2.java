import java.util.ArrayList;

public class DailyCodingProblem2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> secondNumbers = new ArrayList<>();


        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int x = 0; !(x >= numbers.size()); x++) {
            secondNumbers.add(numbers.get(0) * numbers.get(1) * numbers.get(2) * numbers.get(3) * numbers.get(4)/numbers.get(x));
            System.out.println(secondNumbers.get(x));
        }
    }
}
