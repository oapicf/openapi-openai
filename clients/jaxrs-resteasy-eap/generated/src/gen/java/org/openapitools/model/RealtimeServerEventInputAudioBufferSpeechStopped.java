package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventInputAudioBufferSpeechStopped   {
  
  private String eventId;

  /**
   * The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;.
   */
  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_SPEECH_STOPPED("input_audio_buffer.speech_stopped");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private Integer audioEndMs;
  private String itemId;

  /**
   * The unique ID of the server event.
   **/
  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.speech_stopped`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session. 
   **/
  
  @ApiModelProperty(required = true, value = "Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. ")
  @JsonProperty("audio_end_ms")
  @NotNull
  public Integer getAudioEndMs() {
    return audioEndMs;
  }
  public void setAudioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
  }

  /**
   * The ID of the user message item that will be created.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the user message item that will be created.")
  @JsonProperty("item_id")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

