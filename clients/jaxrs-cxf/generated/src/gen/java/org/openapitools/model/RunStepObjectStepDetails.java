package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDetailsToolCallsObjectToolCallsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details of the run step.
 */
@ApiModel(description="The details of the run step.")

public class RunStepObjectStepDetails  {
  
public enum TypeEnum {

MESSAGE_CREATION(String.valueOf("message_creation")), TOOL_CALLS(String.valueOf("tool_calls"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Always `message_creation`.
  */
  @ApiModelProperty(required = true, value = "Always `message_creation`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

 /**
  * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
  */
  @ApiModelProperty(required = true, value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. ")

  @Valid

  private List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();
 /**
   * Always &#x60;message_creation&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepObjectStepDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get messageCreation
   * @return messageCreation
  **/
  @JsonProperty("message_creation")
  @NotNull
  public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }

  public void setMessageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

  public RunStepObjectStepDetails messageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
    return this;
  }

 /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
   * @return toolCalls
  **/
  @JsonProperty("tool_calls")
  @NotNull
  public List<RunStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public RunStepObjectStepDetails toolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public RunStepObjectStepDetails addToolCallsItem(RunStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
    this.toolCalls.add(toolCallsItem);
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
    RunStepObjectStepDetails runStepObjectStepDetails = (RunStepObjectStepDetails) o;
    return Objects.equals(this.type, runStepObjectStepDetails.type) &&
        Objects.equals(this.messageCreation, runStepObjectStepDetails.messageCreation) &&
        Objects.equals(this.toolCalls, runStepObjectStepDetails.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, messageCreation, toolCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepObjectStepDetails {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

