package segunda_EV;

public class Atleta {
private String dni="";
private String nombre="";
private int year;
private float altura;
private float peso;
private boolean estudios;
public enum sexo{M, F, X}
private sexo genero;
///////////////////////////////////////////////////////////
/*public Atleta() {
	
}//constructor*/
///////////////////////////////////////////////////////////
public Atleta(String newdni, String newnombre, int newYear, float newaltura, float newpeso, boolean newestudio, sexo newgenero){
	this.nombre=newnombre;
	this.dni=newdni;
	this.year=newYear;
	this.altura=newaltura;
	this.peso=newpeso;
	this.estudios=newestudio;
	this.genero=newgenero;
}//Constructor Con campos
////////////////////////////////////////////////////////////
 public void setNombre(String newnombre) {
	 this.nombre=newnombre;
 }//setNombre
 
 public void setDNI(String newdni) {
	 this.dni=newdni;
 }//setDNI
 
 public void setYear(int newYear) {
	 this.year=newYear;
 }//setAño
 
 public void setAltura(float newaltura) {
	 this.altura=newaltura;
 }//setaltura
 
 public void setPeso(float newpeso) {
	 this.peso=newpeso;
 }//setPeso
 public void setEstudios(boolean newestudio) {
	 this.estudios=newestudio;
 }//setEstudios
@Override
public String toString() {
	return nombre + " DNI: ******" +/*tresdni+dosdni+unodni+letradni +*/dni+ " " +year +" "+ altura+ "cm "+peso+ "kg "+"estudiante: "+ estudios ;
}//OverrrtoString
}//class
