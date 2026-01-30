package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel. 
 **/

@ApiModel(description = "Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventResponseCancel   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `response.cancel`.
   */
  public enum TypeEnum {
    RESPONSE_CANCEL("response.cancel");

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

  @JsonProperty("response_id")
  private String responseId;

  /**
   * Optional client-generated ID used to identify this event.
   **/
  public RealtimeClientEventResponseCancel eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be `response.cancel`.
   **/
  public RealtimeClientEventResponseCancel type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.cancel`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
   **/
  public RealtimeClientEventResponseCancel responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  
  @ApiModelProperty(value = "A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. ")
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
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
    return Objects.equals(eventId, realtimeClientEventResponseCancel.eventId) &&
        Objects.equals(type, realtimeClientEventResponseCancel.type) &&
        Objects.equals(responseId, realtimeClientEventResponseCancel.responseId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

