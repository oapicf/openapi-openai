package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The monetary value in its associated currency.
 */
public class CostsResultAmount implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The numeric value of the cost.
   */
  @JsonProperty("value")
  private BigDecimal value;

  /**
   * Lowercase ISO-4217 currency e.g. \&quot;usd\&quot;
   */
  @JsonProperty("currency")
  private String currency;

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
   * Lowercase ISO-4217 currency e.g. \&quot;usd\&quot;
   * @return currency
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
