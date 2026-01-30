package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 */
@ApiModel(description="Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. ")

public class RealtimeClientEventInputAudioBufferClear  {
  
 /**
  * Optional client-generated ID used to identify this event.
  */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")

  private String eventId;

public enum TypeEnum {

INPUT_AUDIO_BUFFER_CLEAR(String.valueOf("input_audio_buffer.clear"));


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
  * The event type, must be `input_audio_buffer.clear`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.clear`.")

  private TypeEnum type;
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

  public RealtimeClientEventInputAudioBufferClear eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;input_audio_buffer.clear&#x60;.
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

  public RealtimeClientEventInputAudioBufferClear type(TypeEnum type) {
    this.type = type;
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
    RealtimeClientEventInputAudioBufferClear realtimeClientEventInputAudioBufferClear = (RealtimeClientEventInputAudioBufferClear) o;
    return Objects.equals(this.eventId, realtimeClientEventInputAudioBufferClear.eventId) &&
        Objects.equals(this.type, realtimeClientEventInputAudioBufferClear.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventInputAudioBufferClear {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

