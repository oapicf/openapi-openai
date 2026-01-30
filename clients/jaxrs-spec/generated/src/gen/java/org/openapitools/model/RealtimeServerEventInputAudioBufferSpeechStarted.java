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
 * Sent by the server when in &#x60;server_vad&#x60; mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a &#x60;input_audio_buffer.speech_stopped&#x60; event  when speech stops. The &#x60;item_id&#x60; property is the ID of the user message item  that will be created when speech stops and will also be included in the  &#x60;input_audio_buffer.speech_stopped&#x60; event (unless the client manually commits  the audio buffer during VAD activation). 
 **/
@ApiModel(description = "Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). ")
@JsonTypeName("RealtimeServerEventInputAudioBufferSpeechStarted")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventInputAudioBufferSpeechStarted   {
  private String eventId;
  public enum TypeEnum {

    INPUT_AUDIO_BUFFER_SPEECH_STARTED(String.valueOf("input_audio_buffer.speech_started"));


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
  private Integer audioStartMs;
  private String itemId;

  public RealtimeServerEventInputAudioBufferSpeechStarted() {
  }

  @JsonCreator
  public RealtimeServerEventInputAudioBufferSpeechStarted(
    @JsonProperty(required = true, value = "event_id") String eventId,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "audio_start_ms") Integer audioStartMs,
    @JsonProperty(required = true, value = "item_id") String itemId
  ) {
    this.eventId = eventId;
    this.type = type;
    this.audioStartMs = audioStartMs;
    this.itemId = itemId;
  }

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventInputAudioBufferSpeechStarted eventId(String eventId) {
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
   * The event type, must be &#x60;input_audio_buffer.speech_started&#x60;.
   **/
  public RealtimeServerEventInputAudioBufferSpeechStarted type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.speech_started`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session. 
   **/
  public RealtimeServerEventInputAudioBufferSpeechStarted audioStartMs(Integer audioStartMs) {
    this.audioStartMs = audioStartMs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. ")
  @JsonProperty(required = true, value = "audio_start_ms")
  @NotNull public Integer getAudioStartMs() {
    return audioStartMs;
  }

  @JsonProperty(required = true, value = "audio_start_ms")
  public void setAudioStartMs(Integer audioStartMs) {
    this.audioStartMs = audioStartMs;
  }

  /**
   * The ID of the user message item that will be created when speech stops. 
   **/
  public RealtimeServerEventInputAudioBufferSpeechStarted itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the user message item that will be created when speech stops. ")
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
    RealtimeServerEventInputAudioBufferSpeechStarted realtimeServerEventInputAudioBufferSpeechStarted = (RealtimeServerEventInputAudioBufferSpeechStarted) o;
    return Objects.equals(this.eventId, realtimeServerEventInputAudioBufferSpeechStarted.eventId) &&
        Objects.equals(this.type, realtimeServerEventInputAudioBufferSpeechStarted.type) &&
        Objects.equals(this.audioStartMs, realtimeServerEventInputAudioBufferSpeechStarted.audioStartMs) &&
        Objects.equals(this.itemId, realtimeServerEventInputAudioBufferSpeechStarted.itemId);
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

