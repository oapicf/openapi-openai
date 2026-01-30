package org.openapitools.model;

import org.openapitools.model.RealtimeResponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 */
@ApiModel(description="Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. ")

public class RealtimeServerEventResponseCreated  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

RESPONSE_CREATED(String.valueOf("response.created"));


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
  * The event type, must be `response.created`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.created`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  private RealtimeResponse response;
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

  public RealtimeServerEventResponseCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;response.created&#x60;.
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

  public RealtimeServerEventResponseCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get response
   * @return response
  **/
  @JsonProperty("response")
  public RealtimeResponse getResponse() {
    return response;
  }

  public void setResponse(RealtimeResponse response) {
    this.response = response;
  }

  public RealtimeServerEventResponseCreated response(RealtimeResponse response) {
    this.response = response;
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
    RealtimeServerEventResponseCreated realtimeServerEventResponseCreated = (RealtimeServerEventResponseCreated) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseCreated.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseCreated.type) &&
        Objects.equals(this.response, realtimeServerEventResponseCreated.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseCreated {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

