package com.storemanagement.database.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.storemanagement.database.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PurchasePageDTO {
    private Long id;

    private Product product;

    private BigDecimal quantity;

    private BigDecimal  price;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Europe/Sofia")
    private LocalDateTime createdAt;
}
