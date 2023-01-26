package segunda_EV;

public class Alumno {
	private String Nombre;
	private String Apellido;

	////////Constructores//////////////////////////////////////////////////
	public Alumno() {
		
	}//constructor_Vacio
	
	public Alumno(String Nombre, String Apellido) {
		this.Nombre=Nombre;
		this.Apellido=Apellido;
	}//contructorV2
	
	/////////toString///////////////////////////////////////////////////////
	@Override
	public String toString(){
		return Nombre + " " + Apellido;
	}//toString
	
	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }//if
        if (o == null || getClass() != o.getClass()) {
            return false;
        }//if
        Alumno alumno = (Alumno) o;
        return Nombre.equals(alumno.Nombre)&&
                Apellido.equals(alumno.Apellido);
    }//equals
	/////////Setters_Getters////////////////////////////////////////////////
	public void setNombre(String newNombre) {
		this.Nombre=newNombre;
	}//setNombre
	
	public String getNombre() {
		return Nombre;
	}//getNombre
	
	public void setApellido(String newApellido) {
		this.Apellido=newApellido;
	}//setApellido
	
	public String getApellido() {
		return Apellido;
	}//getApellido
	
}//class
