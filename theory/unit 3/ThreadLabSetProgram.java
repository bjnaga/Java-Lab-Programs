class MessageThread extends Thread {
    private String message;
    private int interval;
    public MessageThread(String message, int seconds) {
        this.message = message;
        this.interval = seconds * 1000; 
    }
    public void run() {
        try {
            while (true) {
                Thread.sleep(interval);
                System.out.println(message); 
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
public class ThreadLabSet {
	public static void main(String[] args) {		
		        new MessageThread("GoodMorning", 1).start();
		        new MessageThread("Hello", 2).start();
		        new MessageThread("Welcome", 3).start();
	}
}
