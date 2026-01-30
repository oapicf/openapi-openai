package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
@ApiModel(description="Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")

public class RealtimeServerEventResponseTextDone  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

RESPONSE_TEXT_DONE(String.valueOf("response.text.done"));


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

 /**
  * The event type, must be `response.text.done`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.text.done`.")

  private TypeEnum type;

 /**
  * The ID of the response.
  */
  @ApiModelProperty(required = true, value = "The ID of the response.")

  private String responseId;

 /**
  * The ID of the item.
  */
  @ApiModelProperty(required = true, value = "The ID of the item.")

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

 /**
  * The final text content.
  */
  @ApiModelProperty(required = true, value = "The final text content.")

  private String text;
 /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseTextDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;response.text.done&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseTextDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the response.
   * @return responseId
  **/
  @JsonProperty("response_id")
  @NotNull
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseTextDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

 /**
   * The ID of the item.
   * @return itemId
  **/
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseTextDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The index of the output item in the response.
   * @return outputIndex
  **/
  @JsonProperty("output_index")
  @NotNull
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseTextDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

 /**
   * The index of the content part in the item&#39;s content array.
   * @return contentIndex
  **/
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseTextDone contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

 /**
   * The final text content.
   * @return text
  **/
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RealtimeServerEventResponseTextDone text(String text) {
    this.text = text;
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
    RealtimeServerEventResponseTextDone realtimeServerEventResponseTextDone = (RealtimeServerEventResponseTextDone) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseTextDone.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseTextDone.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseTextDone.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseTextDone.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseTextDone.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseTextDone.contentIndex) &&
        Objects.equals(this.text, realtimeServerEventResponseTextDone.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseTextDone {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

