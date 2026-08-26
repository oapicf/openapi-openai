package org.openapitools.model;

import org.openapitools.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Learn about [image inputs](/docs/guides/vision). 
 */
public class ChatCompletionRequestMessageContentPartImage implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of the content part.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("image_url")
  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  /**
   * The type of the content part.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return imageUrl
   */
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
    return Objects.equals(this.type, chatCompletionRequestMessageContentPartImage.type) &&
        Objects.equals(this.imageUrl, chatCompletionRequestMessageContentPartImage.imageUrl);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
