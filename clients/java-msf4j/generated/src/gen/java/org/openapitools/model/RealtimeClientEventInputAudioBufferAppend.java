package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 */
@ApiModel(description = "Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventInputAudioBufferAppend   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `input_audio_buffer.append`.
   */
  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_APPEND("input_audio_buffer.append");

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

  @JsonProperty("audio")
  private String audio;

  public RealtimeClientEventInputAudioBufferAppend eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
  **/
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventInputAudioBufferAppend type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `input_audio_buffer.append`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.append`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventInputAudioBufferAppend audio(String audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
   * @return audio
  **/
  @ApiModelProperty(required = true, value = "Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. ")
  public String getAudio() {
    return audio;
  }

  public void setAudio(String audio) {
    this.audio = audio;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

