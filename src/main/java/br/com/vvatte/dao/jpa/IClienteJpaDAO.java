
package main.java.br.com.vvatte.dao.jpa;


import main.java.br.com.vvatte.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.vvatte.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}
