
package fatec.poo.control;

import fatec.poo.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 0030481611007
 * @author 0030481611020
 * @author 0030481611029
 */
public class DaoProduto {
    private Connection conn;

    public DaoProduto(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Produto produto) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO TB_PRODUTO(CODIGO, DESCRICAO, QTDE_DISPONIVEL, PRECO_UNIT, ESTOQUE_MIN) VALUES(?,?,?,?,?)");
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setInt(3, produto.getQtdeDisponivel());
            ps.setDouble(4, produto.getPrecoUnit());
            ps.setInt(5, produto.getEstoqueMin());
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Produto produto) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE TB_PRODUTO SET DESCRICAO = ? AND QTDE_DISPONIVEL = ? AND PRECO_UNIT = ? AND ESTOQUE_MIN = ? WHERE CODIGO = ?");
            ps.setString(1, produto.getDescricao());
            ps.setInt(2, produto.getQtdeDisponivel());
            ps.setDouble(3, produto.getPrecoUnit());
            ps.setInt(4, produto.getEstoqueMin());
            ps.setInt(5, produto.getCodigo());
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Produto consultar (int codigo) {
        Produto p = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM TB_PRODUTO WHERE CODIGO = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                p = new Produto (codigo, rs.getString("DESCRICAO"));
                p.setQtdeDisponivel(rs.getInt("QTDE_DISPONIVEL"));
                p.setPrecoUnit(rs.getDouble("PRECO_UNIT"));
                p.setEstoqueMin(rs.getInt("ESTOQUE_MIN"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (p);
    }
    
    public void excluir(Produto produto) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM TB_PRODUTO WHERE CODIGO = ?");
            ps.setInt(1, produto.getCodigo());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
