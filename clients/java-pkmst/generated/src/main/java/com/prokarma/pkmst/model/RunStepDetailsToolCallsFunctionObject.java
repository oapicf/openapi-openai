package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RunStepDetailsToolCallsFunctionObjectFunction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * RunStepDetailsToolCallsFunctionObject
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFunctionObject   {
  @JsonProperty("id")
  private String id;

  /**
   * The type of tool call. This is always going to be `function` for this type of tool call.
   */
  public enum TypeEnum {
    FUNCTION("function");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("function")
  private RunStepDetailsToolCallsFunctionObjectFunction function;

  public RunStepDetailsToolCallsFunctionObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the tool call object.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The ID of the tool call object.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDetailsToolCallsFunctionObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of tool call. This is always going to be `function` for this type of tool call.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `function` for this type of tool call.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsFunctionObject function(RunStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   */
  @ApiModelProperty(required = true, value = "")
  public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }

  public void setFunction(RunStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFunctionObject runStepDetailsToolCallsFunctionObject = (RunStepDetailsToolCallsFunctionObject) o;
    return Objects.equals(this.id, runStepDetailsToolCallsFunctionObject.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsFunctionObject.type) &&
        Objects.equals(this.function, runStepDetailsToolCallsFunctionObject.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFunctionObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

