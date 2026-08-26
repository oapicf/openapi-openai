package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The monetary value in its associated currency.
 */
public class CostsResultAmount   {

    private BigDecimal value;
    private String currency;

    /**
     * Default constructor.
     */
    public CostsResultAmount() {
    // JSON-B / Jackson
    }

    /**
     * Create CostsResultAmount.
     *
     * @param value The numeric value of the cost.
     * @param currency Lowercase ISO-4217 currency e.g. \&quot;usd\&quot;
     */
    public CostsResultAmount(
        BigDecimal value, 
        String currency
    ) {
        this.value = value;
        this.currency = currency;
    }



    /**
     * The numeric value of the cost.
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Lowercase ISO-4217 currency e.g. \"usd\"
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CostsResultAmount {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

