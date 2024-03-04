
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Queue q = new Queue(10);

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println("Удаленный элемент: " + q.pop());

        System.out.println("Первый элемент: " + q.front());

        q.push(4);
        q.push(5)
        q.push(6);

        System.out.println("размер: " + q.size());

        q.push(7);
        q.push(8);
        q.push(9);

        System.out.println("размер: " + q.size());

        q.clear();

        System.out.println("размер: " + q.size());

        System.out.println(q.pop());
    }
}
