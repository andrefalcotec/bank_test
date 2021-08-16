package com.test.bank_test.controller;

import com.test.bank_test.domain.Produto;
import com.test.bank_test.infrastructure.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository ProdutoRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Produto> getProdutos(){
        return ProdutoRepository.findAll();
    }

}
