package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartAudio;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartAudioInputAudio;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartImage;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestUserMessageContentPart   {
  


  public enum TypeEnum {
    TEXT("text"),
    IMAGE_URL("image_url"),
    INPUT_AUDIO("input_audio");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private String text;
  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;
  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  public ChatCompletionRequestUserMessageContentPart () {

  }

  public ChatCompletionRequestUserMessageContentPart (TypeEnum type, String text, ChatCompletionRequestMessageContentPartImageImageUrl imageUrl, ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.type = type;
    this.text = text;
    this.imageUrl = imageUrl;
    this.inputAudio = inputAudio;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

    
  @JsonProperty("image_url")
  public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

    
  @JsonProperty("input_audio")
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
