package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SubmitToolOutputsRunRequestToolOutputsInner   {

    private String toolCallId;
    private String output;

    /**
     * Default constructor.
     */
    public SubmitToolOutputsRunRequestToolOutputsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create SubmitToolOutputsRunRequestToolOutputsInner.
     *
     * @param toolCallId The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
     * @param output The output of the tool call to be submitted to continue the run.
     */
    public SubmitToolOutputsRunRequestToolOutputsInner(
        String toolCallId, 
        String output
    ) {
        this.toolCallId = toolCallId;
        this.output = output;
    }



    /**
     * The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
     * @return toolCallId
     */
    public String getToolCallId() {
        return toolCallId;
    }

    public void setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
    }

    /**
     * The output of the tool call to be submitted to continue the run.
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
        sb.append("class SubmitToolOutputsRunRequestToolOutputsInner {\n");
        
        sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
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

