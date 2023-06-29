package ar.edu.unlam.src;

import java.util.ArrayList;
import java.util.List;

public class PlanificadorDeEventos {
	
	private List<Usuario> usuarios;
	private List<Cumple> cumples;
	private List<Evento> eventos;
	private List<Casamiento> casamientos;
	
	private List<Usuario> invitados;
	
	public PlanificadorDeEventos() {
		this.usuarios = new ArrayList<Usuario>();
		this.setCumples(new ArrayList<Cumple>());
		this.eventos = new ArrayList<Evento>();
		this.casamientos = new ArrayList<Casamiento>();
		
		this.invitados = new ArrayList<Usuario>();
	}

	public void addUser(Usuario usuario) {
		this.usuarios.add(usuario);
		
	}

	public Usuario getUsuario(String mailOrganizador) {
		for (Usuario usuario : usuarios) {
			if(usuario.getMailOrganizador().equals(mailOrganizador))
				return usuario;
		}
		return null;
	}

	public void crear(Usuario usuario, Evento evento) {
		addUser(new Agasajado(null, null, null));
		if(evento.equals(casamientos)) {
			casamientos.add((Casamiento) evento);
		} else if(evento.equals(getCumples())) {
			getCumples().add((Cumple) evento);
		} else if(evento.equals(eventos)) {
			eventos.add(evento);
		}
		
		
	}

	public Integer getCantidadDeUsuarios() {
		return this.usuarios.size();
	}

	public Integer getCantidadDeEventos() {
		return this.eventos.size();
	}

	public Integer getCantidadDeCumpleanios() {
		return this.getCumples().size();
	}

	public Integer getCantidadDeCasamientos() {
		return this.getCasamientos().size();
	}

	public Evento getEvento(String nombre) {
		for (Evento evento : eventos) {
			if(evento.getNombre().equals(nombre))
				return evento;
		}
		return null;
	}

	public List<Casamiento> getCasamientos() {
		return casamientos;
	}

	public void setCasamientos(List<Casamiento> casamientos) {
		this.casamientos = casamientos;
	}

	public List<Cumple> getCumples() {
		return cumples;
	}

	public void setCumples(List<Cumple> cumples) {
		this.cumples = cumples;
	}

	public void crear(Usuario usuario, String nombreDelEvento) {
		if(usuarios.get(0).getMailOrganizador().equals(usuario.getMailOrganizador())) {
			if(nombreDelEvento.equals(eventos.get(0).getNombre())) {
				new Evento(usuario);
			}
		}
		
	}

	public void invitar(Evento evento, Usuario usuario) {
		if(getEvento())
		this.invitados.add(usuario);
		
	}

	public Integer getCantidadDeInvitados() {
		return invitados.size();
	}

}
