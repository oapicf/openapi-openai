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



/**
 * Returned when the model-generated transcription of audio output is updated. 
 */

@ApiModel(description = "Returned when the model-generated transcription of audio output is updated. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseAudioTranscriptDelta   {
  
  private String eventId;


  public enum TypeEnum {
    RESPONSE_AUDIO_TRANSCRIPT_DELTA("response.audio_transcript.delta");

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
  private String delta;

  /**
   * The unique ID of the server event.
   */
  public RealtimeServerEventResponseAudioTranscriptDelta eventId(String eventId) {
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
   * The event type, must be `response.audio_transcript.delta`.
   */
  public RealtimeServerEventResponseAudioTranscriptDelta type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.audio_transcript.delta`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the response.
   */
  public RealtimeServerEventResponseAudioTranscriptDelta responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the response.")
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * The ID of the item.
   */
  public RealtimeServerEventResponseAudioTranscriptDelta itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the item.")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the output item in the response.
   */
  public RealtimeServerEventResponseAudioTranscriptDelta outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }
  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * The index of the content part in the item's content array.
   */
  public RealtimeServerEventResponseAudioTranscriptDelta contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   * The transcript delta.
   */
  public RealtimeServerEventResponseAudioTranscriptDelta delta(String delta) {
    this.delta = delta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The transcript delta.")
  @JsonProperty("delta")
  public String getDelta() {
    return delta;
  }
  public void setDelta(String delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseAudioTranscriptDelta realtimeServerEventResponseAudioTranscriptDelta = (RealtimeServerEventResponseAudioTranscriptDelta) o;
    return Objects.equals(eventId, realtimeServerEventResponseAudioTranscriptDelta.eventId) &&
        Objects.equals(type, realtimeServerEventResponseAudioTranscriptDelta.type) &&
        Objects.equals(responseId, realtimeServerEventResponseAudioTranscriptDelta.responseId) &&
        Objects.equals(itemId, realtimeServerEventResponseAudioTranscriptDelta.itemId) &&
        Objects.equals(outputIndex, realtimeServerEventResponseAudioTranscriptDelta.outputIndex) &&
        Objects.equals(contentIndex, realtimeServerEventResponseAudioTranscriptDelta.contentIndex) &&
        Objects.equals(delta, realtimeServerEventResponseAudioTranscriptDelta.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseAudioTranscriptDelta {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

