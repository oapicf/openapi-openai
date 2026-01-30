package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The monetary value in its associated currency.
 */
@ApiModel(description="The monetary value in its associated currency.")

public class CostsResultAmount  {
  
 /**
  * The numeric value of the cost.
  */
  @ApiModelProperty(value = "The numeric value of the cost.")
  @Valid
  private BigDecimal value;

 /**
  * Lowercase ISO-4217 currency e.g. \"usd\"
  */
  @ApiModelProperty(value = "Lowercase ISO-4217 currency e.g. \"usd\"")
  private String currency;
 /**
  * The numeric value of the cost.
  * @return value
  */
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public CostsResultAmount value(BigDecimal value) {
    this.value = value;
    return this;
  }

 /**
  * Lowercase ISO-4217 currency e.g. \&quot;usd\&quot;
  * @return currency
  */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public CostsResultAmount currency(String currency) {
    this.currency = currency;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostsResultAmount costsResultAmount = (CostsResultAmount) o;
    return Objects.equals(this.value, costsResultAmount.value) &&
        Objects.equals(this.currency, costsResultAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currency);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

