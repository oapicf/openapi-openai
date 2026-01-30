package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The details of the run step.
 **/
@ApiModel(description = "The details of the run step.")
@JsonTypeName("RunStepDeltaObject_delta_step_details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDeltaObjectDeltaStepDetails   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private TypeEnum type;
  private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;
  private @Valid List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

  public RunStepDeltaObjectDeltaStepDetails() {
  }

  @JsonCreator
  public RunStepDeltaObjectDeltaStepDetails(
    @JsonProperty(required = true, value = "type") TypeEnum type
  ) {
    this.type = type;
  }

  /**
   * Always &#x60;message_creation&#x60;.
   **/
  public RunStepDeltaObjectDeltaStepDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `message_creation`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public RunStepDeltaObjectDeltaStepDetails messageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("message_creation")
  @Valid public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
    return messageCreation;
  }

  @JsonProperty("message_creation")
  public void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
    this.messageCreation = messageCreation;
  }

  /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
   **/
  public RunStepDeltaObjectDeltaStepDetails toolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. ")
  @JsonProperty("tool_calls")
  @Valid public List<@Valid RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
    return toolCalls;
  }

  @JsonProperty("tool_calls")
  public void setToolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public RunStepDeltaObjectDeltaStepDetails addToolCallsItem(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }

    this.toolCalls.add(toolCallsItem);
    return this;
  }

  public RunStepDeltaObjectDeltaStepDetails removeToolCallsItem(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
    if (toolCallsItem != null && this.toolCalls != null) {
      this.toolCalls.remove(toolCallsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

