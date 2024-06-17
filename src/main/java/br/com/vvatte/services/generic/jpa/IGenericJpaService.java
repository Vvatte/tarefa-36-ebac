package main.java.br.com.vvatte.services.generic.jpa;

import main.java.br.com.vvatte.domain.jpa.Persistente;
import main.java.br.com.vvatte.exceptions.DAOException;
import main.java.br.com.vvatte.exceptions.MaisDeUmRegistroException;
import main.java.br.com.vvatte.exceptions.TableException;
import main.java.br.com.vvatte.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;




public interface IGenericJpaService <T extends Persistente, E extends Serializable> {
	

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     * @throws DAOException 
     */
    public Collection<T> buscarTodos() throws DAOException;

}
