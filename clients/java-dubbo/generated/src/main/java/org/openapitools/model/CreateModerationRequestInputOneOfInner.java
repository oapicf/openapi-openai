package org.openapitools.model;

import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf1;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateModerationRequestInputOneOfInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Always &#x60;image_url&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("image_url")
  private CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;

  /**
   * A string of text to classify.
   */
  @JsonProperty("text")
  private String text;

  /**
   * Always &#x60;image_url&#x60;.
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
   * @return imageUrl
   */
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * A string of text to classify.
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
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
    CreateModerationRequestInputOneOfInner createModerationRequestInputOneOfInner = (CreateModerationRequestInputOneOfInner) o;
    return Objects.equals(this.type, createModerationRequestInputOneOfInner.type) &&
        Objects.equals(this.imageUrl, createModerationRequestInputOneOfInner.imageUrl) &&
        Objects.equals(this.text, createModerationRequestInputOneOfInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageUrl, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequestInputOneOfInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
