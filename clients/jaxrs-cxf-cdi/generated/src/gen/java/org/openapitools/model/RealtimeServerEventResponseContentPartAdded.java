package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventResponseContentPartAddedPart;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Returned when a new content part is added to an assistant message item during response generation. ")
public class RealtimeServerEventResponseContentPartAdded   {
  
  private String eventId;


public enum TypeEnum {

    @JsonProperty("response.content_part.added") RESPONSE_CONTENT_PART_ADDED(String.valueOf("response.content_part.added"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private String responseId;

  private String itemId;

  private Integer outputIndex;

  private Integer contentIndex;

  private RealtimeServerEventResponseContentPartAddedPart part;

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventResponseContentPartAdded eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
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
   * The event type, must be &#x60;response.content_part.added&#x60;.
   **/
  public RealtimeServerEventResponseContentPartAdded type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.content_part.added`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The ID of the response.
   **/
  public RealtimeServerEventResponseContentPartAdded responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the response.")
  @JsonProperty("response_id")
  @NotNull
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }


  /**
   * The ID of the item to which the content part was added.
   **/
  public RealtimeServerEventResponseContentPartAdded itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the item to which the content part was added.")
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  /**
   * The index of the output item in the response.
   **/
  public RealtimeServerEventResponseContentPartAdded outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
  @JsonProperty("output_index")
  @NotNull
  public Integer getOutputIndex() {
    return outputIndex;
  }
  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }


  /**
   * The index of the content part in the item&#39;s content array.
   **/
  public RealtimeServerEventResponseContentPartAdded contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }


  /**
   **/
  public RealtimeServerEventResponseContentPartAdded part(RealtimeServerEventResponseContentPartAddedPart part) {
    this.part = part;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("part")
  @NotNull
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

