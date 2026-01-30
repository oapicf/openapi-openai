/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner   {
  


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
      return value;
    }
  }

  private NameEnum name;
  private Integer limit;
  private Integer remaining;
  private BigDecimal resetSeconds;

  /**
   * The name of the rate limit (`requests`, `tokens`). 
   */
  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner name(NameEnum name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the rate limit (`requests`, `tokens`). ")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  /**
   * The maximum allowed value for the rate limit.
   */
  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum allowed value for the rate limit.")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * The remaining value before the limit is reached.
   */
  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner remaining(Integer remaining) {
    this.remaining = remaining;
    return this;
  }

  
  @ApiModelProperty(value = "The remaining value before the limit is reached.")
  @JsonProperty("remaining")
  public Integer getRemaining() {
    return remaining;
  }
  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }

  /**
   * Seconds until the rate limit resets.
   */
  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner resetSeconds(BigDecimal resetSeconds) {
    this.resetSeconds = resetSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "Seconds until the rate limit resets.")
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
    return Objects.equals(name, realtimeServerEventRateLimitsUpdatedRateLimitsInner.name) &&
        Objects.equals(limit, realtimeServerEventRateLimitsUpdatedRateLimitsInner.limit) &&
        Objects.equals(remaining, realtimeServerEventRateLimitsUpdatedRateLimitsInner.remaining) &&
        Objects.equals(resetSeconds, realtimeServerEventRateLimitsUpdatedRateLimitsInner.resetSeconds);
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

