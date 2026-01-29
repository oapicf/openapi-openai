package org.openapitools.model;

import org.openapitools.model.MessageContentTextObjectText;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The text content that is part of a message.
 */
@ApiModel(description="The text content that is part of a message.")

public class MessageContentTextObject  {
  
public enum TypeEnum {

TEXT(String.valueOf("text"));


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
  * Always `text`.
  */
  @ApiModelProperty(required = true, value = "Always `text`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  private MessageContentTextObjectText text;
 /**
   * Always &#x60;text&#x60;.
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

  public MessageContentTextObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get text
   * @return text
  **/
  @JsonProperty("text")
  public MessageContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageContentTextObjectText text) {
    this.text = text;
  }

  public MessageContentTextObject text(MessageContentTextObjectText text) {
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
    MessageContentTextObject messageContentTextObject = (MessageContentTextObject) o;
    return Objects.equals(this.type, messageContentTextObject.type) &&
        Objects.equals(this.text, messageContentTextObject.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

