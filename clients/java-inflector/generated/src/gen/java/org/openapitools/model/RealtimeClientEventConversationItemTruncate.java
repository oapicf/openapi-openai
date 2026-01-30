package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
 **/

@ApiModel(description = "Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventConversationItemTruncate   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `conversation.item.truncate`.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_TRUNCATE("conversation.item.truncate");

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

  @JsonProperty("audio_end_ms")
  private Integer audioEndMs;

  /**
   * Optional client-generated ID used to identify this event.
   **/
  public RealtimeClientEventConversationItemTruncate eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be `conversation.item.truncate`.
   **/
  public RealtimeClientEventConversationItemTruncate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.truncate`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
   **/
  public RealtimeClientEventConversationItemTruncate itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the assistant message item to truncate. Only assistant message  items can be truncated. ")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the content part to truncate. Set this to 0.
   **/
  public RealtimeClientEventConversationItemTruncate contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the content part to truncate. Set this to 0.")
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
   **/
  public RealtimeClientEventConversationItemTruncate audioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. ")
  @JsonProperty("audio_end_ms")
  public Integer getAudioEndMs() {
    return audioEndMs;
  }
  public void setAudioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
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
    return Objects.equals(eventId, realtimeClientEventConversationItemTruncate.eventId) &&
        Objects.equals(type, realtimeClientEventConversationItemTruncate.type) &&
        Objects.equals(itemId, realtimeClientEventConversationItemTruncate.itemId) &&
        Objects.equals(contentIndex, realtimeClientEventConversationItemTruncate.contentIndex) &&
        Objects.equals(audioEndMs, realtimeClientEventConversationItemTruncate.audioEndMs);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

