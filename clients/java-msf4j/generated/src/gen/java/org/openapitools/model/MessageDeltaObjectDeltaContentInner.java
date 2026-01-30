package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentImageFileObject;
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import org.openapitools.model.MessageDeltaContentImageUrlObject;
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageDeltaContentRefusalObject;
import org.openapitools.model.MessageDeltaContentTextObject;
import org.openapitools.model.MessageDeltaContentTextObjectText;

/**
 * MessageDeltaObjectDeltaContentInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaObjectDeltaContentInner   {
  @JsonProperty("index")
  private Integer index;

  /**
   * Always `image_file`.
   */
  public enum TypeEnum {
    IMAGE_FILE("image_file"),
    
    TEXT("text"),
    
    REFUSAL("refusal"),
    
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

  @JsonProperty("image_file")
  private MessageDeltaContentImageFileObjectImageFile imageFile;

  @JsonProperty("text")
  private MessageDeltaContentTextObjectText text;

  @JsonProperty("refusal")
  private String refusal;

  @JsonProperty("image_url")
  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

  public MessageDeltaObjectDeltaContentInner index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the content part in the message.
   * @return index
  **/
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaObjectDeltaContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `image_file`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Always `image_file`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaObjectDeltaContentInner imageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

   /**
   * Get imageFile
   * @return imageFile
  **/
  @ApiModelProperty(value = "")
  public MessageDeltaContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  public MessageDeltaObjectDeltaContentInner text(MessageDeltaContentTextObjectText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }

  public MessageDeltaObjectDeltaContentInner refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

   /**
   * Get refusal
   * @return refusal
  **/
  @ApiModelProperty(value = "")
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  public MessageDeltaObjectDeltaContentInner imageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
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
    MessageDeltaObjectDeltaContentInner messageDeltaObjectDeltaContentInner = (MessageDeltaObjectDeltaContentInner) o;
    return Objects.equals(this.index, messageDeltaObjectDeltaContentInner.index) &&
        Objects.equals(this.type, messageDeltaObjectDeltaContentInner.type) &&
        Objects.equals(this.imageFile, messageDeltaObjectDeltaContentInner.imageFile) &&
        Objects.equals(this.text, messageDeltaObjectDeltaContentInner.text) &&
        Objects.equals(this.refusal, messageDeltaObjectDeltaContentInner.refusal) &&
        Objects.equals(this.imageUrl, messageDeltaObjectDeltaContentInner.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageFile, text, refusal, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaObjectDeltaContentInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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

