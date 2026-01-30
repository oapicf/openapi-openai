package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in &#x60;server_vad&#x60; mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always &#x60;whisper-1&#x60;. Thus the transcript may diverge somewhat from  the model&#39;s interpretation, and should be treated as a rough guide. 
 */

@Schema(name = "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted", description = "This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {

  private String eventId;

  /**
   * The event type, must be `conversation.item.input_audio_transcription.completed`. 
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_COMPLETED("conversation.item.input_audio_transcription.completed");

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

  private String itemId;

  private Integer contentIndex;

  private String transcript;

  public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(String eventId, TypeEnum type, String itemId, Integer contentIndex, String transcript) {
    this.eventId = eventId;
    this.type = type;
    this.itemId = itemId;
    this.contentIndex = contentIndex;
    this.transcript = transcript;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted eventId(String eventId) {
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

  public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `conversation.item.input_audio_transcription.completed`. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `conversation.item.input_audio_transcription.completed`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the user message item containing the audio.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the user message item containing the audio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part containing the audio.
   * @return contentIndex
   */
  @NotNull 
  @Schema(name = "content_index", description = "The index of the content part containing the audio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_index")
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * The transcribed text.
   * @return transcript
   */
  @NotNull 
  @Schema(name = "transcript", description = "The transcribed text.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transcript")
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
    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted realtimeServerEventConversationItemInputAudioTranscriptionCompleted = (RealtimeServerEventConversationItemInputAudioTranscriptionCompleted) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationItemInputAudioTranscriptionCompleted.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationItemInputAudioTranscriptionCompleted.type) &&
        Objects.equals(this.itemId, realtimeServerEventConversationItemInputAudioTranscriptionCompleted.itemId) &&
        Objects.equals(this.contentIndex, realtimeServerEventConversationItemInputAudioTranscriptionCompleted.contentIndex) &&
        Objects.equals(this.transcript, realtimeServerEventConversationItemInputAudioTranscriptionCompleted.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId, contentIndex, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

