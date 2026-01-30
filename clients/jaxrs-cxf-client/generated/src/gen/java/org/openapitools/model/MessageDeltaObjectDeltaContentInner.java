package org.openapitools.model;

import org.openapitools.model.MessageDeltaContentImageFileObject;
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import org.openapitools.model.MessageDeltaContentImageUrlObject;
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageDeltaContentRefusalObject;
import org.openapitools.model.MessageDeltaContentTextObject;
import org.openapitools.model.MessageDeltaContentTextObjectText;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageDeltaObjectDeltaContentInner  {
  
 /**
  * The index of the content part in the message.
  */
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")

  private Integer index;

public enum TypeEnum {

IMAGE_FILE(String.valueOf("image_file")), TEXT(String.valueOf("text")), REFUSAL(String.valueOf("refusal")), IMAGE_URL(String.valueOf("image_url"));


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
  * Always `image_file`.
  */
  @ApiModelProperty(required = true, value = "Always `image_file`.")

  private TypeEnum type;

  @ApiModelProperty(value = "")

  private MessageDeltaContentImageFileObjectImageFile imageFile;

  @ApiModelProperty(value = "")

  private MessageDeltaContentTextObjectText text;

  @ApiModelProperty(value = "")

  private String refusal;

  @ApiModelProperty(value = "")

  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;
 /**
   * The index of the content part in the message.
   * @return index
  **/
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaObjectDeltaContentInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Always &#x60;image_file&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaObjectDeltaContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get imageFile
   * @return imageFile
  **/
  @JsonProperty("image_file")
  public MessageDeltaContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  public MessageDeltaObjectDeltaContentInner imageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

 /**
   * Get text
   * @return text
  **/
  @JsonProperty("text")
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }

  public MessageDeltaObjectDeltaContentInner text(MessageDeltaContentTextObjectText text) {
    this.text = text;
    return this;
  }

 /**
   * Get refusal
   * @return refusal
  **/
  @JsonProperty("refusal")
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  public MessageDeltaObjectDeltaContentInner refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

 /**
   * Get imageUrl
   * @return imageUrl
  **/
  @JsonProperty("image_url")
  public MessageDeltaContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MessageDeltaObjectDeltaContentInner imageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

