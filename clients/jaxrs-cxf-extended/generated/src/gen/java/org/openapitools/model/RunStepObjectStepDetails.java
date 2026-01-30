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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The details of the run step.
 */
@ApiModel(description="The details of the run step.")

public class RunStepObjectStepDetails  {
  
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

 /**
  * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  */
  @ApiModelProperty(required = true, value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. ")
  @Valid
  private List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();
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
  public RunStepObjectStepDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get messageCreation
  * @return messageCreation
  */
  @JsonProperty("message_creation")
  @NotNull
  public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }

  /**
   * Sets the <code>messageCreation</code> property.
   */
 public void setMessageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

  /**
   * Sets the <code>messageCreation</code> property.
   */
  public RunStepObjectStepDetails messageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
    return this;
  }

 /**
  * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
  * @return toolCalls
  */
  @JsonProperty("tool_calls")
  @NotNull
  public List<RunStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
    return toolCalls;
  }

  /**
   * Sets the <code>toolCalls</code> property.
   */
 public void setToolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
  }

  /**
   * Sets the <code>toolCalls</code> property.
   */
  public RunStepObjectStepDetails toolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  /**
   * Adds a new item to the <code>toolCalls</code> list.
   */
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

