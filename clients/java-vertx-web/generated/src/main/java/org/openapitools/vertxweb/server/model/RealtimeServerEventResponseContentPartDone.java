package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeServerEventResponseContentPartDonePart;

/**
 * Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventResponseContentPartDone   {
  
  private String eventId;


  public enum TypeEnum {
    RESPONSE_CONTENT_PART_DONE("response.content_part.done");

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
  private String itemId;
  private Integer outputIndex;
  private Integer contentIndex;
  private RealtimeServerEventResponseContentPartDonePart part;

  public RealtimeServerEventResponseContentPartDone () {

  }

  public RealtimeServerEventResponseContentPartDone (String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, Integer contentIndex, RealtimeServerEventResponseContentPartDonePart part) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.contentIndex = contentIndex;
    this.part = part;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }
  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

    
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

    
  @JsonProperty("part")
  public RealtimeServerEventResponseContentPartDonePart getPart() {
    return part;
  }
  public void setPart(RealtimeServerEventResponseContentPartDonePart part) {
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
    RealtimeServerEventResponseContentPartDone realtimeServerEventResponseContentPartDone = (RealtimeServerEventResponseContentPartDone) o;
    return Objects.equals(eventId, realtimeServerEventResponseContentPartDone.eventId) &&
        Objects.equals(type, realtimeServerEventResponseContentPartDone.type) &&
        Objects.equals(responseId, realtimeServerEventResponseContentPartDone.responseId) &&
        Objects.equals(itemId, realtimeServerEventResponseContentPartDone.itemId) &&
        Objects.equals(outputIndex, realtimeServerEventResponseContentPartDone.outputIndex) &&
        Objects.equals(contentIndex, realtimeServerEventResponseContentPartDone.contentIndex) &&
        Objects.equals(part, realtimeServerEventResponseContentPartDone.part);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, part);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseContentPartDone {\n");
    
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
