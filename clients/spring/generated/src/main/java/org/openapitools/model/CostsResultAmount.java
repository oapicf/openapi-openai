package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The monetary value in its associated currency.
 */

@Schema(name = "CostsResult_amount", description = "The monetary value in its associated currency.")
@JsonTypeName("CostsResult_amount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CostsResultAmount {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal value;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String currency;

  public CostsResultAmount value(@Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The numeric value of the cost.
   * @return value
   */
  @Valid 
  @Schema(name = "value", description = "The numeric value of the cost.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable BigDecimal getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(@Nullable BigDecimal value) {
    this.value = value;
  }

  public CostsResultAmount currency(@Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Lowercase ISO-4217 currency e.g. \"usd\"
   * @return currency
   */
  
  @Schema(name = "currency", description = "Lowercase ISO-4217 currency e.g. \"usd\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public @Nullable String getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(@Nullable String currency) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

