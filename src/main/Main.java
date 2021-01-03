package main;

import main.model.Usuario;
import main.model.UsuarioDAO;

public class Main {

	public static void main(String[] args) {

		Usuario u = new Usuario();
		u.setId(2);
		u.setNome("Marly Rocha");
		u.setUsuario("marly");
		u.setSenha("789654");
		UsuarioDAO dao = new UsuarioDAO();
	dao.atualizar(u);
		
		for(Usuario usu: dao.buscar()) {
			System.out.println("ID: " +usu.getId());
			System.out.println("Nome: " +usu.getNome());
			System.out.println("Usuario: " +usu.getUsuario());
			System.out.println("Senha: " +usu.getSenha());
		}

	}

}
