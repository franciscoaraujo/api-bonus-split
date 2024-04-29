package com.bytebuilder.apibonussplit.api.v1.controller;


import com.bytebuilder.apibonussplit.domain.dtos.MetasDto;
import com.bytebuilder.apibonussplit.domain.dtos.RemuneracaoDto;
import com.bytebuilder.apibonussplit.domain.dtos.VendaDto;
import com.bytebuilder.apibonussplit.service.calculos.CalculoVariavelMetasServices;
import com.bytebuilder.apibonussplit.service.calculos.CalculoVariavelVendasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculo/variavel")
public class CalculoVariavelMetasController {

    @Autowired
    private CalculoVariavelMetasServices variavelMetasServices;

    @PostMapping("/metas")
    public ResponseEntity<RemuneracaoDto> getRemuneracaoBonusVendas(@RequestBody MetasDto metasDto) {
        return ResponseEntity.ok().body(variavelMetasServices.getCalculosRemuneracaoMetas(metasDto));
    }
}
