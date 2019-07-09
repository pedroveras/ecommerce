package com.geekshirts.catalogservice.domain;

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

    @Id
    private String sku;
    private String name;
    private String description;
    private Float price;
    private Long quantity;
    private String url;
    private String image;
}
