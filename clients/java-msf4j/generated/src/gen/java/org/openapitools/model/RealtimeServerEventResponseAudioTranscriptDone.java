package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
@ApiModel(description = "Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseAudioTranscriptDone   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `response.audio_transcript.done`.
   */
  public enum TypeEnum {
    RESPONSE_AUDIO_TRANSCRIPT_DONE("response.audio_transcript.done");

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

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("output_index")
  private Integer outputIndex;

  @JsonProperty("content_index")
  private Integer contentIndex;

  @JsonProperty("transcript")
  private String transcript;

  public RealtimeServerEventResponseAudioTranscriptDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseAudioTranscriptDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `response.audio_transcript.done`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The event type, must be `response.audio_transcript.done`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseAudioTranscriptDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * The ID of the response.
   * @return responseId
  **/
  @ApiModelProperty(required = true, value = "The ID of the response.")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseAudioTranscriptDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The ID of the item.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The ID of the item.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseAudioTranscriptDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

   /**
   * The index of the output item in the response.
   * @return outputIndex
  **/
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseAudioTranscriptDone contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

   /**
   * The index of the content part in the item's content array.
   * @return contentIndex
  **/
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseAudioTranscriptDone transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

   /**
   * The final transcript of the audio.
   * @return transcript
  **/
  @ApiModelProperty(required = true, value = "The final transcript of the audio.")
  public String getTranscript() {
    return transcript;
  }

  public void setTranscript(String transcript) {
    this.transcript = transcript;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

