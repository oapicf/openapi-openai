package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
 */
@ApiModel(description="Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. ")

public class RealtimeServerEventConversationItemTruncated  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("conversation.item.truncated") CONVERSATION_ITEM_TRUNCATED(String.valueOf("conversation.item.truncated"));

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
  * The event type, must be `conversation.item.truncated`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.truncated`.")
  private TypeEnum type;

 /**
  * The ID of the assistant message item that was truncated.
  */
  @ApiModelProperty(required = true, value = "The ID of the assistant message item that was truncated.")
  private String itemId;

 /**
  * The index of the content part that was truncated.
  */
  @ApiModelProperty(required = true, value = "The index of the content part that was truncated.")
  private Integer contentIndex;

 /**
  * The duration up to which the audio was truncated, in milliseconds. 
  */
  @ApiModelProperty(required = true, value = "The duration up to which the audio was truncated, in milliseconds. ")
  private Integer audioEndMs;
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
  public RealtimeServerEventConversationItemTruncated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;conversation.item.truncated&#x60;.
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
  public RealtimeServerEventConversationItemTruncated type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The ID of the assistant message item that was truncated.
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
  public RealtimeServerEventConversationItemTruncated itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
  * The index of the content part that was truncated.
  * @return contentIndex
  */
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }

  /**
   * Sets the <code>contentIndex</code> property.
   */
 public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   * Sets the <code>contentIndex</code> property.
   */
  public RealtimeServerEventConversationItemTruncated contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

 /**
  * The duration up to which the audio was truncated, in milliseconds. 
  * @return audioEndMs
  */
  @JsonProperty("audio_end_ms")
  @NotNull
  public Integer getAudioEndMs() {
    return audioEndMs;
  }

  /**
   * Sets the <code>audioEndMs</code> property.
   */
 public void setAudioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
  }

  /**
   * Sets the <code>audioEndMs</code> property.
   */
  public RealtimeServerEventConversationItemTruncated audioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
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
    RealtimeServerEventConversationItemTruncated realtimeServerEventConversationItemTruncated = (RealtimeServerEventConversationItemTruncated) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationItemTruncated.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationItemTruncated.type) &&
        Objects.equals(this.itemId, realtimeServerEventConversationItemTruncated.itemId) &&
        Objects.equals(this.contentIndex, realtimeServerEventConversationItemTruncated.contentIndex) &&
        Objects.equals(this.audioEndMs, realtimeServerEventConversationItemTruncated.audioEndMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId, contentIndex, audioEndMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemTruncated {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    audioEndMs: ").append(toIndentedString(audioEndMs)).append("\n");
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

