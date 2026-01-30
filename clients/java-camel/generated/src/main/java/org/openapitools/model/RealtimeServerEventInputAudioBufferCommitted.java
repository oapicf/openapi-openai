package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The &#x60;item_id&#x60; property is the ID of the user message item that will be created, thus a &#x60;conversation.item.created&#x60; event  will also be sent to the client. 
 */

@Schema(name = "RealtimeServerEventInputAudioBufferCommitted", description = "Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventInputAudioBufferCommitted {

  private String eventId;

  /**
   * The event type, must be `input_audio_buffer.committed`.
   */
  public enum TypeEnum {
    INPUT_AUDIO_BUFFER_COMMITTED("input_audio_buffer.committed");

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

  private String previousItemId;

  private String itemId;

  public RealtimeServerEventInputAudioBufferCommitted() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventInputAudioBufferCommitted(String eventId, TypeEnum type, String previousItemId, String itemId) {
    this.eventId = eventId;
    this.type = type;
    this.previousItemId = previousItemId;
    this.itemId = itemId;
  }

  public RealtimeServerEventInputAudioBufferCommitted eventId(String eventId) {
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

  public RealtimeServerEventInputAudioBufferCommitted type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `input_audio_buffer.committed`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `input_audio_buffer.committed`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventInputAudioBufferCommitted previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
    return this;
  }

  /**
   * The ID of the preceding item after which the new item will be inserted. 
   * @return previousItemId
   */
  @NotNull 
  @Schema(name = "previous_item_id", description = "The ID of the preceding item after which the new item will be inserted. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("previous_item_id")
  public String getPreviousItemId() {
    return previousItemId;
  }

  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

  public RealtimeServerEventInputAudioBufferCommitted itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the user message item that will be created.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the user message item that will be created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventInputAudioBufferCommitted realtimeServerEventInputAudioBufferCommitted = (RealtimeServerEventInputAudioBufferCommitted) o;
    return Objects.equals(this.eventId, realtimeServerEventInputAudioBufferCommitted.eventId) &&
        Objects.equals(this.type, realtimeServerEventInputAudioBufferCommitted.type) &&
        Objects.equals(this.previousItemId, realtimeServerEventInputAudioBufferCommitted.previousItemId) &&
        Objects.equals(this.itemId, realtimeServerEventInputAudioBufferCommitted.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, previousItemId, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventInputAudioBufferCommitted {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    previousItemId: ").append(toIndentedString(previousItemId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

