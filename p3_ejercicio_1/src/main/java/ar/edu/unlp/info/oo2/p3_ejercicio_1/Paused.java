package ar.edu.unlp.info.oo2.p3_ejercicio_1;


public class Paused extends State {

	@Override
	public void comienzo(ToDoItem item) {
	}

	@Override
	public void pauso(ToDoItem item) {
		item.reanudar();
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
