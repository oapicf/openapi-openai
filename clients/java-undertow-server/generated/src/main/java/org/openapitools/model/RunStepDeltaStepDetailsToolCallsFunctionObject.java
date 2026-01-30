/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaStepDetailsToolCallsFunctionObject   {
  
  private Integer index;
  private String id;


  public enum TypeEnum {
    FUNCTION("function");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function;

  /**
   * The index of the tool call in the tool calls array.
   */
  public RunStepDeltaStepDetailsToolCallsFunctionObject index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the tool call in the tool calls array.")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * The ID of the tool call object.
   */
  public RunStepDeltaStepDetailsToolCallsFunctionObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the tool call object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The type of tool call. This is always going to be `function` for this type of tool call.
   */
  public RunStepDeltaStepDetailsToolCallsFunctionObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `function` for this type of tool call.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public RunStepDeltaStepDetailsToolCallsFunctionObject function(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("function")
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }
  public void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDeltaStepDetailsToolCallsFunctionObject runStepDeltaStepDetailsToolCallsFunctionObject = (RunStepDeltaStepDetailsToolCallsFunctionObject) o;
    return Objects.equals(index, runStepDeltaStepDetailsToolCallsFunctionObject.index) &&
        Objects.equals(id, runStepDeltaStepDetailsToolCallsFunctionObject.id) &&
        Objects.equals(type, runStepDeltaStepDetailsToolCallsFunctionObject.type) &&
        Objects.equals(function, runStepDeltaStepDetailsToolCallsFunctionObject.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsFunctionObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

