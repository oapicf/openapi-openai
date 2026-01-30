package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The content part that was added.
 */
@ApiModel(description="The content part that was added.")

public class RealtimeServerEventResponseContentPartAddedPart  {
  
public enum TypeEnum {

    @JsonProperty("audio") AUDIO(String.valueOf("audio")),
    @JsonProperty("text") TEXT(String.valueOf("text"));

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
  * The content type (\"text\", \"audio\").
  */
  @ApiModelProperty(value = "The content type (\"text\", \"audio\").")
  private TypeEnum type;

 /**
  * The text content (if type is \"text\").
  */
  @ApiModelProperty(value = "The text content (if type is \"text\").")
  private String text;

 /**
  * Base64-encoded audio data (if type is \"audio\").
  */
  @ApiModelProperty(value = "Base64-encoded audio data (if type is \"audio\").")
  private String audio;

 /**
  * The transcript of the audio (if type is \"audio\").
  */
  @ApiModelProperty(value = "The transcript of the audio (if type is \"audio\").")
  private String transcript;
 /**
  * The content type (\&quot;text\&quot;, \&quot;audio\&quot;).
  * @return type
  */
  @JsonProperty("type")
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
  public RealtimeServerEventResponseContentPartAddedPart type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text content (if type is \&quot;text\&quot;).
  * @return text
  */
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public RealtimeServerEventResponseContentPartAddedPart text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Base64-encoded audio data (if type is \&quot;audio\&quot;).
  * @return audio
  */
  @JsonProperty("audio")
  public String getAudio() {
    return audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
 public void setAudio(String audio) {
    this.audio = audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
  public RealtimeServerEventResponseContentPartAddedPart audio(String audio) {
    this.audio = audio;
    return this;
  }

 /**
  * The transcript of the audio (if type is \&quot;audio\&quot;).
  * @return transcript
  */
  @JsonProperty("transcript")
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
  public RealtimeServerEventResponseContentPartAddedPart transcript(String transcript) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

