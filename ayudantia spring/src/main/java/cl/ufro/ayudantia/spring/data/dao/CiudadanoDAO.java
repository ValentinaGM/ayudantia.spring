/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.ayudantia.spring.data.dao;

import cl.ufro.ayudantia.spring.data.modelo.Ciudadano;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author valen
 */
@RepositoryRestResource(path="ciudadanos", collectionResourceRel = "ciudadanos")
public interface CiudadanoDAO extends CrudRepository<Ciudadano, Long> {
    @Override
    public List<Ciudadano> findAll();
}
