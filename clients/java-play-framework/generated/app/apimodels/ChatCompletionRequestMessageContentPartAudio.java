package apimodels;

import apimodels.ChatCompletionRequestMessageContentPartAudioInputAudio;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Learn about [audio inputs](/docs/guides/audio). 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionRequestMessageContentPartAudio   {
  /**
   * The type of the content part. Always `input_audio`.
   */
  public enum TypeEnum {
    INPUT_AUDIO("input_audio");

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

  @JsonProperty("input_audio")
  @NotNull
@Valid

  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  public ChatCompletionRequestMessageContentPartAudio type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the content part. Always `input_audio`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionRequestMessageContentPartAudio inputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
    return this;
  }

   /**
   * Get inputAudio
   * @return inputAudio
  **/
  public ChatCompletionRequestMessageContentPartAudioInputAudio getInputAudio() {
    return inputAudio;
  }

  public void setInputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessageContentPartAudio chatCompletionRequestMessageContentPartAudio = (ChatCompletionRequestMessageContentPartAudio) o;
    return Objects.equals(type, chatCompletionRequestMessageContentPartAudio.type) &&
        Objects.equals(inputAudio, chatCompletionRequestMessageContentPartAudio.inputAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inputAudio);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartAudio {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inputAudio: ").append(toIndentedString(inputAudio)).append("\n");
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

