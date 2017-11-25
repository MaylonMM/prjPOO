
package fatec.poo.control;

import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 0030481611007
 * @author 0030481611020
 * @author 0030481611029
 */
public class DaoVendedor {
    private Connection conn;

    public DaoVendedor(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Vendedor vendedor) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO TB_VENDEDOR(CPF, NOME, ENDERECO, CIDADE, CEP, UF, DDD, TELEFONE, SALARIOBASE, COMISSAO) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE TB_VENDEDOR SET NOME = ? AND ENDERECO = ? AND CIDADE = ? AND CEP = ? AND UF = ? AND DDD = ? AND TELEONE = ? AND SALARIOBASE = ? AND COMISSAO = ? WHERE CPF = ?");
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
            ps.setString(3, vendedor.getCidade());
            ps.setString(4, vendedor.getCep());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getDdd());
            ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
            ps.setDouble(9, vendedor.getComissao());
            ps.setString(10, vendedor.getCpf());
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Vendedor consultar (String cpf) {
        Vendedor v = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM TB_VENDEDOR WHERE CPF = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                v = new Vendedor (cpf, rs.getString("NOME"), rs.getDouble("SALARIOBASE"));
                v.setEndereco(rs.getString("ENDERECO"));
                v.setCidade(rs.getString("CIDADE"));
                v.setCep(rs.getString("CEP"));
                v.setUf(rs.getString("UF"));
                v.setDdd(rs.getString("DDD"));
                v.setTelefone(rs.getString("TELEFONE"));
                v.setComissao(rs.getDouble("COMISSAO"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (v);
    }
    
    public void excluir(Vendedor vendedor) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM TB_VENDEDOR WHERE CPF = ?");
            ps.setString(1, vendedor.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
