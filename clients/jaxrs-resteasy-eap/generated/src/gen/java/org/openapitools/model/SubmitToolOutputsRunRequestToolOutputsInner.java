package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-03T11:08:59.005260670Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SubmitToolOutputsRunRequestToolOutputsInner   {
  
  private String toolCallId;
  private String output;

  /**
   * The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
   **/
  
  @ApiModelProperty(value = "The ID of the tool call in the `required_action` object within the run object the output is being submitted for.")
  @JsonProperty("tool_call_id")
  public String getToolCallId() {
    return toolCallId;
  }
  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  /**
   * The output of the tool call to be submitted to continue the run.
   **/
  
  @ApiModelProperty(value = "The output of the tool call to be submitted to continue the run.")
  @JsonProperty("output")
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

