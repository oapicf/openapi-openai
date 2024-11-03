/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details of the tool call.
 */
@ApiModel(description = "Details of the tool call.")
@JsonPropertyOrder({
  RunStepDeltaStepDetailsToolCallsObject.JSON_PROPERTY_TYPE,
  RunStepDeltaStepDetailsToolCallsObject.JSON_PROPERTY_TOOL_CALLS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepDeltaStepDetailsToolCallsObject   {
  /**
   * Always &#x60;tool_calls&#x60;.
   */
  public enum TypeEnum {
    TOOL_CALLS("tool_calls");

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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
  @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
  private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

  public RunStepDeltaStepDetailsToolCallsObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always &#x60;tool_calls&#x60;.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "Always `tool_calls`.")
  @NotNull 
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsObject toolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public RunStepDeltaStepDetailsToolCallsObject addToolCallsItem(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

  /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
   * @return toolCalls
   **/
  @JsonProperty(value = "tool_calls")
  @ApiModelProperty(value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. ")
  @Valid 
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
    return Objects.equals(this.type, runStepDeltaStepDetailsToolCallsObject.type) &&
        Objects.equals(this.toolCalls, runStepDeltaStepDetailsToolCallsObject.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, toolCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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

