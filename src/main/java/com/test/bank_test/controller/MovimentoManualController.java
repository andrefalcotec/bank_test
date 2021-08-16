package com.test.bank_test.controller;

import com.test.bank_test.domain.MovimentoManual;
import com.test.bank_test.domain.Produto;
import com.test.bank_test.infrastructure.MovimentoManualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/movimentos")
public class MovimentoManualController {

    @Autowired
    private MovimentoManualRepository movimentoManualRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<MovimentoManual> getMovimentos(){
        List<MovimentoManual> dataList = movimentoManualRepository.findAll();
        return dataList;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    @ResponseStatus
    public MovimentoManual setMovimento(@RequestBody MovimentoManual movimento){
        movimento.setDatMovimento(new Date());
        return movimentoManualRepository.save(movimento);
    }
}
