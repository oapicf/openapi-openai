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
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * SubmitToolOutputsRunRequestToolOutputsInner
 */
@JsonPropertyOrder({
  SubmitToolOutputsRunRequestToolOutputsInner.JSON_PROPERTY_TOOL_CALL_ID,
  SubmitToolOutputsRunRequestToolOutputsInner.JSON_PROPERTY_OUTPUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SubmitToolOutputsRunRequestToolOutputsInner   {
  public static final String JSON_PROPERTY_TOOL_CALL_ID = "tool_call_id";
  @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
  private String toolCallId;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  private String output;

  public SubmitToolOutputsRunRequestToolOutputsInner toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

  /**
   * The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
   * @return toolCallId
   **/
  @JsonProperty(value = "tool_call_id")
  @ApiModelProperty(value = "The ID of the tool call in the `required_action` object within the run object the output is being submitted for.")
  
  public String getToolCallId() {
    return toolCallId;
  }

  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  public SubmitToolOutputsRunRequestToolOutputsInner output(String output) {
    this.output = output;
    return this;
  }

  /**
   * The output of the tool call to be submitted to continue the run.
   * @return output
   **/
  @JsonProperty(value = "output")
  @ApiModelProperty(value = "The output of the tool call to be submitted to continue the run.")
  
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitToolOutputsRunRequestToolOutputsInner submitToolOutputsRunRequestToolOutputsInner = (SubmitToolOutputsRunRequestToolOutputsInner) o;
    return Objects.equals(this.toolCallId, submitToolOutputsRunRequestToolOutputsInner.toolCallId) &&
        Objects.equals(this.output, submitToolOutputsRunRequestToolOutputsInner.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCallId, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitToolOutputsRunRequestToolOutputsInner {\n");
    
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

