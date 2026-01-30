package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The content part that is done.
 */
@ApiModel(description = "The content part that is done.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseContentPartDonePart   {
  /**
   * The content type (\"text\", \"audio\").
   */
  public enum TypeEnum {
    AUDIO("audio"),
    
    TEXT("text");

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

  @JsonProperty("text")
  private String text;

  @JsonProperty("audio")
  private String audio;

  @JsonProperty("transcript")
  private String transcript;

  public RealtimeServerEventResponseContentPartDonePart type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The content type (\"text\", \"audio\").
   * @return type
   */
  @ApiModelProperty(value = "The content type (\"text\", \"audio\").")
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
  @ApiModelProperty(value = "The text content (if type is \"text\").")
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
  @ApiModelProperty(value = "Base64-encoded audio data (if type is \"audio\").")
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
  @ApiModelProperty(value = "The transcript of the audio (if type is \"audio\").")
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

