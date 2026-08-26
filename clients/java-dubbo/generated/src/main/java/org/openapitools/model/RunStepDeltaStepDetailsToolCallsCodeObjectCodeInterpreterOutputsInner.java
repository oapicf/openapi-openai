package org.openapitools.model;

import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of the output in the outputs array.
   */
  @JsonProperty("index")
  private Integer index;

  /**
   * Always &#x60;logs&#x60;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The text output from the Code Interpreter tool call.
   */
  @JsonProperty("logs")
  private String logs;

  @JsonProperty("image")
  private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;

  /**
   * The index of the output in the outputs array.
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always &#x60;logs&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The text output from the Code Interpreter tool call.
   * @return logs
   */
  public String getLogs() {
    return logs;
  }

  public void setLogs(String logs) {
    this.logs = logs;
  }

  /**
   * 
   * @return image
   */
  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }

  public void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.index) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type) &&
        Objects.equals(this.logs, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs) &&
        Objects.equals(this.image, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, logs, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
