package EjerUCM3;

public class Bicicleta{
	   private int velocidadAct, platoAct, piñonAct;

	    public Bicicleta(int velocidadAct, int platoAct, int piñonAct){
	        this.velocidadAct=velocidadAct;
	        this.platoAct=platoAct;
	        this.piñonAct=piñonAct;
	    }//Construct_bicicleta

	    public void acelerar(){
	        velocidadAct*=2;
	    }//acelerar

	    public void frenar(){
	        velocidadAct/=2;
	    }//frenar

	    public void cambiarPlato(int plato) {
	        platoAct=plato;
	    }//cambiarPlato

	    public void cambiarPiñon(int piñon) {
	        piñonAct=piñon;
	    }//cambiarPiñon

	    @Override
	    public String toString(){
	        return "Velocidad Bicicleta "+ velocidadAct + " Plato_bicicleta "+ platoAct+" Piñon_bicicleta "+piñonAct;
	    }//toString
	}//class
/*subir github*/