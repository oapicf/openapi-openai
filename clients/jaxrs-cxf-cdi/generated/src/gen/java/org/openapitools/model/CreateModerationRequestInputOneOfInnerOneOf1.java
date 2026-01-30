package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An object describing text to classify.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An object describing text to classify.")
public class CreateModerationRequestInputOneOfInnerOneOf1   {
  

public enum TypeEnum {

    @JsonProperty("text") TEXT(String.valueOf("text"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private String text;

  /**
   * Always &#x60;text&#x60;.
   **/
  public CreateModerationRequestInputOneOfInnerOneOf1 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `text`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * A string of text to classify.
   **/
  public CreateModerationRequestInputOneOfInnerOneOf1 text(String text) {
    this.text = text;
    return this;
  }

  
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
    CreateModerationRequestInputOneOfInnerOneOf1 createModerationRequestInputOneOfInnerOneOf1 = (CreateModerationRequestInputOneOfInnerOneOf1) o;
    return Objects.equals(this.type, createModerationRequestInputOneOfInnerOneOf1.type) &&
        Objects.equals(this.text, createModerationRequestInputOneOfInnerOneOf1.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequestInputOneOfInnerOneOf1 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

