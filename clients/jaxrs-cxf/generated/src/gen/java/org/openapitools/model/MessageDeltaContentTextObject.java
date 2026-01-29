package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentTextObjectText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The text content that is part of a message.
 */
@ApiModel(description="The text content that is part of a message.")

public class MessageDeltaContentTextObject  {
  
 /**
  * The index of the content part in the message.
  */
  @ApiModelProperty(required = true, value = "The index of the content part in the message.")

  private Integer index;

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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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

  @ApiModelProperty(value = "")

  @Valid

  private MessageDeltaContentTextObjectText text;
 /**
   * The index of the content part in the message.
   * @return index
  **/
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentTextObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Always &#x60;text&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentTextObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get text
   * @return text
  **/
  @JsonProperty("text")
  public MessageDeltaContentTextObjectText getText() {
    return text;
  }

  public void setText(MessageDeltaContentTextObjectText text) {
    this.text = text;
  }

  public MessageDeltaContentTextObject text(MessageDeltaContentTextObjectText text) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

