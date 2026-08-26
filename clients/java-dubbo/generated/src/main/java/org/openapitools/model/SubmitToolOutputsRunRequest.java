package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SubmitToolOutputsRunRequestToolOutputsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class SubmitToolOutputsRunRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of tools for which the outputs are being submitted.
   */
  @JsonProperty("tool_outputs")
  private List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs = new ArrayList<>();

  /**
   * If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
   */
  @JsonProperty("stream")
  private Boolean stream;

  /**
   * A list of tools for which the outputs are being submitted.
   * @return toolOutputs
   */
  public List<SubmitToolOutputsRunRequestToolOutputsInner> getToolOutputs() {
    return toolOutputs;
  }

  public void setToolOutputs(List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
    this.toolOutputs = toolOutputs;
  }

  /**
   * If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
   * @return stream
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
