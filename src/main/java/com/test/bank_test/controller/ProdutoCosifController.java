package com.test.bank_test.controller;

import com.test.bank_test.domain.ProdutoCosif;
import com.test.bank_test.infrastructure.ProdutoCosifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtoscosif")
public class ProdutoCosifController {

    @Autowired
    private ProdutoCosifRepository ProdutoCosifRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<ProdutoCosif> getProdutosCosif(){
        return ProdutoCosifRepository.findAll();
    }

}
