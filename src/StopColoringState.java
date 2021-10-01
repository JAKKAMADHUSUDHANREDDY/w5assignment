
public class StopColoringState  implements PencilState{

	Pencil pencil;
	
	public StopColoringState(Pencil pencil) {
		this.pencil = pencil;
	}

	public void state() {
		System.out.println("Please!! Stop Coloring");
	}

}