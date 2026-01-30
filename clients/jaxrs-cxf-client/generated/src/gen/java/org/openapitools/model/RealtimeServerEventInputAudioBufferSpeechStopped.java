package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 */
@ApiModel(description="Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. ")

public class RealtimeServerEventInputAudioBufferSpeechStopped  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

INPUT_AUDIO_BUFFER_SPEECH_STOPPED(String.valueOf("input_audio_buffer.speech_stopped"));


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
  * The event type, must be `input_audio_buffer.speech_stopped`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.speech_stopped`.")

  private TypeEnum type;

 /**
  * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
  */
  @ApiModelProperty(required = true, value = "Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. ")

  private Integer audioEndMs;

 /**
  * The ID of the user message item that will be created.
  */
  @ApiModelProperty(required = true, value = "The ID of the user message item that will be created.")

  private String itemId;
 /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventInputAudioBufferSpeechStopped eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;.
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

  public RealtimeServerEventInputAudioBufferSpeechStopped type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session. 
   * @return audioEndMs
  **/
  @JsonProperty("audio_end_ms")
  public Integer getAudioEndMs() {
    return audioEndMs;
  }

  public void setAudioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
  }

  public RealtimeServerEventInputAudioBufferSpeechStopped audioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
    return this;
  }

 /**
   * The ID of the user message item that will be created.
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventInputAudioBufferSpeechStopped itemId(String itemId) {
    this.itemId = itemId;
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
    RealtimeServerEventInputAudioBufferSpeechStopped realtimeServerEventInputAudioBufferSpeechStopped = (RealtimeServerEventInputAudioBufferSpeechStopped) o;
    return Objects.equals(this.eventId, realtimeServerEventInputAudioBufferSpeechStopped.eventId) &&
        Objects.equals(this.type, realtimeServerEventInputAudioBufferSpeechStopped.type) &&
        Objects.equals(this.audioEndMs, realtimeServerEventInputAudioBufferSpeechStopped.audioEndMs) &&
        Objects.equals(this.itemId, realtimeServerEventInputAudioBufferSpeechStopped.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, audioEndMs, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventInputAudioBufferSpeechStopped {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    audioEndMs: ").append(toIndentedString(audioEndMs)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

