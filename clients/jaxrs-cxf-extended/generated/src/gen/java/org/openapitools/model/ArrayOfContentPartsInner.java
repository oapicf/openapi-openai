package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageContentImageFileObject;
import org.openapitools.model.MessageContentImageFileObjectImageFile;
import org.openapitools.model.MessageContentImageUrlObject;
import org.openapitools.model.MessageContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageRequestContentTextObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArrayOfContentPartsInner  {
  
public enum TypeEnum {

    @JsonProperty("image_file") IMAGE_FILE(String.valueOf("image_file")),
    @JsonProperty("image_url") IMAGE_URL(String.valueOf("image_url")),
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MessageContentImageFileObjectImageFile imageFile;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MessageContentImageUrlObjectImageUrl imageUrl;

 /**
  * Text content to be sent to the model
  */
  @ApiModelProperty(required = true, value = "Text content to be sent to the model")
  private String text;
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
  public ArrayOfContentPartsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get imageFile
  * @return imageFile
  */
  @JsonProperty("image_file")
  @NotNull
  public MessageContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  /**
   * Sets the <code>imageFile</code> property.
   */
 public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  /**
   * Sets the <code>imageFile</code> property.
   */
  public ArrayOfContentPartsInner imageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

 /**
  * Get imageUrl
  * @return imageUrl
  */
  @JsonProperty("image_url")
  @NotNull
  public MessageContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
 public void setImageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
  public ArrayOfContentPartsInner imageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
  * Text content to be sent to the model
  * @return text
  */
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
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

