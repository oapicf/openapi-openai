package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
 **/
@ApiModel(description = "Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  ")
@JsonTypeName("RealtimeClientEventConversationItemTruncate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventConversationItemTruncate   {
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
  private Integer audioEndMs;

  public RealtimeClientEventConversationItemTruncate() {
  }

  @JsonCreator
  public RealtimeClientEventConversationItemTruncate(
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "content_index") Integer contentIndex,
    @JsonProperty(required = true, value = "audio_end_ms") Integer audioEndMs
  ) {
    this.type = type;
    this.itemId = itemId;
    this.contentIndex = contentIndex;
    this.audioEndMs = audioEndMs;
  }

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

  @JsonProperty("event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;conversation.item.truncate&#x60;.
   **/
  public RealtimeClientEventConversationItemTruncate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.truncate`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
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
  @JsonProperty(required = true, value = "content_index")
  @NotNull public Integer getContentIndex() {
    return contentIndex;
  }

  @JsonProperty(required = true, value = "content_index")
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
  @JsonProperty(required = true, value = "audio_end_ms")
  @NotNull public Integer getAudioEndMs() {
    return audioEndMs;
  }

  @JsonProperty(required = true, value = "audio_end_ms")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

