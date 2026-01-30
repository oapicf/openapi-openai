package apimodels;

import apimodels.SubmitToolOutputsRunRequestToolOutputsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SubmitToolOutputsRunRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SubmitToolOutputsRunRequest   {
  @JsonProperty("tool_outputs")
  @NotNull
@Valid

  private List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs = new ArrayList<>();

  @JsonProperty("stream")
  
  private Boolean stream;

  public SubmitToolOutputsRunRequest toolOutputs(List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
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
  **/
  public List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> getToolOutputs() {
    return toolOutputs;
  }

  public void setToolOutputs(List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
    this.toolOutputs = toolOutputs;
  }

  public SubmitToolOutputsRunRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

   /**
   * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
   * @return stream
  **/
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
    return Objects.equals(toolOutputs, submitToolOutputsRunRequest.toolOutputs) &&
        Objects.equals(stream, submitToolOutputsRunRequest.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolOutputs, stream);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

