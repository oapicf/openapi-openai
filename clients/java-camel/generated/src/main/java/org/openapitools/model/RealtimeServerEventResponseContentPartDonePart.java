package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The content part that is done.
 */

@Schema(name = "RealtimeServerEventResponseContentPartDone_part", description = "The content part that is done.")
@JsonTypeName("RealtimeServerEventResponseContentPartDone_part")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseContentPartDonePart {

  /**
   * The content type (\"text\", \"audio\").
   */
  public enum TypeEnum {
    AUDIO("audio"),
    
    TEXT("text");

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

  private String text;

  private String audio;

  private String transcript;

  public RealtimeServerEventResponseContentPartDonePart type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The content type (\"text\", \"audio\").
   * @return type
   */
  
  @Schema(name = "type", description = "The content type (\"text\", \"audio\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseContentPartDonePart text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content (if type is \"text\").
   * @return text
   */
  
  @Schema(name = "text", description = "The text content (if type is \"text\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RealtimeServerEventResponseContentPartDonePart audio(String audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Base64-encoded audio data (if type is \"audio\").
   * @return audio
   */
  
  @Schema(name = "audio", description = "Base64-encoded audio data (if type is \"audio\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audio")
  public String getAudio() {
    return audio;
  }

  public void setAudio(String audio) {
    this.audio = audio;
  }

  public RealtimeServerEventResponseContentPartDonePart transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * The transcript of the audio (if type is \"audio\").
   * @return transcript
   */
  
  @Schema(name = "transcript", description = "The transcript of the audio (if type is \"audio\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RealtimeServerEventResponseContentPartDonePart realtimeServerEventResponseContentPartDonePart = (RealtimeServerEventResponseContentPartDonePart) o;
    return Objects.equals(this.type, realtimeServerEventResponseContentPartDonePart.type) &&
        Objects.equals(this.text, realtimeServerEventResponseContentPartDonePart.text) &&
        Objects.equals(this.audio, realtimeServerEventResponseContentPartDonePart.audio) &&
        Objects.equals(this.transcript, realtimeServerEventResponseContentPartDonePart.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, audio, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseContentPartDonePart {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

