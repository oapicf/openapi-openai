package apimodels;

import apimodels.RealtimeResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the &#x60;response.done&#x60; event will  include all output Items in the Response but will omit the raw audio data. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeServerEventResponseDone   {
  @JsonProperty("event_id")
  @NotNull

  private String eventId;

  /**
   * The event type, must be `response.done`.
   */
  public enum TypeEnum {
    RESPONSE_DONE("response.done");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("response")
  @NotNull
@Valid

  private RealtimeResponse response;

  public RealtimeServerEventResponseDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `response.done`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseDone response(RealtimeResponse response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  public RealtimeResponse getResponse() {
    return response;
  }

  public void setResponse(RealtimeResponse response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseDone realtimeServerEventResponseDone = (RealtimeServerEventResponseDone) o;
    return Objects.equals(eventId, realtimeServerEventResponseDone.eventId) &&
        Objects.equals(type, realtimeServerEventResponseDone.type) &&
        Objects.equals(response, realtimeServerEventResponseDone.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, response);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseDone {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

