package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaContentTextObjectTextAnnotationsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MessageDeltaContentTextObject_text")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentTextObjectText   {
  private String value;
  private @Valid List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>();

  public MessageDeltaContentTextObjectText() {
  }

  /**
   * The data that makes up the text.
   **/
  public MessageDeltaContentTextObjectText value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "The data that makes up the text.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  public MessageDeltaContentTextObjectText annotations(List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("annotations")
  @Valid public List<@Valid MessageDeltaContentTextObjectTextAnnotationsInner> getAnnotations() {
    return annotations;
  }

  @JsonProperty("annotations")
  public void setAnnotations(List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
  }

  public MessageDeltaContentTextObjectText addAnnotationsItem(MessageDeltaContentTextObjectTextAnnotationsInner annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }

    this.annotations.add(annotationsItem);
    return this;
  }

  public MessageDeltaContentTextObjectText removeAnnotationsItem(MessageDeltaContentTextObjectTextAnnotationsInner annotationsItem) {
    if (annotationsItem != null && this.annotations != null) {
      this.annotations.remove(annotationsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

