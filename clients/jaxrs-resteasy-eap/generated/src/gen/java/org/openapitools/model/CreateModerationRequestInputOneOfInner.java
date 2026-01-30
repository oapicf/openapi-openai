package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOf1;
import org.openapitools.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationRequestInputOneOfInner   {
  

  /**
   * Always &#x60;image_url&#x60;.
   */
  public enum TypeEnum {
    IMAGE_URL("image_url"),

        TEXT("text");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;
  private String text;

  /**
   * Always &#x60;image_url&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "Always `image_url`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("image_url")
  @NotNull
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * A string of text to classify.
   **/
  
  @ApiModelProperty(example = "I want to kill them", required = true, value = "A string of text to classify.")
  @JsonProperty("text")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

