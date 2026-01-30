package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonProperty("response.created") RESPONSE_CREATED(String.valueOf("response.created"));

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
  @Valid
  private RealtimeResponse response;
 /**
  * The unique ID of the server event.
  * @return eventId
  */
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
 public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
  public RealtimeServerEventResponseCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;response.created&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeServerEventResponseCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get response
  * @return response
  */
  @JsonProperty("response")
  @NotNull
  public RealtimeResponse getResponse() {
    return response;
  }

  /**
   * Sets the <code>response</code> property.
   */
 public void setResponse(RealtimeResponse response) {
    this.response = response;
  }

  /**
   * Sets the <code>response</code> property.
   */
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

