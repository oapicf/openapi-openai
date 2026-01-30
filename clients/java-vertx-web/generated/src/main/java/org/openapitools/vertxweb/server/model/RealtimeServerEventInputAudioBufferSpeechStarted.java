package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Sent by the server when in &#x60;server_vad&#x60; mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a &#x60;input_audio_buffer.speech_stopped&#x60; event  when speech stops. The &#x60;item_id&#x60; property is the ID of the user message item  that will be created when speech stops and will also be included in the  &#x60;input_audio_buffer.speech_stopped&#x60; event (unless the client manually commits  the audio buffer during VAD activation). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventInputAudioBufferSpeechStarted   {
  
  private String eventId;


  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_SPEECH_STARTED("input_audio_buffer.speech_started");

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
  private Integer audioStartMs;
  private String itemId;

  public RealtimeServerEventInputAudioBufferSpeechStarted () {

  }

  public RealtimeServerEventInputAudioBufferSpeechStarted (String eventId, TypeEnum type, Integer audioStartMs, String itemId) {
    this.eventId = eventId;
    this.type = type;
    this.audioStartMs = audioStartMs;
    this.itemId = itemId;
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

    
  @JsonProperty("audio_start_ms")
  public Integer getAudioStartMs() {
    return audioStartMs;
  }
  public void setAudioStartMs(Integer audioStartMs) {
    this.audioStartMs = audioStartMs;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventInputAudioBufferSpeechStarted realtimeServerEventInputAudioBufferSpeechStarted = (RealtimeServerEventInputAudioBufferSpeechStarted) o;
    return Objects.equals(eventId, realtimeServerEventInputAudioBufferSpeechStarted.eventId) &&
        Objects.equals(type, realtimeServerEventInputAudioBufferSpeechStarted.type) &&
        Objects.equals(audioStartMs, realtimeServerEventInputAudioBufferSpeechStarted.audioStartMs) &&
        Objects.equals(itemId, realtimeServerEventInputAudioBufferSpeechStarted.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, audioStartMs, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventInputAudioBufferSpeechStarted {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    audioStartMs: ").append(toIndentedString(audioStartMs)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
