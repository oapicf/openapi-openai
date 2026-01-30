package org.openapitools.model;

import org.openapitools.model.RealtimeServerEventResponseContentPartAddedPart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 */
@ApiModel(description="Returned when a new content part is added to an assistant message item during response generation. ")

public class RealtimeServerEventResponseContentPartAdded  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

RESPONSE_CONTENT_PART_ADDED(String.valueOf("response.content_part.added"));


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
  * The event type, must be `response.content_part.added`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.content_part.added`.")

  private TypeEnum type;

 /**
  * The ID of the response.
  */
  @ApiModelProperty(required = true, value = "The ID of the response.")

  private String responseId;

 /**
  * The ID of the item to which the content part was added.
  */
  @ApiModelProperty(required = true, value = "The ID of the item to which the content part was added.")

  private String itemId;

 /**
  * The index of the output item in the response.
  */
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")

  private Integer outputIndex;

 /**
  * The index of the content part in the item's content array.
  */
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")

  private Integer contentIndex;

  @ApiModelProperty(required = true, value = "")

  private RealtimeServerEventResponseContentPartAddedPart part;
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

  public RealtimeServerEventResponseContentPartAdded eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;response.content_part.added&#x60;.
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

  public RealtimeServerEventResponseContentPartAdded type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the response.
   * @return responseId
  **/
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseContentPartAdded responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

 /**
   * The ID of the item to which the content part was added.
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseContentPartAdded itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The index of the output item in the response.
   * @return outputIndex
  **/
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseContentPartAdded outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

 /**
   * The index of the content part in the item&#39;s content array.
   * @return contentIndex
  **/
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseContentPartAdded contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

 /**
   * Get part
   * @return part
  **/
  @JsonProperty("part")
  public RealtimeServerEventResponseContentPartAddedPart getPart() {
    return part;
  }

  public void setPart(RealtimeServerEventResponseContentPartAddedPart part) {
    this.part = part;
  }

  public RealtimeServerEventResponseContentPartAdded part(RealtimeServerEventResponseContentPartAddedPart part) {
    this.part = part;
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
    RealtimeServerEventResponseContentPartAdded realtimeServerEventResponseContentPartAdded = (RealtimeServerEventResponseContentPartAdded) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseContentPartAdded.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseContentPartAdded.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseContentPartAdded.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseContentPartAdded.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseContentPartAdded.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseContentPartAdded.contentIndex) &&
        Objects.equals(this.part, realtimeServerEventResponseContentPartAdded.part);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, part);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseContentPartAdded {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
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

