package nayeli.giti7083s.canino;

public abstract class Animal {//Clase Abstracta Animal
	
private String foto;
private String tipoComida;
private String localizacion;
private String tamanio;

public void hacerRuido(){//métodos
}
public void comer(){
}
public void dormir(){
}
public void rugir(){
}
public String getFoto() {
	return foto;
}
public void setFoto(String foto) {
	this.foto = foto;
}
public String getTipoComida() {
	return tipoComida;
}
public void setTipoComida(String tipoComida) {
	this.tipoComida = tipoComida;
}
public String getLocalizacion() {
	return localizacion;
}
public void setLocalizacion(String localizacion) {
	this.localizacion = localizacion;
}
public String getTamanio() {
	return tamanio;
}
public void setTamanio(String tamanio) {
	this.tamanio = tamanio;
}

}
