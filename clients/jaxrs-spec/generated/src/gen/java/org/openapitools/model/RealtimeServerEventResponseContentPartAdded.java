package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventResponseContentPartAddedPart;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 **/
@ApiModel(description = "Returned when a new content part is added to an assistant message item during response generation. ")
@JsonTypeName("RealtimeServerEventResponseContentPartAdded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseContentPartAdded   {
  private String eventId;
  public enum TypeEnum {

    RESPONSE_CONTENT_PART_ADDED(String.valueOf("response.content_part.added"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private RealtimeServerEventResponseContentPartAddedPart part;

  public RealtimeServerEventResponseContentPartAdded() {
  }

  @JsonCreator
  public RealtimeServerEventResponseContentPartAdded(
    @JsonProperty(required = true, value = "event_id") String eventId,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "response_id") String responseId,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "output_index") Integer outputIndex,
    @JsonProperty(required = true, value = "content_index") Integer contentIndex,
    @JsonProperty(required = true, value = "part") RealtimeServerEventResponseContentPartAddedPart part
  ) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.contentIndex = contentIndex;
    this.part = part;
  }

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventResponseContentPartAdded eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty(required = true, value = "event_id")
  @NotNull public String getEventId() {
    return eventId;
  }

  @JsonProperty(required = true, value = "event_id")
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
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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
  @JsonProperty(required = true, value = "response_id")
  @NotNull public String getResponseId() {
    return responseId;
  }

  @JsonProperty(required = true, value = "response_id")
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
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
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
  @JsonProperty(required = true, value = "output_index")
  @NotNull public Integer getOutputIndex() {
    return outputIndex;
  }

  @JsonProperty(required = true, value = "output_index")
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
  @JsonProperty(required = true, value = "content_index")
  @NotNull public Integer getContentIndex() {
    return contentIndex;
  }

  @JsonProperty(required = true, value = "content_index")
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
  @JsonProperty(required = true, value = "part")
  @NotNull @Valid public RealtimeServerEventResponseContentPartAddedPart getPart() {
    return part;
  }

  @JsonProperty(required = true, value = "part")
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

