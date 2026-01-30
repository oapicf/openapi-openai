package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

INPUT_AUDIO_BUFFER_COMMITTED(String.valueOf("input_audio_buffer.committed"));


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
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventInputAudioBufferCommitted eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;input_audio_buffer.committed&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventInputAudioBufferCommitted type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the preceding item after which the new item will be inserted. 
   * @return previousItemId
  **/
  @JsonProperty("previous_item_id")
  public String getPreviousItemId() {
    return previousItemId;
  }

  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

  public RealtimeServerEventInputAudioBufferCommitted previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
    return this;
  }

 /**
   * The ID of the user message item that will be created.
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

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

