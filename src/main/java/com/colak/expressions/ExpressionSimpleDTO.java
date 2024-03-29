package com.colak.expressions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class ExpressionSimpleDTO {
    private String street;
    private String city;
    private Integer total;

    public String getAddress () {
        return city + " " + street;
    }
}
