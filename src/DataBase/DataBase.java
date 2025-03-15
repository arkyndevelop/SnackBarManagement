package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    // Caminho do banco de dados, porta, nome do banco
    private static final String url = "jdbc:mysql://localhost:3306/GestaoLanchonete";
    // Nome do usuario do banco de dados
    private static final String user = "root";
    // Senha do banco de dados
    private static final String password = "admin1234";

    public static Connection createConnectionToMySQL() {
        try {
            // Carregar o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Criar e retornar a conexão com o banco de dados
            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            System.err.println(" Driver do Banco de Dados não encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println(" Erro ao conectar ao Banco de Dados: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // Recuperar uma conexão com o Banco de Dados
        Connection connectionDB = createConnectionToMySQL();

        if (connectionDB != null) {
            System.out.println(" Conexão estabelecida com sucesso!");
            try {
                connectionDB.close();
                System.out.println("🔌 Conexão encerrada.");
            } catch (SQLException e) {
                System.err.println(" Erro ao fechar conexão!");
                e.printStackTrace();
            }
        } else {
            System.out.println(" Falha ao conectar com o banco de dados!");
        }
    }
}
