package ru.politech;

public class Main {

    public static void main(String[] args) {
        int tN = Integer.parseInt(args[0]);
        int sN = Integer.parseInt(args[1]);

        Writer [] threads = new Writer[tN];

        for (int i = 0; i < tN; i++) {
            threads[i] = new Writer(
                    i == 0 ? null : threads[i-1],
                    sN,
                    i
            );
        }

        threads[0].setWait(threads[tN-1]);
        threads[tN-1].setLast(true);

        for (int i = tN; i > 0; i--) {
            new Thread(threads[i-1]).start();
        }
    }
}
