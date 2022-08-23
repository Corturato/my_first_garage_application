/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.garage.model;

/**
 *
 * @author Aluno
 */
public class Marca {

    private Integer idMarca;
    private String nomeMarca;
    private String descricaoMarca;

    public Marca() {
    }

    public Marca(Integer idMarca, String nomeMarca, String descricaoMarca) {
        this.idMarca = idMarca;
        this.nomeMarca = nomeMarca;
        this.descricaoMarca = descricaoMarca;
    }
          
    /**
     * @return the idMarca
     */
    public Integer getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the nomeMarca
     */
    public String getNomeMarca() {
        return nomeMarca;
    }

    /**
     * @param nomeMarca the nomeMarca to set
     */
    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    /**
     * @return the descricaoMarca
     */
    public String getDescricaoMarca() {
        return descricaoMarca;
    }

    /**
     * @param descricaoMarca the descricaoMarca to set
     */
    public void setDescricaoMarca(String descricaoMarca) {
        this.descricaoMarca = descricaoMarca;
    }

}
