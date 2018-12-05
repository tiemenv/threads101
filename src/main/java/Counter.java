public class Counter implements Runnable{

    private int threadId;

    public int getThreadId() {
        return threadId;
    }

    public Counter(int id){
        this.threadId = id;
    }

    @Override
    public void run() {
        for(int i = 0; i<this.getThreadId(); i++){
            System.out.println("Thread " + this.getThreadId() + ": " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
