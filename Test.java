package synchronize;

public class Test {
	
	public static void main(String[] args) {
		
		Sender s = new Sender();
		
		ThreadSend ts = new ThreadSend("Hi", s);
		ThreadSend ts2 = new ThreadSend("Bye", s);
		
		ts.start();
		ts2.start();
		
		
		
	}
	
}
