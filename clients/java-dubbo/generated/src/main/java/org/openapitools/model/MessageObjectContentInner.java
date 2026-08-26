package org.openapitools.model;

import org.openapitools.model.MessageContentImageFileObject;
import org.openapitools.model.MessageContentImageFileObjectImageFile;
import org.openapitools.model.MessageContentImageUrlObject;
import org.openapitools.model.MessageContentImageUrlObjectImageUrl;
import org.openapitools.model.MessageContentRefusalObject;
import org.openapitools.model.MessageContentTextObject;
import org.openapitools.model.MessageContentTextObjectText;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MessageObjectContentInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Always &#x60;image_file&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("image_file")
  private MessageContentImageFileObjectImageFile imageFile;

  @JsonProperty("image_url")
  private MessageContentImageUrlObjectImageUrl imageUrl;

  @JsonProperty("text")
  private MessageContentTextObjectText text;

  @JsonProperty("refusal")
  private String refusal;

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
  public MessageContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }

  public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  /**
   * 
   * @return imageUrl
   */
  public MessageContentImageUrlObjectImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * 
   * @return text
   */
  public MessageContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageContentTextObjectText text) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageObjectContentInner messageObjectContentInner = (MessageObjectContentInner) o;
    return Objects.equals(this.type, messageObjectContentInner.type) &&
        Objects.equals(this.imageFile, messageObjectContentInner.imageFile) &&
        Objects.equals(this.imageUrl, messageObjectContentInner.imageUrl) &&
        Objects.equals(this.text, messageObjectContentInner.text) &&
        Objects.equals(this.refusal, messageObjectContentInner.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile, imageUrl, text, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObjectContentInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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
