package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaContentTextObjectTextAnnotationsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageDeltaContentTextObjectText  {
  
 /**
  * The data that makes up the text.
  */
  @ApiModelProperty(value = "The data that makes up the text.")
  private String value;

  @ApiModelProperty(value = "")
  @Valid
  private List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>();
 /**
  * The data that makes up the text.
  * @return value
  */
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public MessageDeltaContentTextObjectText value(String value) {
    this.value = value;
    return this;
  }

 /**
  * Get annotations
  * @return annotations
  */
  @JsonProperty("annotations")
  public List<MessageDeltaContentTextObjectTextAnnotationsInner> getAnnotations() {
    return annotations;
  }

  /**
   * Sets the <code>annotations</code> property.
   */
 public void setAnnotations(List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
  }

  /**
   * Sets the <code>annotations</code> property.
   */
  public MessageDeltaContentTextObjectText annotations(List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Adds a new item to the <code>annotations</code> list.
   */
  public MessageDeltaContentTextObjectText addAnnotationsItem(MessageDeltaContentTextObjectTextAnnotationsInner annotationsItem) {
    this.annotations.add(annotationsItem);
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
    MessageDeltaContentTextObjectText messageDeltaContentTextObjectText = (MessageDeltaContentTextObjectText) o;
    return Objects.equals(this.value, messageDeltaContentTextObjectText.value) &&
        Objects.equals(this.annotations, messageDeltaContentTextObjectText.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextObjectText {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

