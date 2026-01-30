package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
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
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
 **/
@ApiModel(description = "Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. ")
@JsonTypeName("RealtimeServerEventConversationItemInputAudioTranscriptionFailed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed   {
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
  private String itemId;
  private Integer contentIndex;
  private RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed() {
  }

  @JsonCreator
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed(
    @JsonProperty(required = true, value = "event_id") String eventId,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "content_index") Integer contentIndex,
    @JsonProperty(required = true, value = "error") RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error
  ) {
    this.eventId = eventId;
    this.type = type;
    this.itemId = itemId;
    this.contentIndex = contentIndex;
    this.error = error;
  }

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed eventId(String eventId) {
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
   * The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;. 
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.input_audio_transcription.failed`. ")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the user message item.
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the user message item.")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the content part containing the audio.
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the content part containing the audio.")
  @JsonProperty(required = true, value = "content_index")
  @NotNull public Integer getContentIndex() {
    return contentIndex;
  }

  @JsonProperty(required = true, value = "content_index")
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailed error(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "error")
  @NotNull @Valid public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError getError() {
    return error;
  }

  @JsonProperty(required = true, value = "error")
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

