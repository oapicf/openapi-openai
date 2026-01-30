package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
 */
@ApiModel(description="Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. ")

public class RealtimeServerEventInputAudioBufferCommitted  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("input_audio_buffer.committed") INPUT_AUDIO_BUFFER_COMMITTED(String.valueOf("input_audio_buffer.committed"));

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
  * The event type, must be `input_audio_buffer.committed`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.committed`.")
  private TypeEnum type;

 /**
  * The ID of the preceding item after which the new item will be inserted. 
  */
  @ApiModelProperty(required = true, value = "The ID of the preceding item after which the new item will be inserted. ")
  private String previousItemId;

 /**
  * The ID of the user message item that will be created.
  */
  @ApiModelProperty(required = true, value = "The ID of the user message item that will be created.")
  private String itemId;
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
  public RealtimeServerEventInputAudioBufferCommitted eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;input_audio_buffer.committed&#x60;.
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
  public RealtimeServerEventInputAudioBufferCommitted type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The ID of the preceding item after which the new item will be inserted. 
  * @return previousItemId
  */
  @JsonProperty("previous_item_id")
  @NotNull
  public String getPreviousItemId() {
    return previousItemId;
  }

  /**
   * Sets the <code>previousItemId</code> property.
   */
 public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

  /**
   * Sets the <code>previousItemId</code> property.
   */
  public RealtimeServerEventInputAudioBufferCommitted previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
    return this;
  }

 /**
  * The ID of the user message item that will be created.
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
  public RealtimeServerEventInputAudioBufferCommitted itemId(String itemId) {
    this.itemId = itemId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

