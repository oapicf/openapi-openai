package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;

/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */
@ApiModel(description = "Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventRateLimitsUpdated   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `rate_limits.updated`.
   */
  public enum TypeEnum {
    RATE_LIMITS_UPDATED("rate_limits.updated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("rate_limits")
  private List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits = new ArrayList<>();

  public RealtimeServerEventRateLimitsUpdated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventRateLimitsUpdated type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `rate_limits.updated`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The event type, must be `rate_limits.updated`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventRateLimitsUpdated rateLimits(List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  public RealtimeServerEventRateLimitsUpdated addRateLimitsItem(RealtimeServerEventRateLimitsUpdatedRateLimitsInner rateLimitsItem) {
    this.rateLimits.add(rateLimitsItem);
    return this;
  }

   /**
   * List of rate limit information.
   * @return rateLimits
  **/
  @ApiModelProperty(required = true, value = "List of rate limit information.")
  public List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> getRateLimits() {
    return rateLimits;
  }

  public void setRateLimits(List<@Valid RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
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

