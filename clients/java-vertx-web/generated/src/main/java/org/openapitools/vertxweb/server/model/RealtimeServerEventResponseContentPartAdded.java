package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeServerEventResponseContentPartAddedPart;

/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventResponseContentPartAdded   {
  
  private String eventId;


  public enum TypeEnum {
    RESPONSE_CONTENT_PART_ADDED("response.content_part.added");

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
  private RealtimeServerEventResponseContentPartAddedPart part;

  public RealtimeServerEventResponseContentPartAdded () {

  }

  public RealtimeServerEventResponseContentPartAdded (String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, Integer contentIndex, RealtimeServerEventResponseContentPartAddedPart part) {
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
    return Objects.equals(eventId, realtimeServerEventResponseContentPartAdded.eventId) &&
        Objects.equals(type, realtimeServerEventResponseContentPartAdded.type) &&
        Objects.equals(responseId, realtimeServerEventResponseContentPartAdded.responseId) &&
        Objects.equals(itemId, realtimeServerEventResponseContentPartAdded.itemId) &&
        Objects.equals(outputIndex, realtimeServerEventResponseContentPartAdded.outputIndex) &&
        Objects.equals(contentIndex, realtimeServerEventResponseContentPartAdded.contentIndex) &&
        Objects.equals(part, realtimeServerEventResponseContentPartAdded.part);
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
