package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RunStepDetailsToolCallsFileSearchResultObjectContentInner  {
  
public enum TypeEnum {

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
  * The type of the content.
  */
  @ApiModelProperty(value = "The type of the content.")
  private TypeEnum type;

 /**
  * The text content of the file.
  */
  @ApiModelProperty(value = "The text content of the file.")
  private String text;
 /**
  * The type of the content.
  * @return type
  */
  @JsonProperty("type")
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
  public RunStepDetailsToolCallsFileSearchResultObjectContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text content of the file.
  * @return text
  */
  @JsonProperty("text")
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
  public RunStepDetailsToolCallsFileSearchResultObjectContentInner text(String text) {
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
    RunStepDetailsToolCallsFileSearchResultObjectContentInner runStepDetailsToolCallsFileSearchResultObjectContentInner = (RunStepDetailsToolCallsFileSearchResultObjectContentInner) o;
    return Objects.equals(this.type, runStepDetailsToolCallsFileSearchResultObjectContentInner.type) &&
        Objects.equals(this.text, runStepDetailsToolCallsFileSearchResultObjectContentInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchResultObjectContentInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

