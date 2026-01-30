package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Returned when the input audio buffer is cleared by the client with a  &#x60;input_audio_buffer.clear&#x60; event. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventInputAudioBufferCleared   {
  
  private String eventId;


  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_CLEARED("input_audio_buffer.cleared");

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

  public RealtimeServerEventInputAudioBufferCleared () {

  }

  public RealtimeServerEventInputAudioBufferCleared (String eventId, TypeEnum type) {
    this.eventId = eventId;
    this.type = type;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventInputAudioBufferCleared realtimeServerEventInputAudioBufferCleared = (RealtimeServerEventInputAudioBufferCleared) o;
    return Objects.equals(eventId, realtimeServerEventInputAudioBufferCleared.eventId) &&
        Objects.equals(type, realtimeServerEventInputAudioBufferCleared.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventInputAudioBufferCleared {\n");
    
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
