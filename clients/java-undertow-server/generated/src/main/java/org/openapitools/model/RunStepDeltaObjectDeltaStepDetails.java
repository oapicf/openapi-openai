/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
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
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;



/**
 * The details of the run step.
 */

@ApiModel(description = "The details of the run step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-04-14T13:39:44.119769156Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
  private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls;

  /**
   * Always `message_creation`.
   */
  public RunStepDeltaObjectDeltaStepDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `message_creation`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public RunStepDeltaObjectDeltaStepDetails messageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("message_creation")
  public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }
  public void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

  /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
   */
  public RunStepDeltaObjectDeltaStepDetails toolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. ")
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

