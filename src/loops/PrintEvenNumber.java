package loops;
//print even numbers between 1 to 100
public class PrintEvenNumber {
    static void main() {
        for (int i = 1; i <=100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
