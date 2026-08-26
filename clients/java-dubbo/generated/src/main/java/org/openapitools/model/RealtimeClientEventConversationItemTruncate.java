package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
 */
public class RealtimeClientEventConversationItemTruncate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Optional client-generated ID used to identify this event.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be &#x60;conversation.item.truncate&#x60;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * The index of the content part to truncate. Set this to 0.
   */
  @JsonProperty("content_index")
  private Integer contentIndex;

  /**
   * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
   */
  @JsonProperty("audio_end_ms")
  private Integer audioEndMs;

  /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;conversation.item.truncate&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the content part to truncate. Set this to 0.
   * @return contentIndex
   */
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
   * @return audioEndMs
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
