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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * The definition of the function that was called.
 */
@JsonPropertyOrder({
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.JSON_PROPERTY_NAME,
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.JSON_PROPERTY_ARGUMENTS,
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.JSON_PROPERTY_OUTPUT
})
@JsonTypeName("RunStepDeltaStepDetailsToolCallsFunctionObject_function")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
    private String arguments;

    public static final String JSON_PROPERTY_OUTPUT = "output";
    private String output;

    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction() {
    }

    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the function.
     * @return name
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction arguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * The arguments passed to the function.
     * @return arguments
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ARGUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getArguments() {
        return arguments;
    }

    @JsonProperty(JSON_PROPERTY_ARGUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction output(String output) {
        this.output = output;
        return this;
    }

    /**
     * The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     * @return output
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_OUTPUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOutput() {
        return output;
    }

    @JsonProperty(JSON_PROPERTY_OUTPUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDeltaStepDetailsToolCallsFunctionObjectFunction runStepDeltaStepDetailsToolCallsFunctionObjectFunction = (RunStepDeltaStepDetailsToolCallsFunctionObjectFunction) o;
        return Objects.equals(this.name, runStepDeltaStepDetailsToolCallsFunctionObjectFunction.name) &&
            Objects.equals(this.arguments, runStepDeltaStepDetailsToolCallsFunctionObjectFunction.arguments) &&
            Objects.equals(this.output, runStepDeltaStepDetailsToolCallsFunctionObjectFunction.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arguments, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

