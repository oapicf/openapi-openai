package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The content part that was added.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseContentPartAddedPart   {
  

  /**
   * The content type (\&quot;text\&quot;, \&quot;audio\&quot;).
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
  }

  private TypeEnum type;
  private String text;
  private String audio;
  private String transcript;

  /**
   * The content type (\&quot;text\&quot;, \&quot;audio\&quot;).
   **/
  
  @ApiModelProperty(value = "The content type (\"text\", \"audio\").")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text content (if type is \&quot;text\&quot;).
   **/
  
  @ApiModelProperty(value = "The text content (if type is \"text\").")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Base64-encoded audio data (if type is \&quot;audio\&quot;).
   **/
  
  @ApiModelProperty(value = "Base64-encoded audio data (if type is \"audio\").")
  @JsonProperty("audio")
  public String getAudio() {
    return audio;
  }
  public void setAudio(String audio) {
    this.audio = audio;
  }

  /**
   * The transcript of the audio (if type is \&quot;audio\&quot;).
   **/
  
  @ApiModelProperty(value = "The transcript of the audio (if type is \"audio\").")
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

