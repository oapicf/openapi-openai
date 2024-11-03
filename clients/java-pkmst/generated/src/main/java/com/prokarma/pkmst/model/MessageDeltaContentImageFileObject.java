package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.MessageDeltaContentImageFileObjectImageFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
@ApiModel(description = "References an image [File](/docs/api-reference/files) in the content of a message.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T11:07:18.723034005Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MessageDeltaContentImageFileObject   {
  @JsonProperty("index")
  private Integer index;

  /**
   * Always `image_file`.
   */
  public enum TypeEnum {
    IMAGE_FILE("image_file");

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

  public MessageDeltaContentImageFileObject index(Integer index) {
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

  public MessageDeltaContentImageFileObject type(TypeEnum type) {
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

  public MessageDeltaContentImageFileObject imageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
    return this;
  }

  /**
   * Get imageFile
   * @return imageFile
   */
  @ApiModelProperty(value = "")
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

