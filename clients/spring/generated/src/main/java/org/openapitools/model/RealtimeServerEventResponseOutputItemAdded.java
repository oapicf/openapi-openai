package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeConversationItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when a new Item is created during Response generation.
 */

@Schema(name = "RealtimeServerEventResponseOutputItemAdded", description = "Returned when a new Item is created during Response generation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseOutputItemAdded {

  private String eventId;

  /**
   * The event type, must be `response.output_item.added`.
   */
  public enum TypeEnum {
    RESPONSE_OUTPUT_ITEM_ADDED("response.output_item.added");

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

  private Integer outputIndex;

  private RealtimeConversationItem item;

  public RealtimeServerEventResponseOutputItemAdded() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventResponseOutputItemAdded(String eventId, TypeEnum type, String responseId, Integer outputIndex, RealtimeConversationItem item) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.outputIndex = outputIndex;
    this.item = item;
  }

  public RealtimeServerEventResponseOutputItemAdded eventId(String eventId) {
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

  public RealtimeServerEventResponseOutputItemAdded type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.output_item.added`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.output_item.added`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseOutputItemAdded responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  /**
   * The ID of the Response to which the item belongs.
   * @return responseId
   */
  @NotNull 
  @Schema(name = "response_id", description = "The ID of the Response to which the item belongs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseOutputItemAdded outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  /**
   * The index of the output item in the Response.
   * @return outputIndex
   */
  @NotNull 
  @Schema(name = "output_index", description = "The index of the output item in the Response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseOutputItemAdded item(RealtimeConversationItem item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   */
  @NotNull @Valid 
  @Schema(name = "item", requiredMode = Schema.RequiredMode.REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

