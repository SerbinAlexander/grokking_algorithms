package chapter_4.quicksort;

import java.util.ArrayList;

public class RecursiveSum {
    public int sum(ArrayList<Integer> arrayList, int index) {
        if (index >= 0) {
            return arrayList.get(index) + sum(arrayList, --index);
        }
        return 0;
    }
}
