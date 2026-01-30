package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The content part that is done.
 */
@ApiModel(description="The content part that is done.")

public class RealtimeServerEventResponseContentPartDonePart  {
  
public enum TypeEnum {

AUDIO(String.valueOf("audio")), TEXT(String.valueOf("text"));


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
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseContentPartDonePart type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The text content (if type is \&quot;text\&quot;).
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RealtimeServerEventResponseContentPartDonePart text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Base64-encoded audio data (if type is \&quot;audio\&quot;).
   * @return audio
  **/
  @JsonProperty("audio")
  public String getAudio() {
    return audio;
  }

  public void setAudio(String audio) {
    this.audio = audio;
  }

  public RealtimeServerEventResponseContentPartDonePart audio(String audio) {
    this.audio = audio;
    return this;
  }

 /**
   * The transcript of the audio (if type is \&quot;audio\&quot;).
   * @return transcript
  **/
  @JsonProperty("transcript")
  public String getTranscript() {
    return transcript;
  }

  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }

  public RealtimeServerEventResponseContentPartDonePart transcript(String transcript) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

