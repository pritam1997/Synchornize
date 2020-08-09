package synchronize;

public class ThreadSend extends Thread{
	
	private String msg;
	Sender sender; 
	
	ThreadSend(String msg , Sender sender)
	{
		this.msg = msg;
		this.sender = sender;
	}
	
	public void run() {
		
		synchronized (sender) {
			sender.send(msg);
		}
	}
	
	
	
}
