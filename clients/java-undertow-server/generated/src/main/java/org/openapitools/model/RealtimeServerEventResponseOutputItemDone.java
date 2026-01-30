/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeConversationItem;



/**
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 */

@ApiModel(description = "Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseOutputItemDone   {
  
  private String eventId;


  public enum TypeEnum {
    RESPONSE_OUTPUT_ITEM_DONE("response.output_item.done");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private String responseId;
  private Integer outputIndex;
  private RealtimeConversationItem item;

  /**
   * The unique ID of the server event.
   */
  public RealtimeServerEventResponseOutputItemDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be `response.output_item.done`.
   */
  public RealtimeServerEventResponseOutputItemDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.output_item.done`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the Response to which the item belongs.
   */
  public RealtimeServerEventResponseOutputItemDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the Response to which the item belongs.")
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * The index of the output item in the Response.
   */
  public RealtimeServerEventResponseOutputItemDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the output item in the Response.")
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }
  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   */
  public RealtimeServerEventResponseOutputItemDone item(RealtimeConversationItem item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item")
  public RealtimeConversationItem getItem() {
    return item;
  }
  public void setItem(RealtimeConversationItem item) {
    this.item = item;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseOutputItemDone realtimeServerEventResponseOutputItemDone = (RealtimeServerEventResponseOutputItemDone) o;
    return Objects.equals(eventId, realtimeServerEventResponseOutputItemDone.eventId) &&
        Objects.equals(type, realtimeServerEventResponseOutputItemDone.type) &&
        Objects.equals(responseId, realtimeServerEventResponseOutputItemDone.responseId) &&
        Objects.equals(outputIndex, realtimeServerEventResponseOutputItemDone.outputIndex) &&
        Objects.equals(item, realtimeServerEventResponseOutputItemDone.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, outputIndex, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseOutputItemDone {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

