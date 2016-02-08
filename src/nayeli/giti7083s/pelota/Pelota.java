package nayeli.giti7083s.pelota;

public abstract class Pelota implements Rebotable{ //Aqui declaramos la clase abstracta

	private int Redondez;
	public Pelota(){
		
	}
	public int getRedondez() {
		return Redondez;
	}
	public void setRedondez(int redondez) { // Este método especifica la redondez
		Redondez = redondez;
	}
}
