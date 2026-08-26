package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The Code Interpreter tool call definition.
 */
public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter   {

    private String input;
    private List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.
     *
     * @param input The input to the Code Interpreter tool call.
     * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.
     */
    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(
        String input, 
        List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs
    ) {
        this.input = input;
        this.outputs = outputs;
    }



    /**
     * The input to the Code Interpreter tool call.
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
     * @return outputs
     */
    public List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<@Valid RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner> outputs) {
        this.outputs = outputs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {\n");
        
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

