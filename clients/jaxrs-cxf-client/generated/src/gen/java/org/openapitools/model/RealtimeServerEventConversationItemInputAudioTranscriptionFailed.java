package org.openapitools.model;

import org.openapitools.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 */
@ApiModel(description="Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. ")

public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED(String.valueOf("conversation.item.input_audio_transcription.failed"));


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
  * The event type, must be `conversation.item.input_audio_transcription.failed`. 
  */
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.input_audio_transcription.failed`. ")

  private TypeEnum type;

 /**
  * The ID of the user message item.
  */
  @ApiModelProperty(required = true, value = "The ID of the user message item.")

  private String itemId;

 /**
  * The index of the content part containing the audio.
  */
  @ApiModelProperty(required = true, value = "The index of the content part containing the audio.")

  private Integer contentIndex;

  @ApiModelProperty(required = true, value = "")

  private RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;
 /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;. 
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the user message item.
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The index of the content part containing the audio.
   * @return contentIndex
  **/
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError getError() {
    return error;
  }

  public void setError(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.error = error;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed error(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.error = error;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

