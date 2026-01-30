package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeServerEventResponseAudioTranscriptDone   {
  @JsonProperty("event_id")
  @NotNull

  private String eventId;

  /**
   * The event type, must be `response.audio_transcript.done`.
   */
  public enum TypeEnum {
    RESPONSE_AUDIO_TRANSCRIPT_DONE("response.audio_transcript.done");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("response_id")
  @NotNull

  private String responseId;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("output_index")
  @NotNull

  private Integer outputIndex;

  @JsonProperty("content_index")
  @NotNull

  private Integer contentIndex;

  @JsonProperty("transcript")
  @NotNull

  private String transcript;

  public RealtimeServerEventResponseAudioTranscriptDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
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
    return Objects.equals(eventId, realtimeServerEventResponseAudioTranscriptDone.eventId) &&
        Objects.equals(type, realtimeServerEventResponseAudioTranscriptDone.type) &&
        Objects.equals(responseId, realtimeServerEventResponseAudioTranscriptDone.responseId) &&
        Objects.equals(itemId, realtimeServerEventResponseAudioTranscriptDone.itemId) &&
        Objects.equals(outputIndex, realtimeServerEventResponseAudioTranscriptDone.outputIndex) &&
        Objects.equals(contentIndex, realtimeServerEventResponseAudioTranscriptDone.contentIndex) &&
        Objects.equals(transcript, realtimeServerEventResponseAudioTranscriptDone.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, transcript);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

