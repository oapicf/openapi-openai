package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsObjectToolCallsInner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the tool call.
 */
@ApiModel(description="Details of the tool call.")

public class RunStepDetailsToolCallsObject  {
  
public enum TypeEnum {

TOOL_CALLS(String.valueOf("tool_calls"));


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
  * Always `tool_calls`.
  */
  @ApiModelProperty(required = true, value = "Always `tool_calls`.")

  private TypeEnum type;

 /**
  * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  */
  @ApiModelProperty(required = true, value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. ")

  private List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();
 /**
   * Always &#x60;tool_calls&#x60;.
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

  public RunStepDetailsToolCallsObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   * @return toolCalls
  **/
  @JsonProperty("tool_calls")
  public List<RunStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public RunStepDetailsToolCallsObject toolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public RunStepDetailsToolCallsObject addToolCallsItem(RunStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
    this.toolCalls.add(toolCallsItem);
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
    RunStepDetailsToolCallsObject runStepDetailsToolCallsObject = (RunStepDetailsToolCallsObject) o;
    return Objects.equals(this.type, runStepDetailsToolCallsObject.type) &&
        Objects.equals(this.toolCalls, runStepDetailsToolCallsObject.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, toolCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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

