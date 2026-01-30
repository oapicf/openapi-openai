package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseAudioDone   {
  
  private String eventId;

  /**
   * The event type, must be &#x60;response.audio.done&#x60;.
   */
  public enum TypeEnum {
    RESPONSE_AUDIO_DONE("response.audio.done");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private String responseId;
  private String itemId;
  private Integer outputIndex;
  private Integer contentIndex;

  /**
   * The unique ID of the server event.
   **/
  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;response.audio.done&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The event type, must be `response.audio.done`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the response.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the response.")
  @JsonProperty("response_id")
  @NotNull
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * The ID of the item.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the item.")
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the output item in the response.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
  @JsonProperty("output_index")
  @NotNull
  public Integer getOutputIndex() {
    return outputIndex;
  }
  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * The index of the content part in the item&#39;s content array.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseAudioDone realtimeServerEventResponseAudioDone = (RealtimeServerEventResponseAudioDone) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseAudioDone.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseAudioDone.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseAudioDone.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseAudioDone.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseAudioDone.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseAudioDone.contentIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseAudioDone {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
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

