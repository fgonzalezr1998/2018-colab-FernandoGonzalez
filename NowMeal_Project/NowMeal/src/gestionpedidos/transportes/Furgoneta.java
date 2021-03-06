package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;

public abstract class Furgoneta extends Transporte {
	
	protected double tara; //La tara en kg de la furgoneta
	
	public Furgoneta(String codigo, Mapa mapa, double tara) {
		super(codigo, mapa); //Llamo al constructor de la clase padre
		this.tara = tara;
	}
	
	public abstract double coste(String codIni, String codFin);
	
	public double getTara() {
		return this.tara;
	}

}
