
package main.java.br.com.vvatte.dao.generic.jpa;

import main.java.br.com.vvatte.domain.jpa.Persistente;

import java.io.Serializable;


public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
