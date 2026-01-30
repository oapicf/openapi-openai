package apimodels;

import apimodels.RealtimeServerEventResponseContentPartDonePart;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeServerEventResponseContentPartDone   {
  @JsonProperty("event_id")
  @NotNull

  private String eventId;

  /**
   * The event type, must be `response.content_part.done`.
   */
  public enum TypeEnum {
    RESPONSE_CONTENT_PART_DONE("response.content_part.done");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("response_id")
  @NotNull

  private String responseId;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("output_index")
  @NotNull

  private Integer outputIndex;

  @JsonProperty("content_index")
  @NotNull

  private Integer contentIndex;

  @JsonProperty("part")
  @NotNull
@Valid

  private RealtimeServerEventResponseContentPartDonePart part;

  public RealtimeServerEventResponseContentPartDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseContentPartDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `response.content_part.done`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseContentPartDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * The ID of the response.
   * @return responseId
  **/
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseContentPartDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The ID of the item.
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseContentPartDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

   /**
   * The index of the output item in the response.
   * @return outputIndex
  **/
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseContentPartDone contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

   /**
   * The index of the content part in the item's content array.
   * @return contentIndex
  **/
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseContentPartDone part(RealtimeServerEventResponseContentPartDonePart part) {
    this.part = part;
    return this;
  }

   /**
   * Get part
   * @return part
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

