package com.WealthNest.service;

import com.WealthNest.model.CryptoModel;
import com.WealthNest.repository.CryptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class CryptoService {
    @Autowired
    private CryptoRepository cryptoRepository;

    private final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd";

    public List<CryptoModel> fetchAndSaveCryptos() {
        RestTemplate restTemplate = new RestTemplate();
        CryptoModel[] cryptos = restTemplate.getForObject(API_URL, CryptoModel[].class);

        if (cryptos != null) {
            return cryptoRepository.saveAll(Arrays.asList(cryptos));
        }

        return List.of();
    }

    public List<CryptoModel> getAllCryptos() {
        return cryptoRepository.findAll();
    }
}
