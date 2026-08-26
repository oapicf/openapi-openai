package org.openapitools.model;

import org.openapitools.model.RealtimeConversationItem;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Returned when a new Item is created during Response generation.
 */
public class RealtimeServerEventResponseOutputItemAdded implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The unique ID of the server event.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be &#x60;response.output_item.added&#x60;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The ID of the Response to which the item belongs.
   */
  @JsonProperty("response_id")
  private String responseId;

  /**
   * The index of the output item in the Response.
   */
  @JsonProperty("output_index")
  private Integer outputIndex;

  @JsonProperty("item")
  private RealtimeConversationItem item;

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;response.output_item.added&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The ID of the Response to which the item belongs.
   * @return responseId
   */
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * The index of the output item in the Response.
   * @return outputIndex
   */
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * 
   * @return item
   */
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
    RealtimeServerEventResponseOutputItemAdded realtimeServerEventResponseOutputItemAdded = (RealtimeServerEventResponseOutputItemAdded) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseOutputItemAdded.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseOutputItemAdded.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseOutputItemAdded.responseId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseOutputItemAdded.outputIndex) &&
        Objects.equals(this.item, realtimeServerEventResponseOutputItemAdded.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, outputIndex, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseOutputItemAdded {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
