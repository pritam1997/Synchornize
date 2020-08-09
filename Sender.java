package synchronize;

public class Sender {
	
	void send(String msg) {
		
		System.out.println("Sending.... "+msg);
		
		try {
			Thread.sleep(0);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(msg + "sent ");
		
		
	}
	
}
