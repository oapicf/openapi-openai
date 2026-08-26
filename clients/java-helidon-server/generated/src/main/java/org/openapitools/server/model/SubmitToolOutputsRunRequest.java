package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.SubmitToolOutputsRunRequestToolOutputsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SubmitToolOutputsRunRequest   {

    private List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs = new ArrayList<>();
    private Boolean stream;

    /**
     * Default constructor.
     */
    public SubmitToolOutputsRunRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SubmitToolOutputsRunRequest.
     *
     * @param toolOutputs A list of tools for which the outputs are being submitted.
     * @param stream If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
     */
    public SubmitToolOutputsRunRequest(
        List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs, 
        Boolean stream
    ) {
        this.toolOutputs = toolOutputs;
        this.stream = stream;
    }



    /**
     * A list of tools for which the outputs are being submitted.
     * @return toolOutputs
     */
    public List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> getToolOutputs() {
        return toolOutputs;
    }

    public void setToolOutputs(List<@Valid SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
        this.toolOutputs = toolOutputs;
    }

    /**
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
     * @return stream
     */
    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitToolOutputsRunRequest {\n");
        
        sb.append("    toolOutputs: ").append(toIndentedString(toolOutputs)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

