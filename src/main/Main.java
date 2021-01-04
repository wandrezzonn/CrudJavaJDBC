package main;

import main.model.Usuario;
import main.model.UsuarioDAO;

public class Main {

	public static void main(String[] args) {

		Usuario u = new Usuario();
		u.setId(1);
		
		UsuarioDAO dao = new UsuarioDAO();
		for(Usuario usu: dao.buscar()) {
			System.out.println("ID: " +usu.getId());
			System.out.println("Nome: " +usu.getNome());
			System.out.println("Usuario: " +usu.getUsuario());
			System.out.println("Senha: " +usu.getSenha());
		}
		
		System.out.println("Busca por ID");
		System.out.println(dao.buscarPorId(u).getNome());

	}

}
