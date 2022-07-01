package ar.edu.unlp.info.oo2.p3_ejercicio_1;


public class InProgress extends State {

	@Override
	public void comienzo(ToDoItem item) {
	}

	@Override
	public void pauso(ToDoItem item) {
		item.pausar();
	}

	@Override
	public void termino(ToDoItem item) {
		item.terminar();
	}

	@Override
	public void agregarComentario(ToDoItem item, String comment) {
		item.agregarComentario(comment);
	}

}
