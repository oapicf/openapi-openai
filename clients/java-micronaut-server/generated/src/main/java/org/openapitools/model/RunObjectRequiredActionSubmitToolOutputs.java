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
import org.openapitools.model.RunToolCallObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Details on the tool outputs needed for this run to continue.
 */
@Schema(name = "RunObject_required_action_submit_tool_outputs", description = "Details on the tool outputs needed for this run to continue.")
@JsonPropertyOrder({
  RunObjectRequiredActionSubmitToolOutputs.JSON_PROPERTY_TOOL_CALLS
})
@JsonTypeName("RunObject_required_action_submit_tool_outputs")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunObjectRequiredActionSubmitToolOutputs {
    public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
    private List<@Valid RunToolCallObject> toolCalls = new ArrayList<>();

    public RunObjectRequiredActionSubmitToolOutputs(List<@Valid RunToolCallObject> toolCalls) {
        this.toolCalls = toolCalls;
    }

    public RunObjectRequiredActionSubmitToolOutputs toolCalls(List<@Valid RunToolCallObject> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    public RunObjectRequiredActionSubmitToolOutputs addToolCallsItem(RunToolCallObject toolCallsItem) {
        this.toolCalls.add(toolCallsItem);
        return this;
    }

    /**
     * A list of the relevant tool calls.
     * @return toolCalls
     **/
    @NotNull
    @Schema(name = "tool_calls", description = "A list of the relevant tool calls.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid RunToolCallObject> getToolCalls() {
        return toolCalls;
    }

    @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setToolCalls(List<@Valid RunToolCallObject> toolCalls) {
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
        RunObjectRequiredActionSubmitToolOutputs runObjectRequiredActionSubmitToolOutputs = (RunObjectRequiredActionSubmitToolOutputs) o;
        return Objects.equals(this.toolCalls, runObjectRequiredActionSubmitToolOutputs.toolCalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolCalls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunObjectRequiredActionSubmitToolOutputs {\n");
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

