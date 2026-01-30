package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel. 
 **/
@ApiModel(description = "Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. ")
@JsonTypeName("RealtimeClientEventResponseCancel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventResponseCancel   {
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
  private String responseId;

  public RealtimeClientEventResponseCancel() {
  }

  @JsonCreator
  public RealtimeClientEventResponseCancel(
    @JsonProperty(required = true, value = "type") TypeEnum type
  ) {
    this.type = type;
  }

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

  @JsonProperty("event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;response.cancel&#x60;.
   **/
  public RealtimeClientEventResponseCancel type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.cancel`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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

  @JsonProperty("response_id")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

