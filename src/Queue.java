

public class Queue {
    private int right;
    private int left;
    private int size;
    private int[] arr;

    Queue(int SIZE) {
        arr = new int[SIZE];
        right = 0;
        left = 0;
        size = 0;
    }

    int front() {
        if (is_empty()) {
            throw new IllegalArgumentException("ошибка");
        } else {
            return arr[left];
        }
    }

    int pop() {
        if (is_empty()) {
            throw new IllegalArgumentException("ошибка");
        } else {
            size--;
            return arr[left++];
        }
    }
    void push(int x) {
        if (size == arr.length + 1) {
            throw new IllegalArgumentException("ошибка");
        }

        arr[right] = x;
        right = (right + 1) % arr.length;
        size++;

    }


    int size() {
        return (size);
    }

    void clear() {
        left = right = 0;
        size = 0;
    }

    boolean is_empty() {
        if (left == right) {
            return true;
        } else {
            return false;
        }
    }
}