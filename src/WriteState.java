
public class WriteState implements PencilState{

	Pencil pencil;
	
	public WriteState(Pencil pencil) {
		this.pencil = pencil;
	}

	public void state() {
		System.out.println("Please!! Write something");
	}

}
