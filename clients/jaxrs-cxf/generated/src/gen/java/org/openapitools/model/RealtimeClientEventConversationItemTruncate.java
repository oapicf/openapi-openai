package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
 */
@ApiModel(description="Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  ")

public class RealtimeClientEventConversationItemTruncate  {
  
 /**
  * Optional client-generated ID used to identify this event.
  */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")

  private String eventId;

public enum TypeEnum {

CONVERSATION_ITEM_TRUNCATE(String.valueOf("conversation.item.truncate"));


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

 /**
  * The event type, must be `conversation.item.truncate`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.truncate`.")

  private TypeEnum type;

 /**
  * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
  */
  @ApiModelProperty(required = true, value = "The ID of the assistant message item to truncate. Only assistant message  items can be truncated. ")

  private String itemId;

 /**
  * The index of the content part to truncate. Set this to 0.
  */
  @ApiModelProperty(required = true, value = "The index of the content part to truncate. Set this to 0.")

  private Integer contentIndex;

 /**
  * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
  */
  @ApiModelProperty(required = true, value = "Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. ")

  private Integer audioEndMs;
 /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventConversationItemTruncate eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;conversation.item.truncate&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventConversationItemTruncate type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
   * @return itemId
  **/
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeClientEventConversationItemTruncate itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The index of the content part to truncate. Set this to 0.
   * @return contentIndex
  **/
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeClientEventConversationItemTruncate contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

 /**
   * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
   * @return audioEndMs
  **/
  @JsonProperty("audio_end_ms")
  @NotNull
  public Integer getAudioEndMs() {
    return audioEndMs;
  }

  public void setAudioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
  }

  public RealtimeClientEventConversationItemTruncate audioEndMs(Integer audioEndMs) {
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
    RealtimeClientEventConversationItemTruncate realtimeClientEventConversationItemTruncate = (RealtimeClientEventConversationItemTruncate) o;
    return Objects.equals(this.eventId, realtimeClientEventConversationItemTruncate.eventId) &&
        Objects.equals(this.type, realtimeClientEventConversationItemTruncate.type) &&
        Objects.equals(this.itemId, realtimeClientEventConversationItemTruncate.itemId) &&
        Objects.equals(this.contentIndex, realtimeClientEventConversationItemTruncate.contentIndex) &&
        Objects.equals(this.audioEndMs, realtimeClientEventConversationItemTruncate.audioEndMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId, contentIndex, audioEndMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventConversationItemTruncate {\n");
    
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

