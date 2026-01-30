package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf1;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateModerationRequestInputOneOfInner  {
  
public enum TypeEnum {

    @JsonProperty("image_url") IMAGE_URL(String.valueOf("image_url")),
    @JsonProperty("text") TEXT(String.valueOf("text"));

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
  @Valid
  private CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;

 /**
  * A string of text to classify.
  */
  @ApiModelProperty(example = "I want to kill them", required = true, value = "A string of text to classify.")
  private String text;
 /**
  * Always &#x60;image_url&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CreateModerationRequestInputOneOfInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get imageUrl
  * @return imageUrl
  */
  @JsonProperty("image_url")
  @NotNull
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl getImageUrl() {
    return imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
 public void setImageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
  public CreateModerationRequestInputOneOfInner imageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
  * A string of text to classify.
  * @return text
  */
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
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

