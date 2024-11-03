package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsMessageCreationObject;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsObject;
import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;

/**
 * The details of the run step.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDeltaObjectDeltaStepDetails   {
  


  public enum TypeEnum {
    MESSAGE_CREATION("message_creation"),
    TOOL_CALLS("tool_calls");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;
  private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

  public RunStepDeltaObjectDeltaStepDetails () {

  }

  public RunStepDeltaObjectDeltaStepDetails (TypeEnum type, RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation, List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.type = type;
    this.messageCreation = messageCreation;
    this.toolCalls = toolCalls;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("message_creation")
  public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }
  public void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

    
  @JsonProperty("tool_calls")
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
    return Objects.equals(type, runStepDeltaObjectDeltaStepDetails.type) &&
        Objects.equals(messageCreation, runStepDeltaObjectDeltaStepDetails.messageCreation) &&
        Objects.equals(toolCalls, runStepDeltaObjectDeltaStepDetails.toolCalls);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
