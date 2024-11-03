package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageContentPartImage;
import org.openapitools.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import org.openapitools.model.ChatCompletionRequestMessageContentPartText;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-03T11:08:59.005260670Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
  }

  private TypeEnum type;
  private String text;
  private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

  /**
   * The type of the content part.
   **/
  
  @ApiModelProperty(required = true, value = "The type of the content part.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text content.
   **/
  
  @ApiModelProperty(required = true, value = "The text content.")
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("image_url")
  @NotNull
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

