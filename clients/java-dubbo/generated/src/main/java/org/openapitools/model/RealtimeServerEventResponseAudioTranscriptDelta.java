package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Returned when the model-generated transcription of audio output is updated. 
 */
public class RealtimeServerEventResponseAudioTranscriptDelta implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The unique ID of the server event.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be &#x60;response.audio_transcript.delta&#x60;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The ID of the response.
   */
  @JsonProperty("response_id")
  private String responseId;

  /**
   * The ID of the item.
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * The index of the output item in the response.
   */
  @JsonProperty("output_index")
  private Integer outputIndex;

  /**
   * The index of the content part in the item&#39;s content array.
   */
  @JsonProperty("content_index")
  private Integer contentIndex;

  /**
   * The transcript delta.
   */
  @JsonProperty("delta")
  private String delta;

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
   * The event type, must be &#x60;response.audio_transcript.delta&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The ID of the response.
   * @return responseId
   */
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * The ID of the item.
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the output item in the response.
   * @return outputIndex
   */
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * The index of the content part in the item&#39;s content array.
   * @return contentIndex
   */
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   * The transcript delta.
   * @return delta
   */
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
    return Objects.equals(this.eventId, realtimeServerEventResponseAudioTranscriptDelta.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseAudioTranscriptDelta.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseAudioTranscriptDelta.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseAudioTranscriptDelta.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseAudioTranscriptDelta.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseAudioTranscriptDelta.contentIndex) &&
        Objects.equals(this.delta, realtimeServerEventResponseAudioTranscriptDelta.delta);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
