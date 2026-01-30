package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * RealtimeServerEventRateLimitsUpdatedRateLimitsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner   {
  /**
   * The name of the rate limit (`requests`, `tokens`). 
   */
  public enum NameEnum {
    REQUESTS("requests"),
    
    TOKENS("tokens");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("name")
  private NameEnum name;

  @JsonProperty("limit")
  private Integer limit;

  @JsonProperty("remaining")
  private Integer remaining;

  @JsonProperty("reset_seconds")
  private BigDecimal resetSeconds;

  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rate limit (`requests`, `tokens`). 
   * @return name
   */
  @ApiModelProperty(value = "The name of the rate limit (`requests`, `tokens`). ")
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
  @ApiModelProperty(value = "The maximum allowed value for the rate limit.")
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
  @ApiModelProperty(value = "The remaining value before the limit is reached.")
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
  @ApiModelProperty(value = "Seconds until the rate limit resets.")
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

