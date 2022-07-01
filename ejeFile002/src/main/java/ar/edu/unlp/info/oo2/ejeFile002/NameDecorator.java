package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public class NameDecorator extends FileDecorator{



	
	
	public NameDecorator(FileManager fileSize) {
		super(fileSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "name";
	}

	public String prettyPrint() {
		return this.toString() + super.prettyPrint();
	}

	
	
}