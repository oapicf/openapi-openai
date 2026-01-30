package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RealtimeServerEventRateLimitsUpdatedRateLimitsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner   {
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

    @Override
    @JsonValue
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

  @JsonProperty("name")
  
  private NameEnum name;

  @JsonProperty("limit")
  
  private Integer limit;

  @JsonProperty("remaining")
  
  private Integer remaining;

  @JsonProperty("reset_seconds")
  @Valid

  private BigDecimal resetSeconds;

  public RealtimeServerEventRateLimitsUpdatedRateLimitsInner name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the rate limit (`requests`, `tokens`). 
   * @return name
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

