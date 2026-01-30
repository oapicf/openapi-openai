package org.openapitools.model;

import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf1;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationRequestInputOneOfInner  {
  
public enum TypeEnum {

IMAGE_URL(String.valueOf("image_url")), TEXT(String.valueOf("text"));


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
  * Always `image_url`.
  */
  @ApiModelProperty(required = true, value = "Always `image_url`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  private CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;

 /**
  * A string of text to classify.
  */
  @ApiModelProperty(example = "I want to kill them", required = true, value = "A string of text to classify.")

  private String text;
 /**
   * Always &#x60;image_url&#x60;.
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

  public CreateModerationRequestInputOneOfInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get imageUrl
   * @return imageUrl
  **/
  @JsonProperty("image_url")
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  public CreateModerationRequestInputOneOfInner imageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
   * A string of text to classify.
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateModerationRequestInputOneOfInner text(String text) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

