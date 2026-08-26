package org.openapitools.model;

import org.openapitools.model.MessageDeltaContentTextObjectText;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The text content that is part of a message.
 */
public class MessageDeltaContentTextObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of the content part in the message.
   */
  @JsonProperty("index")
  private Integer index;

  /**
   * Always &#x60;text&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("text")
  private MessageDeltaContentTextObjectText text;

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
   * Always &#x60;text&#x60;.
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
   * @return text
   */
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentTextObject messageDeltaContentTextObject = (MessageDeltaContentTextObject) o;
    return Objects.equals(this.index, messageDeltaContentTextObject.index) &&
        Objects.equals(this.type, messageDeltaContentTextObject.type) &&
        Objects.equals(this.text, messageDeltaContentTextObject.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
