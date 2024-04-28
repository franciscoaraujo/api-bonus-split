package com.bytebuilder.apibonussplit.api.v1.controller;

import com.bytebuilder.apibonussplit.domain.dtos.VendaDto;
import com.bytebuilder.apibonussplit.domain.entity.Remuneracao;
import com.bytebuilder.apibonussplit.service.calculos.CalculoVendasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class CalculoVendaController {

    @Autowired
    private CalculoVendasServices calculoVendasServices;


    @PostMapping("/venda")
    public ResponseEntity<Remuneracao> getRemuneracaoBonusVendas(@RequestBody VendaDto vendaDto) {
        return ResponseEntity.ok().body(calculoVendasServices.getCalculosRemuneracaoVenda(vendaDto));
    }
}
