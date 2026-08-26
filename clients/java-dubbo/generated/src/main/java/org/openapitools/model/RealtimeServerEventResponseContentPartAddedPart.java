package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The content part that was added.
 */
public class RealtimeServerEventResponseContentPartAddedPart implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The content type (\&quot;text\&quot;, \&quot;audio\&quot;).
   */
  @JsonProperty("type")
  private String type;

  /**
   * The text content (if type is \&quot;text\&quot;).
   */
  @JsonProperty("text")
  private String text;

  /**
   * Base64-encoded audio data (if type is \&quot;audio\&quot;).
   */
  @JsonProperty("audio")
  private String audio;

  /**
   * The transcript of the audio (if type is \&quot;audio\&quot;).
   */
  @JsonProperty("transcript")
  private String transcript;

  /**
   * The content type (\&quot;text\&quot;, \&quot;audio\&quot;).
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The text content (if type is \&quot;text\&quot;).
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /**
   * Base64-encoded audio data (if type is \&quot;audio\&quot;).
   * @return audio
   */
  public String getAudio() {
    return audio;
  }

  public void setAudio(String audio) {
    this.audio = audio;
  }

  /**
   * The transcript of the audio (if type is \&quot;audio\&quot;).
   * @return transcript
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
