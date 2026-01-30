package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.MessageDeltaContentImageUrlObjectImageUrl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * References an image URL in the content of a message.
 */
@ApiModel(description = "References an image URL in the content of a message.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentImageUrlObject   {
  @JsonProperty("index")
  private Integer index;

  /**
   * Always `image_url`.
   */
  public enum TypeEnum {
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

  @JsonProperty("image_url")
  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  public MessageDeltaContentImageUrlObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the content part in the message.
   * @return index
   */
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentImageUrlObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `image_url`.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Always `image_url`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentImageUrlObject imageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */
  @ApiModelProperty(value = "")
  public MessageDeltaContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
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
    MessageDeltaContentImageUrlObject messageDeltaContentImageUrlObject = (MessageDeltaContentImageUrlObject) o;
    return Objects.equals(this.index, messageDeltaContentImageUrlObject.index) &&
        Objects.equals(this.type, messageDeltaContentImageUrlObject.type) &&
        Objects.equals(this.imageUrl, messageDeltaContentImageUrlObject.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentImageUrlObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

