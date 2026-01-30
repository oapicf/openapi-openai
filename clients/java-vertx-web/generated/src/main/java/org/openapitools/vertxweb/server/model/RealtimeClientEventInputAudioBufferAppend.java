package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeClientEventInputAudioBufferAppend   {
  
  private String eventId;


  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_APPEND("input_audio_buffer.append");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private String audio;

  public RealtimeClientEventInputAudioBufferAppend () {

  }

  public RealtimeClientEventInputAudioBufferAppend (String eventId, TypeEnum type, String audio) {
    this.eventId = eventId;
    this.type = type;
    this.audio = audio;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("audio")
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
    return Objects.equals(eventId, realtimeClientEventInputAudioBufferAppend.eventId) &&
        Objects.equals(type, realtimeClientEventInputAudioBufferAppend.type) &&
        Objects.equals(audio, realtimeClientEventInputAudioBufferAppend.audio);
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
