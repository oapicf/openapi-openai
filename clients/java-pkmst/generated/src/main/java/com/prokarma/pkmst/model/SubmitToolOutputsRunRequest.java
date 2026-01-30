package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.SubmitToolOutputsRunRequestToolOutputsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SubmitToolOutputsRunRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SubmitToolOutputsRunRequest   {
  @JsonProperty("tool_outputs")
  
  private List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs = new ArrayList<>();

  @JsonProperty("stream")
  private Boolean stream;

  public SubmitToolOutputsRunRequest toolOutputs(List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
    this.toolOutputs = toolOutputs;
    return this;
  }

  public SubmitToolOutputsRunRequest addToolOutputsItem(SubmitToolOutputsRunRequestToolOutputsInner toolOutputsItem) {
    if (this.toolOutputs == null) {
      this.toolOutputs = new ArrayList<>();
    }
    this.toolOutputs.add(toolOutputsItem);
    return this;
  }

  /**
   * A list of tools for which the outputs are being submitted.
   * @return toolOutputs
   */
  @ApiModelProperty(required = true, value = "A list of tools for which the outputs are being submitted.")
  public List<SubmitToolOutputsRunRequestToolOutputsInner> getToolOutputs() {
    return toolOutputs;
  }

  public void setToolOutputs(List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
    this.toolOutputs = toolOutputs;
  }

  public SubmitToolOutputsRunRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  /**
   * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
   * @return stream
   */
  @ApiModelProperty(value = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ")
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitToolOutputsRunRequest submitToolOutputsRunRequest = (SubmitToolOutputsRunRequest) o;
    return Objects.equals(this.toolOutputs, submitToolOutputsRunRequest.toolOutputs) &&
        Objects.equals(this.stream, submitToolOutputsRunRequest.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolOutputs, stream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitToolOutputsRunRequest {\n");
    
    sb.append("    toolOutputs: ").append(toIndentedString(toolOutputs)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

