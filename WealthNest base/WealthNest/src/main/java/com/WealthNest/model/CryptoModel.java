package com.WealthNest.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cryptos")
public class CryptoModel {
    @Setter
    @Getter
    @Id
    private String id;
    private String name;
    private String symbol;
    private double priceUsd;
    private double priceEuro;

}
