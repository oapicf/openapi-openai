package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The details of the run step.
 */
@ApiModel(description="The details of the run step.")

public class RunStepDeltaObjectDeltaStepDetails  {
  
public enum TypeEnum {

    @JsonProperty("message_creation") MESSAGE_CREATION(String.valueOf("message_creation")),
    @JsonProperty("tool_calls") TOOL_CALLS(String.valueOf("tool_calls"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  @ApiModelProperty(value = "")
  @Valid
  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;

 /**
  * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  */
  @ApiModelProperty(value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. ")
  @Valid
  private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();
 /**
  * Always &#x60;message_creation&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RunStepDeltaObjectDeltaStepDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get messageCreation
  * @return messageCreation
  */
  @JsonProperty("message_creation")
  public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }

  /**
   * Sets the <code>messageCreation</code> property.
   */
 public void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

  /**
   * Sets the <code>messageCreation</code> property.
   */
  public RunStepDeltaObjectDeltaStepDetails messageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
    return this;
  }

 /**
  * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
  * @return toolCalls
  */
  @JsonProperty("tool_calls")
  public List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
    return toolCalls;
  }

  /**
   * Sets the <code>toolCalls</code> property.
   */
 public void setToolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
  }

  /**
   * Sets the <code>toolCalls</code> property.
   */
  public RunStepDeltaObjectDeltaStepDetails toolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  /**
   * Adds a new item to the <code>toolCalls</code> list.
   */
  public RunStepDeltaObjectDeltaStepDetails addToolCallsItem(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

