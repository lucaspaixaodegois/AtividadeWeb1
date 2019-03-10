package br.unitins.cadastro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.cadastro.application.Util;
import br.unitins.cadastro.model.Usuario;

@Named
@RequestScoped
public class LoginController {

	private Usuario usuario;
	
	public void entrar() {
		if (getUsuario().getLogin().equals("joao") && getUsuario().getSenha().equals("123")) {
			System.out.println("Login v�lido");
			Util.redirect("usuario.xhtml");
		} else {
			Util.addMessageError("Login Inv�lido");
		}
	}
	
	public void limpar() {
		setUsuario(null);
	}

	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}