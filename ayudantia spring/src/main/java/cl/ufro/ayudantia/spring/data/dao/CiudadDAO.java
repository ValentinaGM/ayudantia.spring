/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.ayudantia.spring.data.dao;

import cl.ufro.ayudantia.spring.data.modelo.Ciudad;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author valen
 */
@RepositoryRestResource(path="ciudades", collectionResourceRel = "ciudades")
public interface CiudadDAO extends CrudRepository<Ciudad, Long>{
    @Override
    public List<Ciudad> findAll();
}
