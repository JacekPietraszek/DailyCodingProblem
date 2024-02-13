import java.util.ArrayList;

public class DailyCodingProblem1 {
    public static void main(String[] args) {

        int k = 17;
        int y = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(7);
        numbers.add(2);
        numbers.add(7);

        for (int x = 1; x <= 3; x++) {
            if (k == numbers.get(y) + numbers.get(x)) {
                System.out.println(true);
                break;
            }
        }
    }
}