package chapter_3.recursion;

public class CountDown {
    public void countdown(int i) {
        System.out.println(i);
        if (i <= 1) {
            return;
        }
        else {
            countdown(--i);
        }
    }
}
