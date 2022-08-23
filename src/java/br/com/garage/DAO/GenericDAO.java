/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.garage.DAO;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface GenericDAO {

    public Boolean cadastrar(Object object) throws Exception;

    public List<Object> listar() throws Exception;

    public Boolean excluir(Integer idObject) throws Exception;

    public Object carregar(Integer idObject) throws Exception;

    public boolean alterar(Object object) throws Exception;

}
