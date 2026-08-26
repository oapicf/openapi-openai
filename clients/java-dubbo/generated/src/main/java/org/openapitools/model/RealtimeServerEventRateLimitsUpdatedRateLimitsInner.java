package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;). 
   */
  @JsonProperty("name")
  private String name;

  /**
   * The maximum allowed value for the rate limit.
   */
  @JsonProperty("limit")
  private Integer limit;

  /**
   * The remaining value before the limit is reached.
   */
  @JsonProperty("remaining")
  private Integer remaining;

  /**
   * Seconds until the rate limit resets.
   */
  @JsonProperty("reset_seconds")
  private BigDecimal resetSeconds;

  /**
   * The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;). 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The maximum allowed value for the rate limit.
   * @return limit
   */
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * The remaining value before the limit is reached.
   * @return remaining
   */
  public Integer getRemaining() {
    return remaining;
  }

  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }

  /**
   * Seconds until the rate limit resets.
   * @return resetSeconds
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
