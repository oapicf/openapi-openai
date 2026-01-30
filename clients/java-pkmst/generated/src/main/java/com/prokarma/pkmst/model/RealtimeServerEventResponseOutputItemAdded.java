package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RealtimeConversationItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Returned when a new Item is created during Response generation.
 */
@ApiModel(description = "Returned when a new Item is created during Response generation.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseOutputItemAdded   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `response.output_item.added`.
   */
  public enum TypeEnum {
    RESPONSE_OUTPUT_ITEM_ADDED("response.output_item.added");

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

  @JsonProperty("output_index")
  private Integer outputIndex;

  @JsonProperty("item")
  private RealtimeConversationItem item;

  public RealtimeServerEventResponseOutputItemAdded eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
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
  @ApiModelProperty(required = true, value = "The event type, must be `response.output_item.added`.")
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
  @ApiModelProperty(required = true, value = "The ID of the Response to which the item belongs.")
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
  @ApiModelProperty(required = true, value = "The index of the output item in the Response.")
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
  @ApiModelProperty(required = true, value = "")
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

