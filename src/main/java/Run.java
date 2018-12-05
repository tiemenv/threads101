public class Run {
    public static void main(String[] args) {
        for(int i = 0; i<Runtime.getRuntime().availableProcessors(); i++){
            Counter counter = new Counter(i);
            new Thread(counter, "Thread " + i).start();
        }
    }
}
