package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object describing an image to classify.
 */
@ApiModel(description="An object describing an image to classify.")

public class CreateModerationRequestInputOneOfInnerOneOf  {
  
public enum TypeEnum {

    @JsonProperty("image_url") IMAGE_URL(String.valueOf("image_url"));

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
  public CreateModerationRequestInputOneOfInnerOneOf type(TypeEnum type) {
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
  public CreateModerationRequestInputOneOfInnerOneOf imageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
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
    CreateModerationRequestInputOneOfInnerOneOf createModerationRequestInputOneOfInnerOneOf = (CreateModerationRequestInputOneOfInnerOneOf) o;
    return Objects.equals(this.type, createModerationRequestInputOneOfInnerOneOf.type) &&
        Objects.equals(this.imageUrl, createModerationRequestInputOneOfInnerOneOf.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequestInputOneOfInnerOneOf {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

