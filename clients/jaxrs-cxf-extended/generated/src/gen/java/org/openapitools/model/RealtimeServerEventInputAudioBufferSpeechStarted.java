package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
 */
@ApiModel(description="Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). ")

public class RealtimeServerEventInputAudioBufferSpeechStarted  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("input_audio_buffer.speech_started") INPUT_AUDIO_BUFFER_SPEECH_STARTED(String.valueOf("input_audio_buffer.speech_started"));

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
  * The event type, must be `input_audio_buffer.speech_started`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.speech_started`.")
  private TypeEnum type;

 /**
  * Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
  */
  @ApiModelProperty(required = true, value = "Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. ")
  private Integer audioStartMs;

 /**
  * The ID of the user message item that will be created when speech stops. 
  */
  @ApiModelProperty(required = true, value = "The ID of the user message item that will be created when speech stops. ")
  private String itemId;
 /**
  * The unique ID of the server event.
  * @return eventId
  */
  @JsonProperty("event_id")
  @NotNull
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
  public RealtimeServerEventInputAudioBufferSpeechStarted eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;input_audio_buffer.speech_started&#x60;.
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
  public RealtimeServerEventInputAudioBufferSpeechStarted type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session. 
  * @return audioStartMs
  */
  @JsonProperty("audio_start_ms")
  @NotNull
  public Integer getAudioStartMs() {
    return audioStartMs;
  }

  /**
   * Sets the <code>audioStartMs</code> property.
   */
 public void setAudioStartMs(Integer audioStartMs) {
    this.audioStartMs = audioStartMs;
  }

  /**
   * Sets the <code>audioStartMs</code> property.
   */
  public RealtimeServerEventInputAudioBufferSpeechStarted audioStartMs(Integer audioStartMs) {
    this.audioStartMs = audioStartMs;
    return this;
  }

 /**
  * The ID of the user message item that will be created when speech stops. 
  * @return itemId
  */
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public RealtimeServerEventInputAudioBufferSpeechStarted itemId(String itemId) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

