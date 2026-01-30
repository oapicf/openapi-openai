package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. ")
public class RealtimeClientEventInputAudioBufferClear   {
  
  private String eventId;


public enum TypeEnum {

    @JsonProperty("input_audio_buffer.clear") INPUT_AUDIO_BUFFER_CLEAR(String.valueOf("input_audio_buffer.clear"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  /**
   * Optional client-generated ID used to identify this event.
   **/
  public RealtimeClientEventInputAudioBufferClear eventId(String eventId) {
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
   * The event type, must be &#x60;input_audio_buffer.clear&#x60;.
   **/
  public RealtimeClientEventInputAudioBufferClear type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.clear`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

