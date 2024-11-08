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
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The details of the run step.
 */
@Schema(name = "RunStepDeltaObject_delta_step_details", description = "The details of the run step.")
@JsonPropertyOrder({
  RunStepDeltaObjectDeltaStepDetails.JSON_PROPERTY_TYPE,
  RunStepDeltaObjectDeltaStepDetails.JSON_PROPERTY_MESSAGE_CREATION,
  RunStepDeltaObjectDeltaStepDetails.JSON_PROPERTY_TOOL_CALLS
})
@JsonTypeName("RunStepDeltaObject_delta_step_details")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDeltaObjectDeltaStepDetails {
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
    private RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation;

    public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
    private List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls = null;

    public RunStepDeltaObjectDeltaStepDetails(TypeEnum type) {
        this.type = type;
    }

    public RunStepDeltaObjectDeltaStepDetails type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;message_creation&#x60;.
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "Always `message_creation`.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public RunStepDeltaObjectDeltaStepDetails messageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
        return this;
    }

    /**
     * Get messageCreation
     * @return messageCreation
     */
    @Valid
    @Nullable
    @Schema(name = "message_creation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
        return messageCreation;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_CREATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation) {
        this.messageCreation = messageCreation;
    }

    public RunStepDeltaObjectDeltaStepDetails toolCalls(List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    public RunStepDeltaObjectDeltaStepDetails addToolCallsItem(RunStepDeltaStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
        if (this.toolCalls == null) {
            this.toolCalls = new ArrayList<>();
        }
        this.toolCalls.add(toolCallsItem);
        return this;
    }

    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
     * @return toolCalls
     */
    @Nullable
    @Schema(name = "tool_calls", description = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> getToolCalls() {
        return toolCalls;
    }

    @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

