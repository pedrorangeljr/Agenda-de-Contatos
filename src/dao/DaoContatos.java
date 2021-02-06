package dao;

import java.sql.Connection;

/* Classe responsavel pelas operações no banco de dados*/

import conexao.SingleConnection;

public class DaoContatos {
	
	private Connection connection;
	
	public DaoContatos() {
		
		connection = SingleConnection.getConnection();
	}

	/* Metodo para salvar contatos*/
}
