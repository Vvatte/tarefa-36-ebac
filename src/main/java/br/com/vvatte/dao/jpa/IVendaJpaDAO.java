
package main.java.br.com.vvatte.dao.jpa;


import main.java.br.com.vvatte.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.vvatte.domain.jpa.VendaJpa;
import main.java.br.com.vvatte.exceptions.DAOException;
import main.java.br.com.vvatte.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long> {

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	

	public VendaJpa consultarComCollection(Long id);
}
