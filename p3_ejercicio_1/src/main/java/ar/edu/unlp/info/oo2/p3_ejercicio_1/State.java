package ar.edu.unlp.info.oo2.p3_ejercicio_1;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {

	public abstract void comienzo(ToDoItem item);
	public abstract void pauso(ToDoItem item);
	public abstract void termino(ToDoItem item);
	
	public Duration tiempoTrabajado(ToDoItem item) {
		return Duration.between(item.getFechaInicio(), LocalDateTime.now());
	}
	
	public abstract void agregarComentario(ToDoItem item, String comment);
	
}
