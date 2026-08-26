package org.openapitools.model;

import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
public class MessageDeltaContentImageFileObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of the content part in the message.
   */
  @JsonProperty("index")
  private Integer index;

  /**
   * Always &#x60;image_file&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("image_file")
  private MessageDeltaContentImageFileObjectImageFile imageFile;

  /**
   * The index of the content part in the message.
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always &#x60;image_file&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return imageFile
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
