package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when the text value of a \&quot;text\&quot; content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */

@Schema(name = "RealtimeServerEventResponseTextDone", description = "Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseTextDone {

  private String eventId;

  /**
   * The event type, must be `response.text.done`.
   */
  public enum TypeEnum {
    RESPONSE_TEXT_DONE("response.text.done");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private TypeEnum type;

  private String responseId;

  private String itemId;

  private Integer outputIndex;

  private Integer contentIndex;

  private String text;

  public RealtimeServerEventResponseTextDone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventResponseTextDone(String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, Integer contentIndex, String text) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.contentIndex = contentIndex;
    this.text = text;
  }

  public RealtimeServerEventResponseTextDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @NotNull 
  @Schema(name = "event_id", description = "The unique ID of the server event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseTextDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.text.done`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.text.done`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseTextDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  /**
   * The ID of the response.
   * @return responseId
   */
  @NotNull 
  @Schema(name = "response_id", description = "The ID of the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseTextDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the item.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseTextDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  /**
   * The index of the output item in the response.
   * @return outputIndex
   */
  @NotNull 
  @Schema(name = "output_index", description = "The index of the output item in the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseTextDone contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part in the item's content array.
   * @return contentIndex
   */
  @NotNull 
  @Schema(name = "content_index", description = "The index of the content part in the item's content array.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseTextDone text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The final text content.
   * @return text
   */
  @NotNull 
  @Schema(name = "text", description = "The final text content.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

