package com.myspace.tari2;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Tari implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Nume")
	private java.lang.String nume;
	@org.kie.api.definition.type.Label(value = "Culoare")
	private java.lang.String culoare;

	public Tari() {
	}

	public java.lang.String getNume() {
		return this.nume;
	}

	public void setNume(java.lang.String nume) {
		this.nume = nume;
	}

	public java.lang.String getCuloare() {
		return this.culoare;
	}

	public void setCuloare(java.lang.String culoare) {
		this.culoare = culoare;
	}

	public Tari(java.lang.String nume, java.lang.String culoare) {
		this.nume = nume;
		this.culoare = culoare;
	}

}