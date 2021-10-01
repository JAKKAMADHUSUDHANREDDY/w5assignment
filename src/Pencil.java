
public class Pencil {

	PencilState colorstate;
	PencilState stopcolorstate;
	PencilState writestate;
	PencilState stopwritestate;

	PencilState ps;

	public Pencil(PencilState pss)
	{
		colorstate = new ColorState();
		stopcolorstate = new StopColoringState(this);
		writestate = new WriteState(this);
		stopwritestate = new StopWritingState(this);
		ps = pss;
		
	}

	public PencilState getPs() {
		return ps;
	}

	public void setPs(PencilState ps) {
		this.ps = ps;
	}

	public PencilState getColorstate() {
		return colorstate;
	}

	public PencilState getStopcolorstate() {
		return stopcolorstate;
	}

	public PencilState getWritestate() {
		return writestate;
	}

	public PencilState getStopwritestate() {
		return stopwritestate;
	}

	public void state() {
		ps.state();
		
	}
	

}
