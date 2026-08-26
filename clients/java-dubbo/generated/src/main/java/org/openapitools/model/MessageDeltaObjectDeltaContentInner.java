package org.openapitools.model;

import org.openapitools.model.MessageDeltaContentImageFileObject;
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile;
import org.openapitools.model.MessageDeltaContentImageUrlObject;
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageDeltaContentRefusalObject;
import org.openapitools.model.MessageDeltaContentTextObject;
import org.openapitools.model.MessageDeltaContentTextObjectText;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MessageDeltaObjectDeltaContentInner implements Serializable {
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

  @JsonProperty("text")
  private MessageDeltaContentTextObjectText text;

  @JsonProperty("refusal")
  private String refusal;

  @JsonProperty("image_url")
  private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

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

  /**
   * 
   * @return text
   */
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }

  /**
   * 
   * @return refusal
   */
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  /**
   * 
   * @return imageUrl
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
