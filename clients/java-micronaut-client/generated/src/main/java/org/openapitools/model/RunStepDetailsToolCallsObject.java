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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsObjectToolCallsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Details of the tool call.
 */
@JsonPropertyOrder({
  RunStepDetailsToolCallsObject.JSON_PROPERTY_TYPE,
  RunStepDetailsToolCallsObject.JSON_PROPERTY_TOOL_CALLS
})
@JsonTypeName("RunStepDetailsToolCallsObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDetailsToolCallsObject {
    /**
     * Always &#x60;tool_calls&#x60;.
     */
    public enum TypeEnum {
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

    public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
    private List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls = new ArrayList<>();

    public RunStepDetailsToolCallsObject(TypeEnum type, List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
        this.type = type;
        this.toolCalls = toolCalls;
    }

    public RunStepDetailsToolCallsObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;tool_calls&#x60;.
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

    public RunStepDetailsToolCallsObject toolCalls(List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    public RunStepDetailsToolCallsObject addToolCallsItem(RunStepDetailsToolCallsObjectToolCallsInner toolCallsItem) {
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
        RunStepDetailsToolCallsObject runStepDetailsToolCallsObject = (RunStepDetailsToolCallsObject) o;
        return Objects.equals(this.type, runStepDetailsToolCallsObject.type) &&
            Objects.equals(this.toolCalls, runStepDetailsToolCallsObject.toolCalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, toolCalls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsObject {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

