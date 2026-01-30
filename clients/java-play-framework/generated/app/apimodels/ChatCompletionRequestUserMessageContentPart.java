package apimodels;

import apimodels.ChatCompletionRequestMessageContentPartAudio;
import apimodels.ChatCompletionRequestMessageContentPartAudioInputAudio;
import apimodels.ChatCompletionRequestMessageContentPartImage;
import apimodels.ChatCompletionRequestMessageContentPartImageImageUrl;
import apimodels.ChatCompletionRequestMessageContentPartText;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChatCompletionRequestUserMessageContentPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionRequestUserMessageContentPart   {
  /**
   * The type of the content part.
   */
  public enum TypeEnum {
    TEXT("text"),
    
    IMAGE_URL("image_url"),
    
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

  @JsonProperty("text")
  @NotNull

  private String text;

  @JsonProperty("image_url")
  @NotNull
@Valid

  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  @JsonProperty("input_audio")
  @NotNull
@Valid

  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  public ChatCompletionRequestUserMessageContentPart type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the content part.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionRequestUserMessageContentPart text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text content.
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ChatCompletionRequestUserMessageContentPart imageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ChatCompletionRequestUserMessageContentPart inputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
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
    ChatCompletionRequestUserMessageContentPart chatCompletionRequestUserMessageContentPart = (ChatCompletionRequestUserMessageContentPart) o;
    return Objects.equals(type, chatCompletionRequestUserMessageContentPart.type) &&
        Objects.equals(text, chatCompletionRequestUserMessageContentPart.text) &&
        Objects.equals(imageUrl, chatCompletionRequestUserMessageContentPart.imageUrl) &&
        Objects.equals(inputAudio, chatCompletionRequestUserMessageContentPart.inputAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, imageUrl, inputAudio);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestUserMessageContentPart {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

