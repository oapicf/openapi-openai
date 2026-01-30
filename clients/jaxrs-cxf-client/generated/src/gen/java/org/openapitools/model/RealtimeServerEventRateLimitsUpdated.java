package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */
@ApiModel(description="Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. ")

public class RealtimeServerEventRateLimitsUpdated  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

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

 /**
  * The event type, must be `rate_limits.updated`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `rate_limits.updated`.")

  private TypeEnum type;

 /**
  * List of rate limit information.
  */
  @ApiModelProperty(required = true, value = "List of rate limit information.")

  private List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits = new ArrayList<>();
 /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventRateLimitsUpdated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;rate_limits.updated&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventRateLimitsUpdated type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * List of rate limit information.
   * @return rateLimits
  **/
  @JsonProperty("rate_limits")
  public List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> getRateLimits() {
    return rateLimits;
  }

  public void setRateLimits(List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
  }

  public RealtimeServerEventRateLimitsUpdated rateLimits(List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public RealtimeServerEventRateLimitsUpdated addRateLimitsItem(RealtimeServerEventRateLimitsUpdatedRateLimitsInner rateLimitsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

