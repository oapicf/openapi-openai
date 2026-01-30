package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The content part that is done.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeServerEventResponseContentPartDonePart   {
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
  **/
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
  **/
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
  **/
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
    RealtimeServerEventResponseContentPartDonePart realtimeServerEventResponseContentPartDonePart = (RealtimeServerEventResponseContentPartDonePart) o;
    return Objects.equals(type, realtimeServerEventResponseContentPartDonePart.type) &&
        Objects.equals(text, realtimeServerEventResponseContentPartDonePart.text) &&
        Objects.equals(audio, realtimeServerEventResponseContentPartDonePart.audio) &&
        Objects.equals(transcript, realtimeServerEventResponseContentPartDonePart.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, audio, transcript);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

