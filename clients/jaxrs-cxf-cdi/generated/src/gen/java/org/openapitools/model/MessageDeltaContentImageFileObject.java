package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "References an image [File](/docs/api-reference/files) in the content of a message.")
public class MessageDeltaContentImageFileObject   {
  
  private Integer index;


public enum TypeEnum {

    @JsonProperty("image_file") IMAGE_FILE(String.valueOf("image_file"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private MessageDeltaContentImageFileObjectImageFile imageFile;

  /**
   * The index of the content part in the message.
   **/
  public MessageDeltaContentImageFileObject index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }


  /**
   * Always &#x60;image_file&#x60;.
   **/
  public MessageDeltaContentImageFileObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `image_file`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public MessageDeltaContentImageFileObject imageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_file")
  public MessageDeltaContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }
  public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentImageFileObject messageDeltaContentImageFileObject = (MessageDeltaContentImageFileObject) o;
    return Objects.equals(this.index, messageDeltaContentImageFileObject.index) &&
        Objects.equals(this.type, messageDeltaContentImageFileObject.type) &&
        Objects.equals(this.imageFile, messageDeltaContentImageFileObject.imageFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentImageFileObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
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

