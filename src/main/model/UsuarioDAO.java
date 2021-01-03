package main.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import main.connection.ConexaoBD;

public class UsuarioDAO {

	Connection conn = null;
	ConexaoBD conexao = new ConexaoBD();
	PreparedStatement pstm;
	
	public UsuarioDAO() {
		
	}
	
	public void salvar(Usuario usuario) {
		String sql = "INSERT INTO usuario(nome,senha,usuario) values(?,?,?)";
		try {
			conn = conexao.conectar();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getSenha());
			pstm.setString(3, usuario.getUsuario());
			pstm.execute();
			pstm.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Erro ao salvar " +e.getMessage());
		}
		
	}
	
	
	public List<Usuario> buscar(){
		String sql = "SELECT * FROM usuario";
		List<Usuario> usuarios = new ArrayList<>();
		ResultSet res;
		try {
			conn = conexao.conectar();
			pstm = conn.prepareStatement(sql);
			res = pstm.executeQuery();
			while(res.next()) {
				Usuario u = new Usuario();
				u.setId(res.getInt("id"));
				u.setNome(res.getString("nome"));
				u.setSenha(res.getString("senha"));
				u.setUsuario(res.getString("usuario"));
				usuarios.add(u);
				
			}
			pstm.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Erro na busca " + e.getMessage());
		}
		
		return usuarios;
		
	}
}
