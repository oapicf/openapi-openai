/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDetailsToolCallsObjectToolCallsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * The details of the run step.
 */
@JsonPropertyOrder({
  RunStepObjectStepDetails.JSON_PROPERTY_TYPE,
  RunStepObjectStepDetails.JSON_PROPERTY_MESSAGE_CREATION,
  RunStepObjectStepDetails.JSON_PROPERTY_TOOL_CALLS
})
@JsonTypeName("RunStepObject_step_details")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepObjectStepDetails {
    /**
     * Always &#x60;message_creation&#x60;.
     */
    public enum TypeEnum {
        MESSAGE_CREATION("message_creation"),
        TOOL_CALLS("tool_calls");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_MESSAGE_CREATION = "message_creation";
    private RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

    public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
    private List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

    public RunStepObjectStepDetails(TypeEnum type, RunStepDetailsMessageCreationObjectMessageCreation messageCreation, List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
        this.type = type;
        this.messageCreation = messageCreation;
        this.toolCalls = toolCalls;
    }

    public RunStepObjectStepDetails type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;message_creation&#x60;.
     * @return type
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RunStepObjectStepDetails messageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
        return this;
    }

    /**
     * Get messageCreation
     * @return messageCreation
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
        return messageCreation;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMessageCreation(RunStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
    }

    public RunStepObjectStepDetails toolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    public RunStepObjectStepDetails addToolCallsItem(RunStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
        this.toolCalls.add(toolCallsItem);
        return this;
    }

    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
     * @return toolCalls
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<RunStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
        return toolCalls;
    }

    @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setToolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

