/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Details of the tool call.
 **/
@ApiModel(description = "Details of the tool call.")
public class RunStepDeltaStepDetailsToolCallsObject {
  
  public enum TypeEnum {
     tool_calls, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("tool_calls")
  private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = null;

  /**
   * Always `tool_calls`.
   **/
  @ApiModelProperty(required = true, value = "Always `tool_calls`.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
   **/
  @ApiModelProperty(value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. ")
  public List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
    return toolCalls;
  }
  public void setToolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsObject runStepDeltaStepDetailsToolCallsObject = (RunStepDeltaStepDetailsToolCallsObject) o;
    return (this.type == null ? runStepDeltaStepDetailsToolCallsObject.type == null : this.type.equals(runStepDeltaStepDetailsToolCallsObject.type)) &&
        (this.toolCalls == null ? runStepDeltaStepDetailsToolCallsObject.toolCalls == null : this.toolCalls.equals(runStepDeltaStepDetailsToolCallsObject.toolCalls));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.toolCalls == null ? 0: this.toolCalls.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsObject {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  toolCalls: ").append(toolCalls).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
