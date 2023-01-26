package primera_ev;

public class Alumno {
private String Nombre;
private int edad;

public Alumno(String Nombre, int edad){
	this.Nombre=Nombre;
	this.edad=edad;
}//alumno
@Override
public String toString() {
	return Nombre + edad;
}//toString
}//class
// this. se usa si el nombre es igual
