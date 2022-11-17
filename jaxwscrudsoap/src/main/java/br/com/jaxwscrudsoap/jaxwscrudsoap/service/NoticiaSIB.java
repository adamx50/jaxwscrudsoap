package br.com.jaxwscrudsoap.jaxwscrudsoap.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.jaxwscrudsoap.jaxwscrudsoap.dao.NoticiaDAO;
import br.com.jaxwscrudsoap.jaxwscrudsoap.dao.NoticiaDAOImpl;
import br.com.jaxwscrudsoap.jaxwscrudsoap.model.Noticia;
import br.com.jaxwscrudsoap.jaxwscrudsoap.util.Conexao;
import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.jaxwscrudsoap.jaxwscrudsoap.service.NoticiaSEI")
public class NoticiaSIB implements NoticiaSEI {

	@Override
	public long adicionar(Noticia noticia) {
		Connection con = Conexao.getConnection();
		NoticiaDAO dao = new NoticiaDAOImpl(con);
		long id = 0;
		try {
			id = dao.adicionar(noticia);
			return id;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public Noticia alterar(Noticia noticia) {
		Connection con = Conexao.getConnection();
		NoticiaDAO dao = new NoticiaDAOImpl(con);
		Noticia not = null;
		try {
			not = dao.alterar(noticia);
			return not;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return not;
	}

	@Override
	public boolean apagar(long id) {
		Connection con = Conexao.getConnection();
		NoticiaDAO dao = new NoticiaDAOImpl(con);
		try {
			return dao.apagar(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Noticia> listar() {
		Connection con = Conexao.getConnection();
		NoticiaDAO dao = new NoticiaDAOImpl(con);
		List<Noticia> noticias = new ArrayList<Noticia>();
		try {
			noticias = dao.listar();
			return noticias;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return noticias;
	}

	@Override
	public Noticia ler(long id) {
		Connection con = Conexao.getConnection();
		NoticiaDAO dao = new NoticiaDAOImpl(con);
		Noticia not = null;
		try {
			not = dao.ler(id);
			return not;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return not;
	}

}
