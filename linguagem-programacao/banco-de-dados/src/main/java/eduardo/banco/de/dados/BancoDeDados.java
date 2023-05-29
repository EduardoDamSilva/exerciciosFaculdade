/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.banco.de.dados;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author eduardo
 */
public class BancoDeDados {
    public static void main(String[] args) {
        
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();
        
        con.execute("DROP TABLE IF EXISTS filme");
        con.execute("CREATE TABLE filme("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(255) NOT NULL,"
                + "ano_lancamento INT,"
                + ")");
        
        con.update("INSERT INTO filme VALUES (null, 'Vingadores 2', 2007)");
        con.update("INSERT INTO filme VALUES (null, 'Bastardos Inglórios', 2001)");
        con.update("INSERT INTO filme VALUES (null, 'O auto da compadecida', 2015)");
        
        Filme novoFilme = new Filme();
        novoFilme.setNome("A volta dos que não foram");
        novoFilme.setAnoLancamento(2023);
        
        con.update("INSERT INTO filme values (null, ?, ?)", novoFilme.getNome(), novoFilme.getAnoLancamento());
        
        List<Filme> filmesDoBanco = con.query("SELECT * FROM filme", 
                new BeanPropertyRowMapper<>(Filme.class));
        
        System.out.println(filmesDoBanco);
        
        con.update("UPDATE filme SET nome = 'Shrek', ano_lancamento = 2001 WHERE id = 1");
        
        filmesDoBanco = con.query("SELECT * FROM filme", 
                new BeanPropertyRowMapper<>(Filme.class));
        
        System.out.println(filmesDoBanco);
        
        con.update("DELETE FROM filme WHERE id = ?", 2);
        
        filmesDoBanco = con.query("SELECT * FROM filme", 
                new BeanPropertyRowMapper<>(Filme.class));
        
        System.out.println(filmesDoBanco);
        
        Filme filme1 = con.queryForObject("SELECT * FROM filme WHERE id = ?", new BeanPropertyRowMapper<>(Filme.class), 1);
        
        System.out.println(filme1);
    }
}
