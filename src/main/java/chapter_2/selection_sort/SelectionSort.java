package chapter_2.selection_sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static List<Integer> selectionSort(List<Integer> integerList) {
        List<Integer> resIntegerList = new ArrayList<>();
        int sizeList = integerList.size();
        for (int i = 0; i < sizeList; i++) {
            int smallest = findSmallest(integerList);
            resIntegerList.add(integerList.get(smallest));

            integerList.remove(smallest);
        }
        return resIntegerList;
    }

    public static int findSmallest(List<Integer> integerList) {
        int smallItem = integerList.get(0);
        int smallItemIndex = 0;
        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i) < smallItem) {
                smallItem = integerList.get(i);
                smallItemIndex = i;
            }
        }
        return smallItemIndex;
    }
}
