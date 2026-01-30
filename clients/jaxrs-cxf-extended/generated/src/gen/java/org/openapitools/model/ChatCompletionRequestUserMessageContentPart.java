package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudio;
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio;
import org.openapitools.model.ChatCompletionRequestMessageContentPartImage;
import org.openapitools.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import org.openapitools.model.ChatCompletionRequestMessageContentPartText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestUserMessageContentPart  {
  
public enum TypeEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")),
    @JsonProperty("image_url") IMAGE_URL(String.valueOf("image_url")),
    @JsonProperty("input_audio") INPUT_AUDIO(String.valueOf("input_audio"));

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
  * The type of the content part.
  */
  @ApiModelProperty(required = true, value = "The type of the content part.")
  private TypeEnum type;

 /**
  * The text content.
  */
  @ApiModelProperty(required = true, value = "The text content.")
  private String text;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;
 /**
  * The type of the content part.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
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
  public ChatCompletionRequestUserMessageContentPart type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text content.
  * @return text
  */
  @JsonProperty("text")
  @NotNull
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
  public ChatCompletionRequestUserMessageContentPart text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Get imageUrl
  * @return imageUrl
  */
  @JsonProperty("image_url")
  @NotNull
  public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
    return imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
 public void setImageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
  public ChatCompletionRequestUserMessageContentPart imageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
  * Get inputAudio
  * @return inputAudio
  */
  @JsonProperty("input_audio")
  @NotNull
  public ChatCompletionRequestMessageContentPartAudioInputAudio getInputAudio() {
    return inputAudio;
  }

  /**
   * Sets the <code>inputAudio</code> property.
   */
 public void setInputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
  }

  /**
   * Sets the <code>inputAudio</code> property.
   */
  public ChatCompletionRequestUserMessageContentPart inputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
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
    ChatCompletionRequestUserMessageContentPart chatCompletionRequestUserMessageContentPart = (ChatCompletionRequestUserMessageContentPart) o;
    return Objects.equals(this.type, chatCompletionRequestUserMessageContentPart.type) &&
        Objects.equals(this.text, chatCompletionRequestUserMessageContentPart.text) &&
        Objects.equals(this.imageUrl, chatCompletionRequestUserMessageContentPart.imageUrl) &&
        Objects.equals(this.inputAudio, chatCompletionRequestUserMessageContentPart.inputAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, imageUrl, inputAudio);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

