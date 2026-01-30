package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed   {
  
  private String eventId;


  public enum TypeEnum {
    CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED("conversation.item.input_audio_transcription.failed");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private String itemId;
  private Integer contentIndex;
  private RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed () {

  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed (String eventId, TypeEnum type, String itemId, Integer contentIndex, RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.eventId = eventId;
    this.type = type;
    this.itemId = itemId;
    this.contentIndex = contentIndex;
    this.error = error;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

    
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
    return Objects.equals(eventId, realtimeServerEventConversationItemInputAudioTranscriptionFailed.eventId) &&
        Objects.equals(type, realtimeServerEventConversationItemInputAudioTranscriptionFailed.type) &&
        Objects.equals(itemId, realtimeServerEventConversationItemInputAudioTranscriptionFailed.itemId) &&
        Objects.equals(contentIndex, realtimeServerEventConversationItemInputAudioTranscriptionFailed.contentIndex) &&
        Objects.equals(error, realtimeServerEventConversationItemInputAudioTranscriptionFailed.error);
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
