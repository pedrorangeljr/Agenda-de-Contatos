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

	/* Metodo para salvar contatos */

	public void salvar(BeanContatos contatos) {

		try {

			String sql = "insert into contatos(id,nome, telefone, email)values(?,?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);

			insert.setLong(1, contatos.getId());
			insert.setString(2, contatos.getNome());
			insert.setString(3, contatos.getTelefone());
			insert.setString(4, contatos.getEmail());
			insert.execute();

			connection.commit();

		} catch (Exception e) {

			try {

				connection.rollback();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	/* Metodo Listar Contatos */

	public List<BeanContatos> listar() throws Exception {

		List<BeanContatos> listar = new ArrayList<BeanContatos>();

		String sql = "select * from contatos";
		PreparedStatement select = connection.prepareStatement(sql);
		ResultSet resultSet = select.executeQuery();

		while (resultSet.next()) {

			BeanContatos beanContatos = new BeanContatos();

			beanContatos.setId(resultSet.getLong("id"));
			beanContatos.setNome(resultSet.getString("nome"));
			beanContatos.setTelefone(resultSet.getString("telefone"));
			beanContatos.setEmail(resultSet.getString("email"));

			listar.add(beanContatos);
		}

		return listar;
	}

	/* Medoto excluir */

	public void deletar(String nome) {

		try {

			String sql = "delete from contatos where nome = '" + nome + "'";
			PreparedStatement delete = connection.prepareStatement(sql);
			delete.execute();

			connection.commit();

		} catch (Exception e) {

			try {

				connection.rollback();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();
		}
	}

	/* medoto Consultar */

	public BeanContatos consultar(String nome)throws Exception {

		String sql = "select * from contatos where nome = '" + nome + "'";
		PreparedStatement consultar = connection.prepareStatement(sql);
		ResultSet resultSet = consultar.executeQuery();
		
		if(resultSet.next()) {
			
			BeanContatos beanContatos = new BeanContatos();
			
			beanContatos.setId(resultSet.getLong("id"));
			beanContatos.setNome(resultSet.getString("nome"));
			beanContatos.setTelefone(resultSet.getString("telefone"));
			beanContatos.setEmail(resultSet.getString("email"));
			
			return beanContatos;
		}
		return null;
	}
	
	/* Metodo Atualizar*/

	public void atualizar(BeanContatos contatos) {
		
		try {
		String sql = "update contatos set nome = ?, telefone = ?, email = ? where id = " + contatos.getId();
		PreparedStatement atualizar = connection.prepareStatement(sql);
		
		atualizar.setString(1, contatos.getNome());
		atualizar.setString(2,  contatos.getTelefone());
		atualizar.setString(3, contatos.getEmail());
		atualizar.executeUpdate();
		
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

}
