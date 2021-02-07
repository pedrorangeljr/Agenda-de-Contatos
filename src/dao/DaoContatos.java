package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.BeanContatos;

/* Classe responsavel pelas operações no banco de dados*/

import conexao.SingleConnection;

public class DaoContatos {
	
	private Connection connection;
	
	public DaoContatos() {
		
		connection = SingleConnection.getConnection();
	}

	/* Metodo para salvar contatos*/
	
	public void salvar(BeanContatos contatos) {
		
		try {
			
			String sql = "insert into contatos(nome, telefone, email)values(?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			
			insert.setString(1, contatos.getNome());
			insert.setString(2, contatos.getTelefone());
			insert.setString(3, contatos.getEmail());
			insert.execute();
			
			connection.commit();
			
		}catch(Exception e) {
			
			try {
				
				connection.rollback();
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
	}
	
	/* Metodo Listar Contatos*/
	
	public List<BeanContatos> listar() throws Exception{
		
		
		List<BeanContatos> listar = new ArrayList<BeanContatos>();
		
		String sql = "select * from contatos";
		PreparedStatement select = connection.prepareStatement(sql);
		ResultSet resultSet = select.executeQuery();
		
		while(resultSet.next()) {
			
			BeanContatos beanContatos = new BeanContatos();
			
			beanContatos.setNome(resultSet.getString("nome"));
			beanContatos.setTelefone(resultSet.getString("telefone"));
			beanContatos.setEmail(resultSet.getString("email"));
			
			listar.add(beanContatos);
		}
		
		return listar;
	}

}
