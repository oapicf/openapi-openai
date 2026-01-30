package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
 */
@ApiModel(description="Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. ")

public class RealtimeClientEventResponseCancel  {
  
 /**
  * Optional client-generated ID used to identify this event.
  */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")

  private String eventId;

public enum TypeEnum {

RESPONSE_CANCEL(String.valueOf("response.cancel"));


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

 /**
  * The event type, must be `response.cancel`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.cancel`.")

  private TypeEnum type;

 /**
  * A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
  */
  @ApiModelProperty(value = "A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. ")

  private String responseId;
 /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventResponseCancel eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;response.cancel&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventResponseCancel type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
   * @return responseId
  **/
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeClientEventResponseCancel responseId(String responseId) {
    this.responseId = responseId;
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
    RealtimeClientEventResponseCancel realtimeClientEventResponseCancel = (RealtimeClientEventResponseCancel) o;
    return Objects.equals(this.eventId, realtimeClientEventResponseCancel.eventId) &&
        Objects.equals(this.type, realtimeClientEventResponseCancel.type) &&
        Objects.equals(this.responseId, realtimeClientEventResponseCancel.responseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventResponseCancel {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
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

