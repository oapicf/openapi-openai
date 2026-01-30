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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner;



/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */

@ApiModel(description = "Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   * The unique ID of the server event.
   */
  public RealtimeServerEventRateLimitsUpdated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be `rate_limits.updated`.
   */
  public RealtimeServerEventRateLimitsUpdated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `rate_limits.updated`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * List of rate limit information.
   */
  public RealtimeServerEventRateLimitsUpdated rateLimits(List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of rate limit information.")
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

