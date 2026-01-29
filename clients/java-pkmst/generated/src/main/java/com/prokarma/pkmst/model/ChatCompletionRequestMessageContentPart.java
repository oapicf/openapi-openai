package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ChatCompletionRequestMessageContentPartImage;
import com.prokarma.pkmst.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import com.prokarma.pkmst.model.ChatCompletionRequestMessageContentPartText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ChatCompletionRequestMessageContentPart
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T10:45:02.588292416Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestMessageContentPart   {
  /**
   * The type of the content part.
   */
  public enum TypeEnum {
    TEXT("text"),
    
    IMAGE_URL("image_url");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("text")
  private String text;

  @JsonProperty("image_url")
  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  public ChatCompletionRequestMessageContentPart type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the content part.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The type of the content part.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionRequestMessageContentPart text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content.
   * @return text
   */
  @ApiModelProperty(required = true, value = "The text content.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ChatCompletionRequestMessageContentPart imageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  @ApiModelProperty(required = true, value = "")
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
    ChatCompletionRequestMessageContentPart chatCompletionRequestMessageContentPart = (ChatCompletionRequestMessageContentPart) o;
    return Objects.equals(this.type, chatCompletionRequestMessageContentPart.type) &&
        Objects.equals(this.text, chatCompletionRequestMessageContentPart.text) &&
        Objects.equals(this.imageUrl, chatCompletionRequestMessageContentPart.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPart {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

