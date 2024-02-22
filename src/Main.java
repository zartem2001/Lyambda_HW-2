public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener error = (i) -> i == 33;
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}