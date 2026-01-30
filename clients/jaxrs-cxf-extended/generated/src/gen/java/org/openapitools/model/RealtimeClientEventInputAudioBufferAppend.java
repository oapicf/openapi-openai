package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 */
@ApiModel(description="Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. ")

public class RealtimeClientEventInputAudioBufferAppend  {
  
 /**
  * Optional client-generated ID used to identify this event.
  */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("input_audio_buffer.append") INPUT_AUDIO_BUFFER_APPEND(String.valueOf("input_audio_buffer.append"));

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
  * The event type, must be `input_audio_buffer.append`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.append`.")
  private TypeEnum type;

 /**
  * Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
  */
  @ApiModelProperty(required = true, value = "Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. ")
  private String audio;
 /**
  * Optional client-generated ID used to identify this event.
  * @return eventId
  */
  @JsonProperty("event_id")
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
  public RealtimeClientEventInputAudioBufferAppend eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;input_audio_buffer.append&#x60;.
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
  public RealtimeClientEventInputAudioBufferAppend type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration. 
  * @return audio
  */
  @JsonProperty("audio")
  @NotNull
  public String getAudio() {
    return audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
 public void setAudio(String audio) {
    this.audio = audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
  public RealtimeClientEventInputAudioBufferAppend audio(String audio) {
    this.audio = audio;
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
    RealtimeClientEventInputAudioBufferAppend realtimeClientEventInputAudioBufferAppend = (RealtimeClientEventInputAudioBufferAppend) o;
    return Objects.equals(this.eventId, realtimeClientEventInputAudioBufferAppend.eventId) &&
        Objects.equals(this.type, realtimeClientEventInputAudioBufferAppend.type) &&
        Objects.equals(this.audio, realtimeClientEventInputAudioBufferAppend.audio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, audio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventInputAudioBufferAppend {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

