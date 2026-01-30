package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when the model-generated transcription of audio output is updated. 
 */

@Schema(name = "RealtimeServerEventResponseAudioTranscriptDelta", description = "Returned when the model-generated transcription of audio output is updated. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseAudioTranscriptDelta {

  private String eventId;

  /**
   * The event type, must be `response.audio_transcript.delta`.
   */
  public enum TypeEnum {
    RESPONSE_AUDIO_TRANSCRIPT_DELTA("response.audio_transcript.delta");

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

  private String responseId;

  private String itemId;

  private Integer outputIndex;

  private Integer contentIndex;

  private String delta;

  public RealtimeServerEventResponseAudioTranscriptDelta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventResponseAudioTranscriptDelta(String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, Integer contentIndex, String delta) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.contentIndex = contentIndex;
    this.delta = delta;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta eventId(String eventId) {
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

  public RealtimeServerEventResponseAudioTranscriptDelta type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.audio_transcript.delta`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.audio_transcript.delta`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  /**
   * The ID of the response.
   * @return responseId
   */
  @NotNull 
  @Schema(name = "response_id", description = "The ID of the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the item.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  /**
   * The index of the output item in the response.
   * @return outputIndex
   */
  @NotNull 
  @Schema(name = "output_index", description = "The index of the output item in the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part in the item's content array.
   * @return contentIndex
   */
  @NotNull 
  @Schema(name = "content_index", description = "The index of the content part in the item's content array.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta delta(String delta) {
    this.delta = delta;
    return this;
  }

  /**
   * The transcript delta.
   * @return delta
   */
  @NotNull 
  @Schema(name = "delta", description = "The transcript delta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("delta")
  public String getDelta() {
    return delta;
  }

  public void setDelta(String delta) {
    this.delta = delta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseAudioTranscriptDelta realtimeServerEventResponseAudioTranscriptDelta = (RealtimeServerEventResponseAudioTranscriptDelta) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseAudioTranscriptDelta.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseAudioTranscriptDelta.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseAudioTranscriptDelta.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseAudioTranscriptDelta.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseAudioTranscriptDelta.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseAudioTranscriptDelta.contentIndex) &&
        Objects.equals(this.delta, realtimeServerEventResponseAudioTranscriptDelta.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseAudioTranscriptDelta {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

