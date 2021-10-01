
public class StopWritingState implements PencilState{

	Pencil pencil;
	
	public StopWritingState(Pencil pencil) {
		this.pencil = pencil;
	}

	public void state() {
		System.out.println("Please!! Stop Writing");
	}

}
