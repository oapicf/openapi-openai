package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CostsResultAmount {
    /* The numeric value of the cost. */
    BigDecimal value
    /* Lowercase ISO-4217 currency e.g. \"usd\" */
    String currency
}
