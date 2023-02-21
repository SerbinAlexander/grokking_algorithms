import java.util.List;

public class BinarySearch {
    public static Integer binarySearch(List<Integer> integerList, Integer itemSearching) {
        Integer min = 0;
        Integer max = integerList.size() - 1;

        while (min <= max) {
            Integer mid = (min + max) / 2;
            Integer guess = integerList.get(mid);

            if (guess.equals(itemSearching)) {
                return guess;
            }
            if (guess > itemSearching) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return null;
    }
}
