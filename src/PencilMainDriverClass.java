
public class PencilMainDriverClass {
	public static void main(String[] args) {
		
		Pencil p = new Pencil(new ColorState());
		p.state();
		
		Pencil p1 = new Pencil(new StopColoringState(p));
		p1.state();
		
		Pencil p2 = new Pencil(new WriteState(p));
		p2.state();
		
		Pencil p3 = new Pencil(new StopWritingState(p));
		p3.state();
	}
}
