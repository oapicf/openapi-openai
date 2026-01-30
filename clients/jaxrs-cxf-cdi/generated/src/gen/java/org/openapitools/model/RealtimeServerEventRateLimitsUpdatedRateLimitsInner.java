package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner   {
  

public enum NameEnum {

    @JsonProperty("requests") REQUESTS(String.valueOf("requests")), @JsonProperty("tokens") TOKENS(String.valueOf("tokens"));


    private String value;

    NameEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  /**
   * The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;). 
   **/
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
   **/
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
   **/
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
   **/
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

