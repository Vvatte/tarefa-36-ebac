package test.java.br.com.vvatte.dao;


import main.java.br.com.vvatte.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.vvatte.dao.jpa.IVendaJpaDAO;
import main.java.br.com.vvatte.domain.jpa.VendaJpa;
import main.java.br.com.vvatte.exceptions.DAOException;
import main.java.br.com.vvatte.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
