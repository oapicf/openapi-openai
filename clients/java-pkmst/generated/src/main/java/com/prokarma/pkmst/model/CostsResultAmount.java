package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The monetary value in its associated currency.
 */
@ApiModel(description = "The monetary value in its associated currency.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CostsResultAmount   {
  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("currency")
  private String currency;

  public CostsResultAmount value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The numeric value of the cost.
   * @return value
   */
  @ApiModelProperty(value = "The numeric value of the cost.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public CostsResultAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Lowercase ISO-4217 currency e.g. \"usd\"
   * @return currency
   */
  @ApiModelProperty(value = "Lowercase ISO-4217 currency e.g. \"usd\"")
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

