package com.food.ordering.system.order.service.domain.dto.create;

import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class OrderAddress {
    @Max(value = 50)
    private final String street;
    @Max(value = 10)
    private final String postalCode;
    @Max(value = 50)
    private final String city;
}
