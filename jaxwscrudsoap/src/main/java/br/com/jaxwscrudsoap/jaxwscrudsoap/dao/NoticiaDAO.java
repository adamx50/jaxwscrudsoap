package br.com.jaxwscrudsoap.jaxwscrudsoap.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.jaxwscrudsoap.jaxwscrudsoap.model.Noticia;

public interface NoticiaDAO {
	
	public long adicionar(Noticia noticia) throws SQLException;

	public Noticia alterar(Noticia noticia) throws SQLException;

	public boolean apagar(long id) throws SQLException;

	public List<Noticia> listar() throws SQLException;

	public Noticia ler(long id) throws SQLException;
}
