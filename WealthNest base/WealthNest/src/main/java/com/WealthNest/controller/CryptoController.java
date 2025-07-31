package com.WealthNest.controller;

import com.WealthNest.model.CryptoModel;
import com.WealthNest.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/crypto")
@CrossOrigin(origins = "*")  // For frontend access
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;

    @GetMapping("/fetch")
    public List<CryptoModel> fetchAndStore() {
        return cryptoService.fetchAndSaveCryptos();
    }

    @GetMapping
    public List<CryptoModel> getAll() {
        return cryptoService.getAllCryptos();
    }
}