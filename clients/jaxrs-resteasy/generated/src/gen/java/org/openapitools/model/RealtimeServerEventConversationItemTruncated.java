package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemTruncated   {
  
  private String eventId;

  /**
   * The event type, must be &#x60;conversation.item.truncated&#x60;.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_TRUNCATED("conversation.item.truncated");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private String itemId;
  private Integer contentIndex;
  private Integer audioEndMs;

  /**
   * The unique ID of the server event.
   **/
  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;conversation.item.truncated&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.truncated`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the assistant message item that was truncated.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the assistant message item that was truncated.")
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the content part that was truncated.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the content part that was truncated.")
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   * The duration up to which the audio was truncated, in milliseconds. 
   **/
  
  @ApiModelProperty(required = true, value = "The duration up to which the audio was truncated, in milliseconds. ")
  @JsonProperty("audio_end_ms")
  @NotNull
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

