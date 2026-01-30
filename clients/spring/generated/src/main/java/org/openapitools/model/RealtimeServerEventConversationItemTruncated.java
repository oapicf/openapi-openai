package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when an earlier assistant audio message item is truncated by the  client with a &#x60;conversation.item.truncate&#x60; event. This event is used to  synchronize the server&#39;s understanding of the audio with the client&#39;s playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn&#39;t been heard by the user. 
 */

@Schema(name = "RealtimeServerEventConversationItemTruncated", description = "Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemTruncated {

  private String eventId;

  /**
   * The event type, must be `conversation.item.truncated`.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_TRUNCATED("conversation.item.truncated");

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

  public RealtimeServerEventConversationItemTruncated() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventConversationItemTruncated(String eventId, TypeEnum type, String itemId, Integer contentIndex, Integer audioEndMs) {
    this.eventId = eventId;
    this.type = type;
    this.itemId = itemId;
    this.contentIndex = contentIndex;
    this.audioEndMs = audioEndMs;
  }

  public RealtimeServerEventConversationItemTruncated eventId(String eventId) {
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

  public RealtimeServerEventConversationItemTruncated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `conversation.item.truncated`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `conversation.item.truncated`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemTruncated itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the assistant message item that was truncated.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the assistant message item that was truncated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventConversationItemTruncated contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part that was truncated.
   * @return contentIndex
   */
  @NotNull 
  @Schema(name = "content_index", description = "The index of the content part that was truncated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventConversationItemTruncated audioEndMs(Integer audioEndMs) {
    this.audioEndMs = audioEndMs;
    return this;
  }

  /**
   * The duration up to which the audio was truncated, in milliseconds. 
   * @return audioEndMs
   */
  @NotNull 
  @Schema(name = "audio_end_ms", description = "The duration up to which the audio was truncated, in milliseconds. ", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

