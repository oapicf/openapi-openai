package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.RunToolCallObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details on the tool outputs needed for this run to continue.
 */
public class RunObjectRequiredActionSubmitToolOutputs   {

    private List<@Valid RunToolCallObject> toolCalls = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RunObjectRequiredActionSubmitToolOutputs() {
    // JSON-B / Jackson
    }

    /**
     * Create RunObjectRequiredActionSubmitToolOutputs.
     *
     * @param toolCalls A list of the relevant tool calls.
     */
    public RunObjectRequiredActionSubmitToolOutputs(
        List<@Valid RunToolCallObject> toolCalls
    ) {
        this.toolCalls = toolCalls;
    }



    /**
     * A list of the relevant tool calls.
     * @return toolCalls
     */
    public List<@Valid RunToolCallObject> getToolCalls() {
        return toolCalls;
    }

    public void setToolCalls(List<@Valid RunToolCallObject> toolCalls) {
        this.toolCalls = toolCalls;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

