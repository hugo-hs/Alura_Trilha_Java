package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		String nome = "Notebook'15";
		String descricao = "Notebook'i5";

		try(Connection connection = ConnectionPool.getConnection()){
			connection.setAutoCommit(false);
			String sql = "insert into Produto (nome, descricao) values(?, ?)";
			try(PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				adiciona(nome, descricao, sql, statement);
				adiciona(nome, descricao, sql, statement);
				connection.commit();
			}catch (Exception e) {
				e.printStackTrace();
				connection.rollback();
				System.out.println("ROLLBACK");
			}
		}
	}

	private static void adiciona(String nome, String descricao, String sql, PreparedStatement statement) throws SQLException {
		statement.setString(1, nome);
		statement.setString(2, descricao);
		boolean resultado = statement.execute(sql);

		ResultSet resultSet = statement.getGeneratedKeys();

		while (resultSet.next()) {
			System.out.println("Id gerado: " + resultSet.getString("id"));
		}

		System.out.println(resultado);

		resultSet.close();
	}
}
