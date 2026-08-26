package org.openapitools.model;

import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The details of the run step.
 */
public class RunStepDeltaObjectDeltaStepDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Always &#x60;message_creation&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("message_creation")
  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;

  /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   */
  @JsonProperty("tool_calls")
  private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

  /**
   * Always &#x60;message_creation&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return messageCreation
   */
  public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }

  public void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

  /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   * @return toolCalls
   */
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
    RunStepDeltaObjectDeltaStepDetails runStepDeltaObjectDeltaStepDetails = (RunStepDeltaObjectDeltaStepDetails) o;
    return Objects.equals(this.type, runStepDeltaObjectDeltaStepDetails.type) &&
        Objects.equals(this.messageCreation, runStepDeltaObjectDeltaStepDetails.messageCreation) &&
        Objects.equals(this.toolCalls, runStepDeltaObjectDeltaStepDetails.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, messageCreation, toolCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaObjectDeltaStepDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messageCreation: ").append(toIndentedString(messageCreation)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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
