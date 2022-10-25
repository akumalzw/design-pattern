package priv.akumalzw.design.chain;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 3, 5, 8, 10, 23, 46, 30};
        for (int request : requests) {
            h1.handleRequest(request);
        }

    }
}
