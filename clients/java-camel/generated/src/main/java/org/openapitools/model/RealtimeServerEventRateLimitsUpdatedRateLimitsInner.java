package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RealtimeServerEventRateLimitsUpdatedRateLimitsInner
 */

@JsonTypeName("RealtimeServerEventRateLimitsUpdated_rate_limits_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner {

  /**
   * The name of the rate limit (`requests`, `tokens`). 
   */
  public enum NameEnum {
    REQUESTS("requests"),
    
    TOKENS("tokens");

    private final String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NameEnum name;

  private Integer limit;

  private Integer remaining;

  private BigDecimal resetSeconds;

  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rate limit (`requests`, `tokens`). 
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the rate limit (`requests`, `tokens`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The maximum allowed value for the rate limit.
   * @return limit
   */
  
  @Schema(name = "limit", description = "The maximum allowed value for the rate limit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner remaining(Integer remaining) {
    this.remaining = remaining;
    return this;
  }

  /**
   * The remaining value before the limit is reached.
   * @return remaining
   */
  
  @Schema(name = "remaining", description = "The remaining value before the limit is reached.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remaining")
  public Integer getRemaining() {
    return remaining;
  }

  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }

  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner resetSeconds(BigDecimal resetSeconds) {
    this.resetSeconds = resetSeconds;
    return this;
  }

  /**
   * Seconds until the rate limit resets.
   * @return resetSeconds
   */
  @Valid 
  @Schema(name = "reset_seconds", description = "Seconds until the rate limit resets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reset_seconds")
  public BigDecimal getResetSeconds() {
    return resetSeconds;
  }

  public void setResetSeconds(BigDecimal resetSeconds) {
    this.resetSeconds = resetSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventRateLimitsUpdatedRateLimitsInner realtimeServerEventRateLimitsUpdatedRateLimitsInner = (RealtimeServerEventRateLimitsUpdatedRateLimitsInner) o;
    return Objects.equals(this.name, realtimeServerEventRateLimitsUpdatedRateLimitsInner.name) &&
        Objects.equals(this.limit, realtimeServerEventRateLimitsUpdatedRateLimitsInner.limit) &&
        Objects.equals(this.remaining, realtimeServerEventRateLimitsUpdatedRateLimitsInner.remaining) &&
        Objects.equals(this.resetSeconds, realtimeServerEventRateLimitsUpdatedRateLimitsInner.resetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, limit, remaining, resetSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventRateLimitsUpdatedRateLimitsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    resetSeconds: ").append(toIndentedString(resetSeconds)).append("\n");
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

