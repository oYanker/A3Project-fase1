package com.a3project.projetcta3.DAO;

import com.a3project.projetcta3.model.Amigos;
import com.a3project.projetcta3.model.Ferramentas;
import java.util.ArrayList;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FerramentasDAO {

    public static ArrayList<Ferramentas> MinhaLista = new ArrayList<Ferramentas>();
    public static ArrayList<Amigos> MinhaListaAmigos = new ArrayList<Amigos>();

    public FerramentasDAO() {

    }

    public Connection getConexao() {

        Connection connection = null;  //instância da conexão

        try {

            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexão
            String server = "localhost"; //caminho do MySQL
            String database = "db_ferramentas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Superserver1234";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_ferramenta) id_ferramenta FROM tb_ferramentas");
            res.next();
            maiorID = res.getInt("id_ferramenta");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public ArrayList getMinhaLista() {

        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {

                int id_ferramenta = res.getInt("id_ferramenta");
                String nome_ferramenta = res.getString("nome_ferramenta");
                double valor = res.getDouble("valor");
                String marca = res.getString("marca");

                Ferramentas objetoFerramenta = new Ferramentas(id_ferramenta, nome_ferramenta, valor, marca);

                MinhaLista.add(objetoFerramenta);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    public boolean InsertFerramentaBD(Ferramentas objetoFerramenta) {
        String sql = "INSERT INTO tb_ferramentas(id_ferramenta ,nome_ferramenta,valor, marca) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objetoFerramenta.getId_Ferramenta());
            stmt.setString(2, objetoFerramenta.getNome_Ferramenta());
            stmt.setDouble(3, objetoFerramenta.getValor());
            stmt.setString(4, objetoFerramenta.getMarca());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public boolean DeleteFerramentaBD(int id_ferramenta) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id_ferramenta = " + id_ferramenta);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateFerramentaBD(Ferramentas objetoFerramenta) {

        String sql = "UPDATE tb_ferramentas set nome_ferramenta = ? ,valor = ?, marca = ? WHERE id_ferramenta = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objetoFerramenta.getNome_Ferramenta());
            stmt.setDouble(2, objetoFerramenta.getValor());
            stmt.setString(3, objetoFerramenta.getMarca());
            stmt.setInt(4, objetoFerramenta.getId_Ferramenta());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Ferramentas carregaFerramenta(int id_ferramenta) {

        Ferramentas objetoFerramenta = new Ferramentas();
        objetoFerramenta.setId_Ferramenta(id_ferramenta);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id_ferramenta = " + id_ferramenta);
            res.next();

            objetoFerramenta.setNome_Ferramenta(res.getString("nome_ferramenta"));
            objetoFerramenta.setValor(res.getDouble("valor"));
            objetoFerramenta.setMarca(res.getString("marca"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objetoFerramenta;
    }

    /* CRUD DE AMIGOS */
    public int maiorIDAmigos() {
        int maiorIDAmigos = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_amigos");
            res.next();
            maiorIDAmigos = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorIDAmigos;
    }

    public ArrayList getMinhaListaAmigos() {

        MinhaListaAmigos.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                int telefone = res.getInt("telefone");
                String email = res.getString("email");

                Amigos objetoA = new Amigos(id, nome, telefone, email);

                MinhaListaAmigos.add(objetoA);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaListaAmigos;
    }

    public boolean InsertAmigosBD(Amigos objeto) {
        String sql = "INSERT INTO tb_amigos(id ,nome,telefone,email) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getTelefone());
            stmt.setString(4, objeto.getEmail());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public boolean DeleteAmigosBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateAmigosBD(Amigos objeto) {

        String sql = "UPDATE tb_amigos set nome = ? ,telefone = ? ,email = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getTelefone());
            stmt.setString(3, objeto.getEmail());
            stmt.setInt(4, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Amigos carregaAmigos(int id) {

        Amigos objeto = new Amigos();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setTelefone(res.getInt("telefone"));
            objeto.setEmail(res.getString("email"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
}
