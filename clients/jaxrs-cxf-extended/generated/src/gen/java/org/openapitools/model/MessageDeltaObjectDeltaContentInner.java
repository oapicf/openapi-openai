package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentImageFileObject;
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import org.openapitools.model.MessageDeltaContentTextObject;
import org.openapitools.model.MessageDeltaContentTextObjectText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageDeltaObjectDeltaContentInner  {
  
 /**
  * The index of the content part in the message.
  */
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")
  private Integer index;

public enum TypeEnum {

    @JsonProperty("image_file") IMAGE_FILE(String.valueOf("image_file")),
    @JsonProperty("text") TEXT(String.valueOf("text"));

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
  @Valid
  private MessageDeltaContentImageFileObjectImageFile imageFile;

  @ApiModelProperty(value = "")
  @Valid
  private MessageDeltaContentTextObjectText text;
 /**
  * The index of the content part in the message.
  * @return index
  */
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public MessageDeltaObjectDeltaContentInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * Always &#x60;image_file&#x60;.
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
  public MessageDeltaObjectDeltaContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get imageFile
  * @return imageFile
  */
  @JsonProperty("image_file")
  public MessageDeltaContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  /**
   * Sets the <code>imageFile</code> property.
   */
 public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  /**
   * Sets the <code>imageFile</code> property.
   */
  public MessageDeltaObjectDeltaContentInner imageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

 /**
  * Get text
  * @return text
  */
  @JsonProperty("text")
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public MessageDeltaObjectDeltaContentInner text(MessageDeltaContentTextObjectText text) {
    this.text = text;
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
        Objects.equals(this.text, messageDeltaObjectDeltaContentInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageFile, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaObjectDeltaContentInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

