package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The monetary value in its associated currency.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The monetary value in its associated currency.")
public class CostsResultAmount   {
  
  private BigDecimal value;

  private String currency;

  /**
   * The numeric value of the cost.
   **/
  public CostsResultAmount value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "The numeric value of the cost.")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  /**
   * Lowercase ISO-4217 currency e.g. \&quot;usd\&quot;
   **/
  public CostsResultAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "Lowercase ISO-4217 currency e.g. \"usd\"")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

