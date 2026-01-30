package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. ")
public class RealtimeServerEventRateLimitsUpdated   {
  
  private String eventId;


public enum TypeEnum {

    @JsonProperty("rate_limits.updated") RATE_LIMITS_UPDATED(String.valueOf("rate_limits.updated"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  private List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits = new ArrayList<>();

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventRateLimitsUpdated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }
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
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
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
  @JsonProperty("rate_limits")
  @NotNull
  public List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> getRateLimits() {
    return rateLimits;
  }
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

