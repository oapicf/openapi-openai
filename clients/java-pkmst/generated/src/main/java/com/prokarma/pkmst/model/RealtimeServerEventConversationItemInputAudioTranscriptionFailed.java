package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
 */
@ApiModel(description = "Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `conversation.item.input_audio_transcription.failed`. 
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED("conversation.item.input_audio_transcription.failed");

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

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("content_index")
  private Integer contentIndex;

  @JsonProperty("error")
  private RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
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
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.input_audio_transcription.failed`. ")
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
  @ApiModelProperty(required = true, value = "The ID of the user message item.")
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
  @ApiModelProperty(required = true, value = "The index of the content part containing the audio.")
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
  @ApiModelProperty(required = true, value = "")
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

