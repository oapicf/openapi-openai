package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubmitToolOutputsRunRequestToolOutputsInner  {
  
 /**
  * The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
  */
  @ApiModelProperty(value = "The ID of the tool call in the `required_action` object within the run object the output is being submitted for.")
  private String toolCallId;

 /**
  * The output of the tool call to be submitted to continue the run.
  */
  @ApiModelProperty(value = "The output of the tool call to be submitted to continue the run.")
  private String output;
 /**
  * The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
  * @return toolCallId
  */
  @JsonProperty("tool_call_id")
  public String getToolCallId() {
    return toolCallId;
  }

  /**
   * Sets the <code>toolCallId</code> property.
   */
 public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  /**
   * Sets the <code>toolCallId</code> property.
   */
  public SubmitToolOutputsRunRequestToolOutputsInner toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

 /**
  * The output of the tool call to be submitted to continue the run.
  * @return output
  */
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }

  /**
   * Sets the <code>output</code> property.
   */
 public void setOutput(String output) {
    this.output = output;
  }

  /**
   * Sets the <code>output</code> property.
   */
  public SubmitToolOutputsRunRequestToolOutputsInner output(String output) {
    this.output = output;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

