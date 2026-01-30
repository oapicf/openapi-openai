package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageContentTextObjectTextAnnotationsInner;

/**
 * MessageContentTextObjectText
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentTextObjectText   {
  @JsonProperty("value")
  private String value;

  @JsonProperty("annotations")
  private List<MessageContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>();

  public MessageContentTextObjectText value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The data that makes up the text.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The data that makes up the text.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MessageContentTextObjectText annotations(List<MessageContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
    return this;
  }

  public MessageContentTextObjectText addAnnotationsItem(MessageContentTextObjectTextAnnotationsInner annotationsItem) {
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @ApiModelProperty(required = true, value = "")
  public List<MessageContentTextObjectTextAnnotationsInner> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<MessageContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentTextObjectText messageContentTextObjectText = (MessageContentTextObjectText) o;
    return Objects.equals(this.value, messageContentTextObjectText.value) &&
        Objects.equals(this.annotations, messageContentTextObjectText.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextObjectText {\n");
    
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

