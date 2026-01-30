package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer. 
 */

@Schema(name = "RealtimeServerEventInputAudioBufferSpeechStopped", description = "Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventInputAudioBufferSpeechStopped {

  private String eventId;

  /**
   * The event type, must be `input_audio_buffer.speech_stopped`.
   */
  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_SPEECH_STOPPED("input_audio_buffer.speech_stopped");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private TypeEnum type;

  private Integer audioEndMs;

  private String itemId;

  public RealtimeServerEventInputAudioBufferSpeechStopped() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventInputAudioBufferSpeechStopped(String eventId, TypeEnum type, Integer audioEndMs, String itemId) {
    this.eventId = eventId;
    this.type = type;
    this.audioEndMs = audioEndMs;
    this.itemId = itemId;
  }

  public RealtimeServerEventInputAudioBufferSpeechStopped eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @NotNull 
  @Schema(name = "event_id", description = "The unique ID of the server event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventInputAudioBufferSpeechStopped type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `input_audio_buffer.speech_stopped`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `input_audio_buffer.speech_stopped`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventInputAudioBufferSpeechStopped audioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
    return this;
  }

  /**
   * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
   * @return audioEndMs
   */
  @NotNull 
  @Schema(name = "audio_end_ms", description = "Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("audio_end_ms")
  public Integer getAudioEndMs() {
    return audioEndMs;
  }

  public void setAudioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
  }

  public RealtimeServerEventInputAudioBufferSpeechStopped itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the user message item that will be created.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the user message item that will be created.", requiredMode = Schema.RequiredMode.REQUIRED)
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

