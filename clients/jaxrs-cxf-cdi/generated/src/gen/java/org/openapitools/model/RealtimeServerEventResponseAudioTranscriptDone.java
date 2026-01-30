package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")
public class RealtimeServerEventResponseAudioTranscriptDone   {
  
  private String eventId;


public enum TypeEnum {

    @JsonProperty("response.audio_transcript.done") RESPONSE_AUDIO_TRANSCRIPT_DONE(String.valueOf("response.audio_transcript.done"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private String responseId;

  private String itemId;

  private Integer outputIndex;

  private Integer contentIndex;

  private String transcript;

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventResponseAudioTranscriptDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
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
   * The event type, must be &#x60;response.audio_transcript.done&#x60;.
   **/
  public RealtimeServerEventResponseAudioTranscriptDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.audio_transcript.done`.")
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
  public RealtimeServerEventResponseAudioTranscriptDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  
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
  public RealtimeServerEventResponseAudioTranscriptDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
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
  public RealtimeServerEventResponseAudioTranscriptDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  
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
  public RealtimeServerEventResponseAudioTranscriptDone contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }
  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }


  /**
   * The final transcript of the audio.
   **/
  public RealtimeServerEventResponseAudioTranscriptDone transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The final transcript of the audio.")
  @JsonProperty("transcript")
  @NotNull
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

