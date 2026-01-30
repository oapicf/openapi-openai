package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event. 
 */
@ApiModel(description = "Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventInputAudioBufferClear   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `input_audio_buffer.clear`.
   */
  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_CLEAR("input_audio_buffer.clear");

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

  public RealtimeClientEventInputAudioBufferClear eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
   */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventInputAudioBufferClear type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `input_audio_buffer.clear`.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.clear`.")
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
    RealtimeClientEventInputAudioBufferClear realtimeClientEventInputAudioBufferClear = (RealtimeClientEventInputAudioBufferClear) o;
    return Objects.equals(this.eventId, realtimeClientEventInputAudioBufferClear.eventId) &&
        Objects.equals(this.type, realtimeClientEventInputAudioBufferClear.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventInputAudioBufferClear {\n");
    
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

