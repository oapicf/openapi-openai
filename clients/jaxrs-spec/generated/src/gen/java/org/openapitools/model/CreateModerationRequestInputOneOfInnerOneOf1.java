package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An object describing text to classify.
 **/
@ApiModel(description = "An object describing text to classify.")
@JsonTypeName("CreateModerationRequest_input_oneOf_inner_oneOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationRequestInputOneOfInnerOneOf1   {
  public enum TypeEnum {

    TEXT(String.valueOf("text"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

  public CreateModerationRequestInputOneOfInnerOneOf1() {
  }

  @JsonCreator
  public CreateModerationRequestInputOneOfInnerOneOf1(
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "text") String text
  ) {
    this.type = type;
    this.text = text;
  }

  /**
   * Always &#x60;text&#x60;.
   **/
  public CreateModerationRequestInputOneOfInnerOneOf1 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `text`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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
  @JsonProperty(required = true, value = "text")
  @NotNull public String getText() {
    return text;
  }

  @JsonProperty(required = true, value = "text")
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

