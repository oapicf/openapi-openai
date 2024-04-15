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
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The Code Interpreter tool call definition.
 */
@Schema(name = "RunStepDetailsToolCallsCodeObject_code_interpreter", description = "The Code Interpreter tool call definition.")
@JsonPropertyOrder({
  RunStepDetailsToolCallsCodeObjectCodeInterpreter.JSON_PROPERTY_INPUT,
  RunStepDetailsToolCallsCodeObjectCodeInterpreter.JSON_PROPERTY_OUTPUTS
})
@JsonTypeName("RunStepDetailsToolCallsCodeObject_code_interpreter")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunStepDetailsToolCallsCodeObjectCodeInterpreter {
    public static final String JSON_PROPERTY_INPUT = "input";
    private String input;

    public static final String JSON_PROPERTY_OUTPUTS = "outputs";
    private List<@Valid RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs = new ArrayList<>();

    public RunStepDetailsToolCallsCodeObjectCodeInterpreter(String input, List<@Valid RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
        this.input = input;
        this.outputs = outputs;
    }

    public RunStepDetailsToolCallsCodeObjectCodeInterpreter input(String input) {
        this.input = input;
        return this;
    }

    /**
     * The input to the Code Interpreter tool call.
     * @return input
     **/
    @NotNull
    @Schema(name = "input", description = "The input to the Code Interpreter tool call.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getInput() {
        return input;
    }

    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInput(String input) {
        this.input = input;
    }

    public RunStepDetailsToolCallsCodeObjectCodeInterpreter outputs(List<@Valid RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
        this.outputs = outputs;
        return this;
    }

    public RunStepDetailsToolCallsCodeObjectCodeInterpreter addOutputsItem(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner outputsItem) {
        this.outputs.add(outputsItem);
        return this;
    }

    /**
     * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.
     * @return outputs
     **/
    @NotNull
    @Schema(name = "outputs", description = "The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OUTPUTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> getOutputs() {
        return outputs;
    }

    @JsonProperty(JSON_PROPERTY_OUTPUTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOutputs(List<@Valid RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDetailsToolCallsCodeObjectCodeInterpreter runStepDetailsToolCallsCodeObjectCodeInterpreter = (RunStepDetailsToolCallsCodeObjectCodeInterpreter) o;
        return Objects.equals(this.input, runStepDetailsToolCallsCodeObjectCodeInterpreter.input) &&
            Objects.equals(this.outputs, runStepDetailsToolCallsCodeObjectCodeInterpreter.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsCodeObjectCodeInterpreter {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
