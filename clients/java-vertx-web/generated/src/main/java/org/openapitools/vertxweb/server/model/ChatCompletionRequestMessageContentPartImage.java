package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartImageImageUrl;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestMessageContentPartImage   {
  


  public enum TypeEnum {
    IMAGE_URL("image_url");

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
  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  public ChatCompletionRequestMessageContentPartImage () {

  }

  public ChatCompletionRequestMessageContentPartImage (TypeEnum type, ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.type = type;
    this.imageUrl = imageUrl;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("image_url")
  public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessageContentPartImage chatCompletionRequestMessageContentPartImage = (ChatCompletionRequestMessageContentPartImage) o;
    return Objects.equals(type, chatCompletionRequestMessageContentPartImage.type) &&
        Objects.equals(imageUrl, chatCompletionRequestMessageContentPartImage.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartImage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
