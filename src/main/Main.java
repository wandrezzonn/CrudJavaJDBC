package main;

import main.model.Usuario;
import main.model.UsuarioDAO;

public class Main {

	public static void main(String[] args) {

		Usuario u = new Usuario();
		u.setNome("Marly Rocha");
		u.setUsuario("marly");
		u.setSenha("123");
		UsuarioDAO dao = new UsuarioDAO();
	
		
		for(Usuario usu: dao.buscar()) {
			System.out.println("Nome: " +usu.getNome());
			System.out.println("Usuario: " +usu.getUsuario());
		}

	}

}
