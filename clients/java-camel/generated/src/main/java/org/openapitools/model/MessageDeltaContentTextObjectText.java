package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageDeltaContentTextObjectTextAnnotationsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MessageDeltaContentTextObjectText
 */

@JsonTypeName("MessageDeltaContentTextObject_text")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-03T06:33:43.721796025Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MessageDeltaContentTextObjectText {

  private String value;

  private List<@Valid MessageDeltaContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>();

  public MessageDeltaContentTextObjectText value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The data that makes up the text.
   * @return value
   */
  
  @Schema(name = "value", description = "The data that makes up the text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MessageDeltaContentTextObjectText annotations(List<@Valid MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
    this.annotations = annotations;
    return this;
  }

  public MessageDeltaContentTextObjectText addAnnotationsItem(MessageDeltaContentTextObjectTextAnnotationsInner annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

  /**
   * Get annotations
   * @return annotations
   */
  
  @Schema(name = "annotations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annotations")
  public List<@Valid MessageDeltaContentTextObjectTextAnnotationsInner> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<@Valid MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
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

