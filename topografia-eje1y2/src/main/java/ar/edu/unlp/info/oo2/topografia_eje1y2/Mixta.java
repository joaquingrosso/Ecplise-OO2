package ar.edu.unlp.info.oo2.topografia_eje1y2;

import java.util.ArrayList;


public class Mixta extends Topografia{

	private ArrayList<Topografia> topografia = new ArrayList<Topografia>();
	
	
	public ArrayList<Topografia> getTopografia() {
		return topografia;
	}

	public void setTopografia(ArrayList<Topografia> topografia) {
		this.topografia = topografia;
	}
	
	public void agregarTopografia(Topografia unaTopog) {
		topografia.add(unaTopog);
	}
	
	
	@Override
	public double porcionDeAgua() {
		double porcion=0;
		for (int i = 0; i < topografia.size(); i++) {
			porcion += topografia.get(i).porcionDeAgua();
		}
		return porcion/topografia.size();
	}


}
