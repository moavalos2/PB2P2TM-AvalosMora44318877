package ar.edu.unlam.src;

import java.util.Comparator;

public class Usuario implements Comparator<Usuario>{
	
	private String mailOrganizador;
	private String nombreOrganizador; 
	private Integer edadOrganizador;

	public Usuario(String mailOrganizador, String nombreOrganizador, Integer edadOrganizador) {
		this.mailOrganizador = mailOrganizador;
		this.nombreOrganizador = nombreOrganizador;
		this.edadOrganizador = edadOrganizador;
	}

	public String getMailOrganizador() {
		return mailOrganizador;
	}

	public void setMailOrganizador(String mailOrganizador) {
		this.mailOrganizador = mailOrganizador;
	}

	public String getNombreOrganizador() {
		return nombreOrganizador;
	}

	public void setNombreOrganizador(String nombreOrganizador) {
		this.nombreOrganizador = nombreOrganizador;
	}

	public Integer getEdadOrganizador() {
		return edadOrganizador;
	}

	public void setEdadOrganizador(Integer edadOrganizador) {
		this.edadOrganizador = edadOrganizador;
	}

	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o1.getMailOrganizador().compareTo(mailOrganizador);
	}

}
