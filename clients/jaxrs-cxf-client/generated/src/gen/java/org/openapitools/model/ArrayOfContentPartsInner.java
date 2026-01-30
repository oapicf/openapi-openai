package org.openapitools.model;

import org.openapitools.model.MessageContentImageFileObject;
import org.openapitools.model.MessageContentImageFileObjectImageFile;
import org.openapitools.model.MessageContentImageUrlObject;
import org.openapitools.model.MessageContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageRequestContentTextObject;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArrayOfContentPartsInner  {
  
public enum TypeEnum {

IMAGE_FILE(String.valueOf("image_file")), IMAGE_URL(String.valueOf("image_url")), TEXT(String.valueOf("text"));


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

  @ApiModelProperty(required = true, value = "")

  private MessageContentImageFileObjectImageFile imageFile;

  @ApiModelProperty(required = true, value = "")

  private MessageContentImageUrlObjectImageUrl imageUrl;

 /**
  * Text content to be sent to the model
  */
  @ApiModelProperty(required = true, value = "Text content to be sent to the model")

  private String text;
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

  public ArrayOfContentPartsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get imageFile
   * @return imageFile
  **/
  @JsonProperty("image_file")
  public MessageContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  public ArrayOfContentPartsInner imageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

 /**
   * Get imageUrl
   * @return imageUrl
  **/
  @JsonProperty("image_url")
  public MessageContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ArrayOfContentPartsInner imageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
   * Text content to be sent to the model
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ArrayOfContentPartsInner text(String text) {
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
    ArrayOfContentPartsInner arrayOfContentPartsInner = (ArrayOfContentPartsInner) o;
    return Objects.equals(this.type, arrayOfContentPartsInner.type) &&
        Objects.equals(this.imageFile, arrayOfContentPartsInner.imageFile) &&
        Objects.equals(this.imageUrl, arrayOfContentPartsInner.imageUrl) &&
        Objects.equals(this.text, arrayOfContentPartsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile, imageUrl, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfContentPartsInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

