package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
@ApiModel(description="Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")

public class RealtimeServerEventResponseAudioTranscriptDone  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("response.audio_transcript.done") RESPONSE_AUDIO_TRANSCRIPT_DONE(String.valueOf("response.audio_transcript.done"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The event type, must be `response.audio_transcript.done`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.audio_transcript.done`.")
  private TypeEnum type;

 /**
  * The ID of the response.
  */
  @ApiModelProperty(required = true, value = "The ID of the response.")
  private String responseId;

 /**
  * The ID of the item.
  */
  @ApiModelProperty(required = true, value = "The ID of the item.")
  private String itemId;

 /**
  * The index of the output item in the response.
  */
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
  private Integer outputIndex;

 /**
  * The index of the content part in the item's content array.
  */
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")
  private Integer contentIndex;

 /**
  * The final transcript of the audio.
  */
  @ApiModelProperty(required = true, value = "The final transcript of the audio.")
  private String transcript;
 /**
  * The unique ID of the server event.
  * @return eventId
  */
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
 public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
  public RealtimeServerEventResponseAudioTranscriptDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;response.audio_transcript.done&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeServerEventResponseAudioTranscriptDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The ID of the response.
  * @return responseId
  */
  @JsonProperty("response_id")
  @NotNull
  public String getResponseId() {
    return responseId;
  }

  /**
   * Sets the <code>responseId</code> property.
   */
 public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * Sets the <code>responseId</code> property.
   */
  public RealtimeServerEventResponseAudioTranscriptDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

 /**
  * The ID of the item.
  * @return itemId
  */
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public RealtimeServerEventResponseAudioTranscriptDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
  * The index of the output item in the response.
  * @return outputIndex
  */
  @JsonProperty("output_index")
  @NotNull
  public Integer getOutputIndex() {
    return outputIndex;
  }

  /**
   * Sets the <code>outputIndex</code> property.
   */
 public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * Sets the <code>outputIndex</code> property.
   */
  public RealtimeServerEventResponseAudioTranscriptDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

 /**
  * The index of the content part in the item&#39;s content array.
  * @return contentIndex
  */
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }

  /**
   * Sets the <code>contentIndex</code> property.
   */
 public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  /**
   * Sets the <code>contentIndex</code> property.
   */
  public RealtimeServerEventResponseAudioTranscriptDone contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

 /**
  * The final transcript of the audio.
  * @return transcript
  */
  @JsonProperty("transcript")
  @NotNull
  public String getTranscript() {
    return transcript;
  }

  /**
   * Sets the <code>transcript</code> property.
   */
 public void setTranscript(String transcript) {
    this.transcript = transcript;
  }

  /**
   * Sets the <code>transcript</code> property.
   */
  public RealtimeServerEventResponseAudioTranscriptDone transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseAudioTranscriptDone realtimeServerEventResponseAudioTranscriptDone = (RealtimeServerEventResponseAudioTranscriptDone) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseAudioTranscriptDone.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseAudioTranscriptDone.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseAudioTranscriptDone.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseAudioTranscriptDone.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseAudioTranscriptDone.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseAudioTranscriptDone.contentIndex) &&
        Objects.equals(this.transcript, realtimeServerEventResponseAudioTranscriptDone.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseAudioTranscriptDone {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

