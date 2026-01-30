package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * The content part that was added.
 */

@Schema(name = "RealtimeServerEventResponseContentPartAdded_part", description = "The content part that was added.")
@JsonTypeName("RealtimeServerEventResponseContentPartAdded_part")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseContentPartAddedPart {

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

  private @Nullable TypeEnum type;

  private @Nullable String text;

  private @Nullable String audio;

  private @Nullable String transcript;

  public RealtimeServerEventResponseContentPartAddedPart type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The content type (\"text\", \"audio\").
   * @return type
   */
  
  @Schema(name = "type", description = "The content type (\"text\", \"audio\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseContentPartAddedPart text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content (if type is \"text\").
   * @return text
   */
  
  @Schema(name = "text", description = "The text content (if type is \"text\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public RealtimeServerEventResponseContentPartAddedPart audio(@Nullable String audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Base64-encoded audio data (if type is \"audio\").
   * @return audio
   */
  
  @Schema(name = "audio", description = "Base64-encoded audio data (if type is \"audio\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audio")
  public @Nullable String getAudio() {
    return audio;
  }

  public void setAudio(@Nullable String audio) {
    this.audio = audio;
  }

  public RealtimeServerEventResponseContentPartAddedPart transcript(@Nullable String transcript) {
    this.transcript = transcript;
    return this;
  }

  /**
   * The transcript of the audio (if type is \"audio\").
   * @return transcript
   */
  
  @Schema(name = "transcript", description = "The transcript of the audio (if type is \"audio\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transcript")
  public @Nullable String getTranscript() {
    return transcript;
  }

  public void setTranscript(@Nullable String transcript) {
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
    RealtimeServerEventResponseContentPartAddedPart realtimeServerEventResponseContentPartAddedPart = (RealtimeServerEventResponseContentPartAddedPart) o;
    return Objects.equals(this.type, realtimeServerEventResponseContentPartAddedPart.type) &&
        Objects.equals(this.text, realtimeServerEventResponseContentPartAddedPart.text) &&
        Objects.equals(this.audio, realtimeServerEventResponseContentPartAddedPart.audio) &&
        Objects.equals(this.transcript, realtimeServerEventResponseContentPartAddedPart.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, audio, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseContentPartAddedPart {\n");
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

