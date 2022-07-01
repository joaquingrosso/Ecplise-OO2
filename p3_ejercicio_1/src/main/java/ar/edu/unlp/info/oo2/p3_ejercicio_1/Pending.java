package ar.edu.unlp.info.oo2.p3_ejercicio_1;


public class Pending extends State{

	@Override
	public void comienzo(ToDoItem item) {
		item.comenzar();
	}

	@Override
	public void pauso(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void termino(ToDoItem item) {
	}

	@Override
	public void agregarComentario(ToDoItem item, String comment) {
		item.agregarComentario(comment);
	}

}
