package in.co.CollectionFrameworks;

public class PriorityEx extends Thread{
	String name;
	int id;
	public PriorityEx(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()+" : "+getId()+" : "+getPriority() );
		}
	}
	
}
