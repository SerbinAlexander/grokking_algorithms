package chapter_4.quicksort;

import java.util.ArrayList;

public class RecursiveMax {
    public int recursiveMax(ArrayList<Integer> arrayList, int index, int max) {
        if (index > 0) {
            if (arrayList.get(index) > max) {
                return recursiveMax(arrayList, index - 1, arrayList.get(index));
            } else {
                return recursiveMax(arrayList, index - 1, max);
            }
        }
        if (index == 0) {
            return arrayList.get(index) > max ? arrayList.get(index) : max;
        }
        return 0;
    }
}
