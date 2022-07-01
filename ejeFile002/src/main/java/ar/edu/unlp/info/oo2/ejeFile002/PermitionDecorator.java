package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public class PermitionDecorator extends FileDecorator{



	
	
	public PermitionDecorator(FileManager fileSize) {
		super(fileSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "permition";
	}

	public String prettyPrint() {
		return this.toString() + super.prettyPrint();
	}

	
	
}