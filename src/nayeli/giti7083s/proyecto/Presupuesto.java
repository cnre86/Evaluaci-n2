package nayeli.giti7083s.proyecto;

import java.sql.Date;

public abstract class Presupuesto implements IConsultarEstado{
	
	private Date fecha;
	private String descripcion;
	private double importe;
	private String estado;
	private Viaje[] seRealizan;
}
