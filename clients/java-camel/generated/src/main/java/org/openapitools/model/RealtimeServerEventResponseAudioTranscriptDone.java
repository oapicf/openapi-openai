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
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */

@Schema(name = "RealtimeServerEventResponseAudioTranscriptDone", description = "Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseAudioTranscriptDone {

  private String eventId;

  /**
   * The event type, must be `response.audio_transcript.done`.
   */
  public enum TypeEnum {
    RESPONSE_AUDIO_TRANSCRIPT_DONE("response.audio_transcript.done");

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

  private String transcript;

  public RealtimeServerEventResponseAudioTranscriptDone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventResponseAudioTranscriptDone(String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, Integer contentIndex, String transcript) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.contentIndex = contentIndex;
    this.transcript = transcript;
  }

  public RealtimeServerEventResponseAudioTranscriptDone eventId(String eventId) {
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

  public RealtimeServerEventResponseAudioTranscriptDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.audio_transcript.done`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.audio_transcript.done`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseAudioTranscriptDone responseId(String responseId) {
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

  public RealtimeServerEventResponseAudioTranscriptDone itemId(String itemId) {
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

  public RealtimeServerEventResponseAudioTranscriptDone outputIndex(Integer outputIndex) {
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

  public RealtimeServerEventResponseAudioTranscriptDone contentIndex(Integer contentIndex) {
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

  public RealtimeServerEventResponseAudioTranscriptDone transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * The final transcript of the audio.
   * @return transcript
   */
  @NotNull 
  @Schema(name = "transcript", description = "The final transcript of the audio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transcript")
  public String getTranscript() {
    return transcript;
  }

  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseAudioTranscriptDone realtimeServerEventResponseAudioTranscriptDone = (RealtimeServerEventResponseAudioTranscriptDone) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseAudioTranscriptDone.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseAudioTranscriptDone.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseAudioTranscriptDone.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseAudioTranscriptDone.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseAudioTranscriptDone.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseAudioTranscriptDone.contentIndex) &&
        Objects.equals(this.transcript, realtimeServerEventResponseAudioTranscriptDone.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseAudioTranscriptDone {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
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

