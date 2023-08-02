package com.curso.conid.v4;

//BAJO ACOPLAMIENTO
//ALTA COHESION
public class Becario {
	
	private String nombre; //has-a (tiene un)
	private Pc pc; //has-a (tiene un)
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderPc(){
		System.out.println(nombre + " " +pc.on());
	}

	public Pc getPc() {
		return pc;
	}

	public void setPc(Pc pc) {
		this.pc = pc;
	}
	
}
