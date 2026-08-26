package org.openapitools.model;

import org.openapitools.model.MessageDeltaContentTextObjectTextAnnotationsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MessageDeltaContentTextObjectText implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The data that makes up the text.
   */
  @JsonProperty("value")
  private String value;

  @JsonProperty("annotations")
  private List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>();

  /**
   * The data that makes up the text.
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * 
   * @return annotations
   */
  public List<MessageDeltaContentTextObjectTextAnnotationsInner> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
