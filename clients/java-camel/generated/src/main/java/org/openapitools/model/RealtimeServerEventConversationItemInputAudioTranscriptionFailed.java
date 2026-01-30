package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
 */

@Schema(name = "RealtimeServerEventConversationItemInputAudioTranscriptionFailed", description = "Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed {

  private String eventId;

  /**
   * The event type, must be `conversation.item.input_audio_transcription.failed`. 
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED("conversation.item.input_audio_transcription.failed");

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

  private String itemId;

  private Integer contentIndex;

  private RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed(String eventId, TypeEnum type, String itemId, Integer contentIndex, RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.eventId = eventId;
    this.type = type;
    this.itemId = itemId;
    this.contentIndex = contentIndex;
    this.error = error;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed eventId(String eventId) {
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

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `conversation.item.input_audio_transcription.failed`. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `conversation.item.input_audio_transcription.failed`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the user message item.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the user message item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part containing the audio.
   * @return contentIndex
   */
  @NotNull 
  @Schema(name = "content_index", description = "The index of the content part containing the audio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed error(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @NotNull @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error")
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError getError() {
    return error;
  }

  public void setError(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed realtimeServerEventConversationItemInputAudioTranscriptionFailed = (RealtimeServerEventConversationItemInputAudioTranscriptionFailed) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationItemInputAudioTranscriptionFailed.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationItemInputAudioTranscriptionFailed.type) &&
        Objects.equals(this.itemId, realtimeServerEventConversationItemInputAudioTranscriptionFailed.itemId) &&
        Objects.equals(this.contentIndex, realtimeServerEventConversationItemInputAudioTranscriptionFailed.contentIndex) &&
        Objects.equals(this.error, realtimeServerEventConversationItemInputAudioTranscriptionFailed.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId, contentIndex, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemInputAudioTranscriptionFailed {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

