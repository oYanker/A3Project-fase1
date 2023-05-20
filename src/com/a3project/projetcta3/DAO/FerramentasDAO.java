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

/**
 *
 * @author drera
 */
public class FerramentasDAO {

    /**
     *
     */
    public static ArrayList<Ferramentas> MinhaLista = new ArrayList<Ferramentas>();
    public static ArrayList<Amigos> MinhaListaAmigos = new ArrayList<Amigos>();

    /**
     *
     */
    public FerramentasDAO() {

    }

    /**
     *
     * @return
     */
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
            String password = "!DRE123dre!";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    /**
     *
     * @return
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_ferramentas");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    /**
     *
     * @return
     */
    public ArrayList getMinhaLista() {

        MinhaLista.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {

                int id = res.getInt("id");
                String nome_ferramenta = res.getString("nome_ferramenta");
                double valor = res.getDouble("valor");
                String marca= res.getString("marca");

                Ferramentas objeto = new Ferramentas(id, nome_ferramenta, valor, marca);

                MinhaLista.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    /**
     *
     * @param objeto
     * @return
     */
    public boolean InsertFerramentaBD(Ferramentas objeto) {
        String sql = "INSERT INTO tb_ferramentas(id ,nome_ferramenta,valor, marca) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

              stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome_ferramenta());
            stmt.setDouble(3, objeto.getValor());
            stmt.setString(4, objeto.getMarca());
          

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    /**
     *
     * @param id
     * @return
     */
    public boolean DeleteFerramentaBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    /**
     *
     * @param objeto
     * @return
     */
    public boolean UpdateFerramentaBD(Ferramentas objeto) {

        String sql = "UPDATE tb_ferramentas set nome_ferramenta = ? ,valor = ?, marca = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome_ferramenta());
            stmt.setDouble(2, objeto.getValor());
            stmt.setString(3, objeto.getMarca());
            stmt.setInt(4, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    /**
     *
     * @param id
     * @return
     */
    public Ferramentas carregaFerramenta(int id) {

        Ferramentas objeto = new Ferramentas();
        objeto.setId(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id = " + id);
            res.next();

            objeto.setNome_ferramenta(res.getString("nome_ferramenta"));
            objeto.setValor(res.getDouble("valor"));
            objeto.setMarca(res.getString("marca"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
    
 /* NEW CRUD PARA AMIGOS */
    
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

    /**
     *
     * @return
     */
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

    /**
     *
     * @param objeto
     * @return
     */
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

    /**
     *
     * @param id
     * @return
     */
    public boolean DeleteAmigosBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    /**
     *
     * @param objeto
     * @return
     */
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

    /**
     *
     * @param id
     * @return
     */
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