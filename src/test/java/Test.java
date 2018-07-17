import com.UnsafeSequence;

public class Test {
    public static void main(String[] args) {
        UnsafeSequence sequence = new UnsafeSequence();
        for (int i = 0; i < 100; i++) {

            Thread t1 = new Thread(() -> {
                System.out.println(sequence.getNext());
            });
            t1.start();
        }
    }
}
