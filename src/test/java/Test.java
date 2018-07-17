import com.UnsafeSequence;

public class Test {
    public static void main(String[] args) {
        UnsafeSequence sequence = new UnsafeSequence();
        for (int i = 0; i < 10; i++) {

            Thread t1 = new Thread(() -> {

                System.out.print(sequence.getNext() + " ");
            });
            t1.start();
            //System.out.println(t1.getName());
        }
    }
}
