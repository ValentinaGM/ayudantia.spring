/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.ayudantia.spring.data.service;

import cl.ufro.ayudantia.spring.data.dao.CiudadDAO;
import cl.ufro.ayudantia.spring.data.dao.CiudadanoDAO;
import cl.ufro.ayudantia.spring.data.exception.CiudadInvalidaException;
import cl.ufro.ayudantia.spring.data.exception.CiudadanoInvalidoException;
import cl.ufro.ayudantia.spring.data.modelo.Ciudad;
import cl.ufro.ayudantia.spring.data.modelo.Ciudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Valentina
 */
@Service
public class CiudadanoService {

    @Autowired
    private CiudadDAO ciudadDAO;
    

    @Autowired
    private CiudadanoDAO ciudadanoDAO;

    @Transactional(rollbackFor = {CiudadInvalidaException.class, CiudadanoInvalidoException.class})

    public void save(Ciudadano ciudadano) throws CiudadInvalidaException, CiudadanoInvalidoException {

        Ciudad ciudad = ciudadano.getCiudad();

        if (ciudad == null) {

            throw new CiudadInvalidaException();

        }
        this.ciudadDAO.save(ciudad);

        if (ciudadano.getNombres().length() == 0) {

            throw new CiudadanoInvalidoException();

        }
        this.ciudadanoDAO.save(ciudadano);
    }
}
