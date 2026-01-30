package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;

/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventRateLimitsUpdated   {
  
  private String eventId;


  public enum TypeEnum {
    RATE_LIMITS_UPDATED("rate_limits.updated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits = new ArrayList<>();

  public RealtimeServerEventRateLimitsUpdated () {

  }

  public RealtimeServerEventRateLimitsUpdated (String eventId, TypeEnum type, List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.eventId = eventId;
    this.type = type;
    this.rateLimits = rateLimits;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("rate_limits")
  public List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> getRateLimits() {
    return rateLimits;
  }
  public void setRateLimits(List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
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
    return Objects.equals(eventId, realtimeServerEventRateLimitsUpdated.eventId) &&
        Objects.equals(type, realtimeServerEventRateLimitsUpdated.type) &&
        Objects.equals(rateLimits, realtimeServerEventRateLimitsUpdated.rateLimits);
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
