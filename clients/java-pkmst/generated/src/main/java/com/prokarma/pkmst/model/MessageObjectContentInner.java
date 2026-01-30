package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.MessageContentImageFileObject;
import com.prokarma.pkmst.model.MessageContentImageFileObjectImageFile;
import com.prokarma.pkmst.model.MessageContentImageUrlObject;
import com.prokarma.pkmst.model.MessageContentImageUrlObjectImageUrl;
import com.prokarma.pkmst.model.MessageContentRefusalObject;
import com.prokarma.pkmst.model.MessageContentTextObject;
import com.prokarma.pkmst.model.MessageContentTextObjectText;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MessageObjectContentInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageObjectContentInner   {
  /**
   * Always `image_file`.
   */
  public enum TypeEnum {
    IMAGE_FILE("image_file"),
    
    IMAGE_URL("image_url"),
    
    TEXT("text"),
    
    REFUSAL("refusal");

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

  @JsonProperty("image_file")
  private MessageContentImageFileObjectImageFile imageFile;

  @JsonProperty("image_url")
  private MessageContentImageUrlObjectImageUrl imageUrl;

  @JsonProperty("text")
  private MessageContentTextObjectText text;

  @JsonProperty("refusal")
  private String refusal;

  public MessageObjectContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `image_file`.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Always `image_file`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageObjectContentInner imageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

  /**
   * Get imageFile
   * @return imageFile
   */
  @ApiModelProperty(required = true, value = "")
  public MessageContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  public MessageObjectContentInner imageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  @ApiModelProperty(required = true, value = "")
  public MessageContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MessageObjectContentInner text(MessageContentTextObjectText text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   */
  @ApiModelProperty(required = true, value = "")
  public MessageContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageContentTextObjectText text) {
    this.text = text;
  }

  public MessageObjectContentInner refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

  /**
   * Get refusal
   * @return refusal
   */
  @ApiModelProperty(required = true, value = "")
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageObjectContentInner messageObjectContentInner = (MessageObjectContentInner) o;
    return Objects.equals(this.type, messageObjectContentInner.type) &&
        Objects.equals(this.imageFile, messageObjectContentInner.imageFile) &&
        Objects.equals(this.imageUrl, messageObjectContentInner.imageUrl) &&
        Objects.equals(this.text, messageObjectContentInner.text) &&
        Objects.equals(this.refusal, messageObjectContentInner.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile, imageUrl, text, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObjectContentInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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

