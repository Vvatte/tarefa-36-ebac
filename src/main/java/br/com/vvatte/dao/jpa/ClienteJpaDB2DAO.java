
package main.java.br.com.vvatte.dao.jpa;


import main.java.br.com.vvatte.dao.generic.jpa.GenericJpaDB2DAO;
import main.java.br.com.vvatte.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
