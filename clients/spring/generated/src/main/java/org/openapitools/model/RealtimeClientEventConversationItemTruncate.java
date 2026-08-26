package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
 */

@Schema(name = "RealtimeClientEventConversationItemTruncate", description = "Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RealtimeClientEventConversationItemTruncate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String eventId;

  /**
   * The event type, must be `conversation.item.truncate`.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_TRUNCATE("conversation.item.truncate");

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

  private Integer audioEndMs;

  public RealtimeClientEventConversationItemTruncate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeClientEventConversationItemTruncate(TypeEnum type, String itemId, Integer contentIndex, Integer audioEndMs) {
    this.type = type;
    this.itemId = itemId;
    this.contentIndex = contentIndex;
    this.audioEndMs = audioEndMs;
  }

  public RealtimeClientEventConversationItemTruncate eventId(@Nullable String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
   */
  
  @Schema(name = "event_id", description = "Optional client-generated ID used to identify this event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_id")
  public @Nullable String getEventId() {
    return eventId;
  }

  @JsonProperty("event_id")
  public void setEventId(@Nullable String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventConversationItemTruncate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `conversation.item.truncate`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `conversation.item.truncate`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventConversationItemTruncate itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the assistant message item to truncate. Only assistant message  items can be truncated. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  @JsonProperty("item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeClientEventConversationItemTruncate contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part to truncate. Set this to 0.
   * @return contentIndex
   */
  @NotNull 
  @Schema(name = "content_index", description = "The index of the content part to truncate. Set this to 0.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  @JsonProperty("content_index")
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeClientEventConversationItemTruncate audioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
    return this;
  }

  /**
   * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
   * @return audioEndMs
   */
  @NotNull 
  @Schema(name = "audio_end_ms", description = "Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("audio_end_ms")
  public Integer getAudioEndMs() {
    return audioEndMs;
  }

  @JsonProperty("audio_end_ms")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

