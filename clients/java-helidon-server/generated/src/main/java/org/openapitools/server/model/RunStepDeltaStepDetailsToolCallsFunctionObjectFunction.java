package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The definition of the function that was called.
 */
public class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction   {

    private String name;
    private String arguments;
    private String output;

    /**
     * Default constructor.
     */
    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.
     *
     * @param name The name of the function.
     * @param arguments The arguments passed to the function.
     * @param output The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     */
    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction(
        String name, 
        String arguments, 
        String output
    ) {
        this.name = name;
        this.arguments = arguments;
        this.output = output;
    }



    /**
     * The name of the function.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The arguments passed to the function.
     * @return arguments
     */
    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    /**
     * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

