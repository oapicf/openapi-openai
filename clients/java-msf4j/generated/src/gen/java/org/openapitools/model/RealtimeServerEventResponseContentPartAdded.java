package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventResponseContentPartAddedPart;

/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 */
@ApiModel(description = "Returned when a new content part is added to an assistant message item during response generation. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseContentPartAdded   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `response.content_part.added`.
   */
  public enum TypeEnum {
    RESPONSE_CONTENT_PART_ADDED("response.content_part.added");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("response_id")
  private String responseId;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("output_index")
  private Integer outputIndex;

  @JsonProperty("content_index")
  private Integer contentIndex;

  @JsonProperty("part")
  private RealtimeServerEventResponseContentPartAddedPart part;

  public RealtimeServerEventResponseContentPartAdded eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseContentPartAdded type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `response.content_part.added`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The event type, must be `response.content_part.added`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseContentPartAdded responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * The ID of the response.
   * @return responseId
  **/
  @ApiModelProperty(required = true, value = "The ID of the response.")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseContentPartAdded itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The ID of the item to which the content part was added.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The ID of the item to which the content part was added.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseContentPartAdded outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

   /**
   * The index of the output item in the response.
   * @return outputIndex
  **/
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseContentPartAdded contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

   /**
   * The index of the content part in the item's content array.
   * @return contentIndex
  **/
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseContentPartAdded part(RealtimeServerEventResponseContentPartAddedPart part) {
    this.part = part;
    return this;
  }

   /**
   * Get part
   * @return part
  **/
  @ApiModelProperty(required = true, value = "")
  public RealtimeServerEventResponseContentPartAddedPart getPart() {
    return part;
  }

  public void setPart(RealtimeServerEventResponseContentPartAddedPart part) {
    this.part = part;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

