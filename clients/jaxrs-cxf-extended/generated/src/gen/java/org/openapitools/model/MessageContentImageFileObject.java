package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.MessageContentImageFileObjectImageFile;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
@ApiModel(description="References an image [File](/docs/api-reference/files) in the content of a message.")

public class MessageContentImageFileObject  {
  
public enum TypeEnum {

    @JsonProperty("image_file") IMAGE_FILE(String.valueOf("image_file"));

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
  public MessageContentImageFileObject type(TypeEnum type) {
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
  public MessageContentImageFileObject imageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
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
    MessageContentImageFileObject messageContentImageFileObject = (MessageContentImageFileObject) o;
    return Objects.equals(this.type, messageContentImageFileObject.type) &&
        Objects.equals(this.imageFile, messageContentImageFileObject.imageFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentImageFileObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
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

