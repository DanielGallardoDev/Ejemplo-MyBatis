package com.helloworldSchool.myBatisExample.controllers;

import com.helloworldSchool.myBatisExample.persistence.database.mappers.PolizaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.helloworldSchool.myBatisExample.persistence.database.model.Poliza;

@Controller
public class PolizaController {

    @Autowired
    PolizaMapper polizaMapper;
    @GetMapping("/poliza")
    public ResponseEntity<Poliza>  getPoliza(){

        Poliza poliza = this.polizaMapper.getPoliza(3);

        return ResponseEntity.ok(poliza);
    }
}
