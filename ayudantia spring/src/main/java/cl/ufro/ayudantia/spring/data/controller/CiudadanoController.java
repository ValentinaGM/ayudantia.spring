/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.ayudantia.spring.data.controller;

import cl.ufro.ayudantia.spring.data.dao.CiudadDAO;
import cl.ufro.ayudantia.spring.data.modelo.Ciudadano;
import cl.ufro.ayudantia.spring.data.service.CiudadanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Valentina
 */
@RestController
@RequestMapping("ciudadanos")

public class CiudadanoController {

    @Autowired
    private CiudadanoService ciudadanoService;

    @PostMapping

    public Ciudadano store(@RequestBody Ciudadano ciudadano) throws Exception {

        this.ciudadanoService.save(ciudadano);

        return ciudadano;
    }

}
