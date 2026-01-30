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
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The &#x60;item_id&#x60; property is the ID of the user message item that will be created, thus a &#x60;conversation.item.created&#x60; event  will also be sent to the client. 
 **/
@ApiModel(description = "Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. ")
@JsonTypeName("RealtimeServerEventInputAudioBufferCommitted")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventInputAudioBufferCommitted   {
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
  private String previousItemId;
  private String itemId;

  public RealtimeServerEventInputAudioBufferCommitted() {
  }

  @JsonCreator
  public RealtimeServerEventInputAudioBufferCommitted(
    @JsonProperty(required = true, value = "event_id") String eventId,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "previous_item_id") String previousItemId,
    @JsonProperty(required = true, value = "item_id") String itemId
  ) {
    this.eventId = eventId;
    this.type = type;
    this.previousItemId = previousItemId;
    this.itemId = itemId;
  }

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventInputAudioBufferCommitted eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty(required = true, value = "event_id")
  @NotNull public String getEventId() {
    return eventId;
  }

  @JsonProperty(required = true, value = "event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;input_audio_buffer.committed&#x60;.
   **/
  public RealtimeServerEventInputAudioBufferCommitted type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.committed`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the preceding item after which the new item will be inserted. 
   **/
  public RealtimeServerEventInputAudioBufferCommitted previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the preceding item after which the new item will be inserted. ")
  @JsonProperty(required = true, value = "previous_item_id")
  @NotNull public String getPreviousItemId() {
    return previousItemId;
  }

  @JsonProperty(required = true, value = "previous_item_id")
  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

  /**
   * The ID of the user message item that will be created.
   **/
  public RealtimeServerEventInputAudioBufferCommitted itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the user message item that will be created.")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
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

