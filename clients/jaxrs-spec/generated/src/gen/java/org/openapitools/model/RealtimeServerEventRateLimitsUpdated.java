package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 **/
@ApiModel(description = "Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. ")
@JsonTypeName("RealtimeServerEventRateLimitsUpdated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventRateLimitsUpdated   {
  private String eventId;
  public enum TypeEnum {

    RATE_LIMITS_UPDATED(String.valueOf("rate_limits.updated"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;
  private @Valid List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits = new ArrayList<>();

  public RealtimeServerEventRateLimitsUpdated() {
  }

  @JsonCreator
  public RealtimeServerEventRateLimitsUpdated(
    @JsonProperty(required = true, value = "event_id") String eventId,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "rate_limits") List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits
  ) {
    this.eventId = eventId;
    this.type = type;
    this.rateLimits = rateLimits;
  }

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventRateLimitsUpdated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty(required = true, value = "event_id")
  @NotNull public String getEventId() {
    return eventId;
  }

  @JsonProperty(required = true, value = "event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;rate_limits.updated&#x60;.
   **/
  public RealtimeServerEventRateLimitsUpdated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `rate_limits.updated`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * List of rate limit information.
   **/
  public RealtimeServerEventRateLimitsUpdated rateLimits(List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of rate limit information.")
  @JsonProperty(required = true, value = "rate_limits")
  @NotNull @Valid public List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> getRateLimits() {
    return rateLimits;
  }

  @JsonProperty(required = true, value = "rate_limits")
  public void setRateLimits(List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
  }

  public RealtimeServerEventRateLimitsUpdated addRateLimitsItem(RealtimeServerEventRateLimitsUpdatedRateLimitsInner rateLimitsItem) {
    if (this.rateLimits == null) {
      this.rateLimits = new ArrayList<>();
    }

    this.rateLimits.add(rateLimitsItem);
    return this;
  }

  public RealtimeServerEventRateLimitsUpdated removeRateLimitsItem(RealtimeServerEventRateLimitsUpdatedRateLimitsInner rateLimitsItem) {
    if (rateLimitsItem != null && this.rateLimits != null) {
      this.rateLimits.remove(rateLimitsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventRateLimitsUpdated realtimeServerEventRateLimitsUpdated = (RealtimeServerEventRateLimitsUpdated) o;
    return Objects.equals(this.eventId, realtimeServerEventRateLimitsUpdated.eventId) &&
        Objects.equals(this.type, realtimeServerEventRateLimitsUpdated.type) &&
        Objects.equals(this.rateLimits, realtimeServerEventRateLimitsUpdated.rateLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, rateLimits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventRateLimitsUpdated {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rateLimits: ").append(toIndentedString(rateLimits)).append("\n");
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

