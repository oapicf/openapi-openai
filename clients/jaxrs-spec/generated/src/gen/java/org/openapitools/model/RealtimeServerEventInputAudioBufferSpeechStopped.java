package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer. 
 **/
@ApiModel(description = "Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. ")
@JsonTypeName("RealtimeServerEventInputAudioBufferSpeechStopped")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventInputAudioBufferSpeechStopped   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  }

  @JsonCreator
  public RealtimeServerEventInputAudioBufferSpeechStopped(
    @JsonProperty(required = true, value = "event_id") String eventId,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "audio_end_ms") Integer audioEndMs,
    @JsonProperty(required = true, value = "item_id") String itemId
  ) {
    this.eventId = eventId;
    this.type = type;
    this.audioEndMs = audioEndMs;
    this.itemId = itemId;
  }

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventInputAudioBufferSpeechStopped eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty(required = true, value = "event_id")
  @NotNull public String getEventId() {
    return eventId;
  }

  @JsonProperty(required = true, value = "event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;.
   **/
  public RealtimeServerEventInputAudioBufferSpeechStopped type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.speech_stopped`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session. 
   **/
  public RealtimeServerEventInputAudioBufferSpeechStopped audioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. ")
  @JsonProperty(required = true, value = "audio_end_ms")
  @NotNull public Integer getAudioEndMs() {
    return audioEndMs;
  }

  @JsonProperty(required = true, value = "audio_end_ms")
  public void setAudioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
  }

  /**
   * The ID of the user message item that will be created.
   **/
  public RealtimeServerEventInputAudioBufferSpeechStopped itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the user message item that will be created.")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
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

